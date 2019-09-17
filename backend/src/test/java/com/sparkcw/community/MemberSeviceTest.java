package com.sparkcw.community;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.sparkcw.community.dao.MemberDAO;
import com.sparkcw.community.dto.Member;
import com.sparkcw.community.service.MemberService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
@Transactional
public class MemberSeviceTest {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberSeviceTest.class);
	
	@Autowired
	MemberDAO memberDAO;
	@Autowired
	MemberService memberService;
	
	Member mem1;
	Member mem2;
	Member mem3;
	
	@Before
	
	public void setUp() {
		try {

			mem1 = new Member( "aaa11", "aaaa11", "길동닉",  "aaa@na.com" );
			mem2 = new Member("bbb22", "bbbb22",  "순신닉",  "bbb@na.com" );
			mem3 = new Member("ccc33", "cccc33",  "관순닉", "ccc@na.com");
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void MemberIdDuplicateCheck() {
		memberService.registerMember(mem1);
		logger.info(memberService.registerMemberIdDuplicateCheck(mem1.getId()));
		logger.info(memberService.registerMemberIdDuplicateCheck(mem2.getId()));

	}
	 
	
}
