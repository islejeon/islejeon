package org.nj.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class TimeMapperImpl implements TimeMapper {

	@Autowired
	private SqlSession session;
	
	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return session.selectOne("org.nj.dao.TimeMapper.getTime");
		
	}

}
