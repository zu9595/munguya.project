package com.mun9.member.vo;

import lombok.Data;

@Data
public class MemberVO {

	private String userId;
	private String userPw;
	private String userName;
	
	private String gender;
	private String phoneNum;

	private String email;
	private String status;
	
}
