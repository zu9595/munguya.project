package com.mun9.orderdetail.command;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mun9.cart.service.CartService;
import com.mun9.cart.serviceImpl.CartServiceImpl;
import com.mun9.cart.vo.CartVO;
import com.mun9.common.Control;
import com.mun9.member.service.MemberService;
import com.mun9.member.serviceImpl.MemberServiceImpl;
import com.mun9.member.vo.MemberVO;

public class OrderDetailFormControl implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		
		HttpSession session = req.getSession();
		String userId = (String)session.getAttribute("logId");
		
		CartService csvc = new CartServiceImpl();
		List<CartVO> clist = csvc.selectCartList(userId);
		
		MemberService msvc = new MemberServiceImpl();
		MemberVO minfo = msvc.memInfo(userId);
		
		int priceSum = 0;
		for(CartVO singleCart : clist) {
			if(singleCart.getProDiscount() == 0) {
				priceSum += (singleCart.getProPrice()*singleCart.getMyproCnt());
			} else {
				priceSum += (singleCart.getProDiscount()*singleCart.getMyproCnt());
			}
		}
		
		req.setAttribute("userId", userId);
		req.setAttribute("memberInfo", minfo);
		req.setAttribute("cartList", clist);
		req.setAttribute("orderSum", priceSum);
		
		//페이지이동
		RequestDispatcher rd = req.getRequestDispatcher("order/orderDetail.tiles");
		try {
			rd.forward(req, resp);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}

}
