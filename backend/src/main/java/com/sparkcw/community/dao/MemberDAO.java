package com.sparkcw.community.dao;

import java.util.List;

import com.sparkcw.community.dto.Member;

public interface MemberDAO {
	
	/**
	 * 멤버를 추가
	 * @param member
	 */
	public void insertMember(Member member);
	
	/**
	 * 특정멤버를 삭제
	 * @param memberCode
	 */
	public void deleteMember(int memberCode);
	
	/**
	 * 멤버의 정보를 수정
	 * @param member
	 */
	public void updateMember(Member member);
	
	/**
	 * 전체멤버의 목록을 가져옵니다.
	 * @return List&ltmember&gt
	 */
	public List<Member> selectAllMember();
	
	/**
	 * 입력된 ID와 일치하는 ID가 존재하는지 조회합니다.
	 * @param memberId
	 * @return 동일한 ID 존재시 ID를 , 부재시 null값을 반환합니다.
	 */
	public String selectMemberId(String memberId);
}
