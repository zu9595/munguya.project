package com.mun9.product.command;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mun9.common.Control;
import com.mun9.product.service.ProductService;
import com.mun9.product.serviceImpl.ProductServiceImpl;
import com.mun9.product.vo.ProductVO;

public class ProductGetCodeJson implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		ProductService svc = new ProductServiceImpl();
		String pname = req.getParameter("pname");
		
		ProductVO pcode = svc.getProductName(pname);
		
		resp.setContentType("text/json;charset=utf-8");
		Gson gson = new GsonBuilder().create();
		
		try {
			resp.getWriter().print(gson.toJson(pcode));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
