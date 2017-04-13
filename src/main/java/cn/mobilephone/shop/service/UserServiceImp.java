package cn.mobilephone.shop.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.mobilephone.shop.dao.UserDao;
import cn.mobilephone.shop.enity.User;

@Service("userService")
public class UserServiceImp implements UserService {
	
	@Resource
	UserDao userDao;
	
	public User findUserByName(String name) {
		User user = userDao.queryUserByName(name);
		return user;
	}

}
