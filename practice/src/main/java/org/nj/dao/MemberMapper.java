package org.nj.dao;

import org.nj.domain.MemberVO;

public interface MemberMapper {

	public void create(MemberVO vo)throws Exception;
	public MemberVO read(String userid) throws Exception;
	public void delete(String userid)throws Exception;
	public void update(MemberVO vo) throws Exception;
}


