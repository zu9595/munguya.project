package com.mun9.member.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mun9.common.DataSource;
import com.mun9.member.mapper.MemberMapper;
import com.mun9.member.service.MemberService;
import com.mun9.member.vo.MemberVO;

public class MemberServiceImpl implements MemberService {

	SqlSession session = DataSource.getInstance().openSession(true);
	MemberMapper mapper = session.getMapper(MemberMapper.class);

	@Override
	public boolean addMember(MemberVO vo) {
		return mapper.insertMember(vo) == 1;
	}
	@Override
	public boolean idCheck(String userId) {
		return mapper.selectIdCheck(userId) == 1;
	}
	

	@Override
	public List<MemberVO> memberList() {
		return mapper.selectList();
	}

	@Override
	public MemberVO login(String userId, String userPw) {
		return mapper.selectMember(userId, userPw);
	}

	@Override
	public boolean delMember(String userId, String userPw) {
		return mapper.deleteMember(userId, userPw) == 1;
	}

	@Override
	public String findId(String userName, String email) {
		return mapper.selectId(userName, email);
	}

	@Override
	public String findPw(String userId, String userName, String email) {
		return mapper.selectPw(userId, userName, email);
	}

	@Override
	public MemberVO kakaologin(String email, String userName) {
		return mapper.kakaoSelectMember(email, userName);
	}

	//회원정보수정
	@Override
	public MemberVO memInfo(String userId) {
		return mapper.selectInfo(userId);
	}
	@Override
	public boolean memInfoMod(MemberVO vo) {
		return mapper.updateInfo(vo) == 1;
	}



	

	





	



}
