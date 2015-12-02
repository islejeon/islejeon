package org.isle.web;

import static org.junit.Assert.fail;

import org.isle.dao.TimeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})


public class TimeMapperTest {
	
	@Autowired
	private TimeMapper timeMapper;

	@Test
	public void test() {
		System.out.println(timeMapper.getTime());
	}

}
