package org.isle.persistence;

import org.isle.domain.MemberVO;
import org.isle.util.TimeUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})

public class MemberMapperTest {

	@Autowired
	private MemberMapper mapper;
	
	@Test
	public void createTest() throws Exception{
		MemberVO vo = new MemberVO();
		vo.setUserid("user");
		vo.setUpw("user");
		vo.setUname("hhh");
		vo.setPhone("222");
		vo.setGender("f");
		vo.setEmail("kkk");
		vo.setBirth(TimeUtil.getDate(2015, 9, 13));
		mapper.create(vo);
	}
	
	@Test
	public void readTest()throws Exception {
		System.out.println(mapper.read("user"));
	}
	@Test
	public void updateTest()throws Exception {
		MemberVO vo = mapper.read("u004");
		vo.setGender("m");
		mapper.update(vo);
	}
		
	@Test
	public void deleteTest()throws Exception{
		mapper.delete("user");
	}

}
