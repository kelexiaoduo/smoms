package cn.mobilephone.shop.dao;


import cn.mobilephone.shop.enity.Admin;

public interface AdminDao {
	
	void saveAdmin(Admin admin);
	Admin findAdminByName(String name);
	int modifyAdminPwd(Admin admin);
	
	
}
