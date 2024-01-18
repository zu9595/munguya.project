package com.mun9.cart.command;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mun9.cart.service.CartService;
import com.mun9.cart.serviceImpl.CartServiceImpl;
import com.mun9.cart.vo.CartVO;
import com.mun9.common.Control;

public class ModCartCntJson implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		String userId = req.getParameter("userId");
		String myproCnt = req.getParameter("cnt");
		String proCode = req.getParameter("proCode");
		
		CartService svc = new CartServiceImpl();
		
		CartVO vo = new CartVO();
		vo.setUserId(userId);
		vo.setMyproCnt(Integer.parseInt(myproCnt));
		vo.setProCode(Integer.parseInt(proCode));
		
		Map<String,Object> map = new HashMap<String,Object>();
		if(svc.changeMyproCnt(vo)) {
			map.put("retCode", "OK");
		}else {
			map.put("retCode", "NG");
		}
		
		Gson gson = new GsonBuilder().create();
		
		try {
			resp.getWriter().print(gson.toJson(map));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
