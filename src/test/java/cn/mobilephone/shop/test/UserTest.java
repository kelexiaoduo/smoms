package cn.mobilephone.shop.test;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mobilephone.shop.dao.UserDao;
import cn.mobilephone.shop.enity.User;

public class UserTest {
	
	ClassPathXmlApplicationContext ctx;
	@Before
	public void init(){
		ctx = new ClassPathXmlApplicationContext("spring-web.xml","spring-mybatis.xml","spring-service.xml");
	}
	@Test
	public void addUser() {
		UserDao dao = ctx.getBean("userDao",UserDao.class);
		User user = new User("木木","1234","林俊杰","男","1980-09-01","8137932");
		System.out.println(dao.addUser(user));
	}
	
	@Test
	public void findUserByName(){
		UserDao dao = ctx.getBean("userDao",UserDao.class);
		User user = dao.queryUserByName("木木");
		System.out.println(user.getUserName()+","+user.getUserPwd());
	}
	
	@Test
	public void testUpdateUser(){
		UserDao dao = ctx.getBean("userDao",UserDao.class);
		User user = new User();
		user.setUserId(10011);
		user.setUserName("木木");
		user.setUserBirth("1982-09-01");
		System.out.println(dao.updateUser(user));
	}
	
}
