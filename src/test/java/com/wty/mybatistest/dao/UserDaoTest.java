package com.wty.mybatistest.dao;

import com.wty.mybatistest.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class UserDaoTest {

	@Autowired
	private UserDao userDao;


	@Test
	public void test(){

		System.out.println(userDao.get(5));
	}


	@Test
	public void test1(){

		User user = new User();
		user.setAge(11);
		user.setName("name111");
		userDao.insert(user);
		System.out.println(user.getId());
	}
}
