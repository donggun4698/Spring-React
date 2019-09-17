package com.sparkcw.community.service;

import java.util.Map;

import com.sparkcw.community.dto.Member;


public interface MemberService {

	/**
	 * 회원을 등록합니다.
	 * @param member
	 * @return
	 */
	public Map<String, Object> registerMember(Member member);
	
	/**
	 * 회원의 ID의 중복여부를 확인합니다.
	 * @param id
	 * @return
	 */
	public String registerMemberIdDuplicateCheck(String id);
}
