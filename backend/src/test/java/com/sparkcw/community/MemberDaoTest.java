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


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
@Transactional
public class MemberDaoTest {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberDaoTest.class);
	
	@Autowired
	MemberDAO memberDAO;
	
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
	public void insertMember() {
		memberDAO.insertMember(mem1);
		memberDAO.insertMember(mem2);
		memberDAO.insertMember(mem3);
	}
	
	@Test
	public void selectAllMember() {
		memberDAO.insertMember(mem1);
		memberDAO.insertMember(mem2);
		List<Member> members = memberDAO.selectAllMember();
		Iterator<Member> iter = members.iterator();
		while(iter.hasNext()) {
			logger.info(iter.next().getId());
		}
		
	}
	
	@Test
	public void deleteMember() {
		memberDAO.insertMember(mem1);
		memberDAO.insertMember(mem2);
		List<Member> members = memberDAO.selectAllMember();
		Iterator<Member> iter = members.iterator();
		while(iter.hasNext()) {
			logger.info("삭제 전: "+iter.next().getId());
		}
		
		memberDAO.deleteMember(members.get(1).getCode());
		members = memberDAO.selectAllMember();
		iter = members.iterator();
		while(iter.hasNext()) {
			logger.info("삭제 후: "+iter.next().getId());
		}
	}
	
	@Test
	public void updateMember() {
		memberDAO.insertMember(mem1);
		memberDAO.insertMember(mem2);
		List<Member> members = memberDAO.selectAllMember();
		Iterator<Member> iter = members.iterator();
		while(iter.hasNext()) {
			logger.info("수정 전: "+iter.next().getNickname());
		}
		
		Member updateMem = members.get(0);
		updateMem.setNickname("수정한닉네임");
		memberDAO.updateMember(updateMem);
		members = memberDAO.selectAllMember();
		iter = members.iterator();
		while(iter.hasNext()) {
			logger.info("수정 후: "+iter.next().getNickname());
		}
	}
	 
	
}
