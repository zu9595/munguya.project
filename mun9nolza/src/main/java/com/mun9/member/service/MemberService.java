package com.mun9.member.service;

import java.util.List;

import com.mun9.member.vo.MemberVO;

public interface MemberService {
	
	public boolean addMember(MemberVO vo);
	public List<MemberVO> memberList();
	
}
