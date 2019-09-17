package com.sparkcw.community.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sparkcw.community.dao.MemberDAO;
import com.sparkcw.community.dto.Member;
import com.sparkcw.community.service.MemberService;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Autowired 
	MemberDAO memberDAO;
	
	@Override
	public Map<String, Object> registerMember(Member member) {
		Map<String, Object> returnValues = new HashMap<String, Object>();
		memberDAO.insertMember(member);
		return returnValues;
	}

	@Override
	public String registerMemberIdDuplicateCheck(String id) {
		return memberDAO.selectMemberId(id);
		
	}

}
