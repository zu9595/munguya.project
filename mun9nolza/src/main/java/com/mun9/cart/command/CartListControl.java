package com.mun9.cart.command;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mun9.cart.service.CartService;
import com.mun9.cart.serviceImpl.CartServiceImpl;
import com.mun9.cart.vo.CartVO;
import com.mun9.common.Control;

public class CartListControl implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		CartService svc = new CartServiceImpl();
		List<CartVO> list = svc.CartList();
		
		req.setAttribute("cartList", list);
		
		RequestDispatcher rd = req.getRequestDispatcher("cart/cartList.tiles");
			try {
				rd.forward(req, resp);
			} catch (ServletException | IOException e) {
				e.printStackTrace();
			} 
		
	}

}
