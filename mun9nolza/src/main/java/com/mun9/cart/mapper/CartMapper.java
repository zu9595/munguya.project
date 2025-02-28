package com.mun9.cart.mapper;

import java.util.List;

import com.mun9.cart.vo.CartVO;

public interface CartMapper {
	List<CartVO> selectCartList(String userId);
	int changeCnt(CartVO vo);
	int deleteCart(CartVO vo);
	int addCart(CartVO vo);
	int addCarts(CartVO vo);
	int selectOneCart(CartVO vo);
	int resetCartList(String userId);
	int addCartCheck(CartVO vo);
	int setCartList(CartVO vo);
	List<CartVO> selectOneCart2(CartVO vo);

}

