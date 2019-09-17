package com.sparkcw.community.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sparkcw.community.dto.Member;
import com.sparkcw.community.service.MemberService;

@RequestMapping(value="/api")
@RestController
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value = "/members", method = RequestMethod.POST)
	public Member join(@RequestBody Member member) {
		memberService.registerMember(member);
		return member;
	}
	
	@RequestMapping(value = "/members1", method = RequestMethod.GET)
	public Member test2(@RequestBody Member member) {
		Member mem = new Member("id", "pw", "nickname", "email");
		logger.info("test1");
		return member;
	}
	@RequestMapping(value = "/members2", method = RequestMethod.POST)
	public String test2() {
		Member mem = new Member("id", "pw", "nickname", "email");
		logger.info("test2");
		return "test2";
	}
	
	@RequestMapping(value = "/members3", method = RequestMethod.GET)
	public String test3() {
		Member mem = new Member("id", "pw", "nickname", "email");
		logger.info("test3임");
		return "test3";
	}
	@RequestMapping(value = "/members4", method = RequestMethod.POST)
	public String test4() {
		Member mem = new Member("id", "pw", "nickname", "email");
		logger.info("test4임"); 
		return "test4";
	}
}
