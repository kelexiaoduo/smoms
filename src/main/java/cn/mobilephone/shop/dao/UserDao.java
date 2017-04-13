package cn.mobilephone.shop.dao;

import cn.mobilephone.shop.enity.User;

public interface UserDao {
	
	User queryUserByName(String name);
	int addUser(User user);
	int updateUser(User user);
	
}
