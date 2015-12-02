package org.nj.dao;

import org.apache.ibatis.session.SqlSession;
import org.nj.domain.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;

public class MemberMapperImpl implements MemberMapper {
	@Autowired
	private SqlSession session;

	@Override
	public void create(MemberVO vo) throws Exception {
		session.insert("org.nj.dao.MemberMapper.create", vo);
	}

	@Override
	public MemberVO read(String userid) throws Exception {
		return session.selectOne("org.nj.dao.MemberMapper.read", userid);
	}

	@Override
	public void delete(String userid) throws Exception {
		session.delete("org.nj.dao.MemberMapper.delete", userid);
		
	}

	@Override
	public void update(MemberVO vo) throws Exception {
		session.update("org.nj.dao.MemberMapper.update", vo);
		
	}
	
	
	
	
}
