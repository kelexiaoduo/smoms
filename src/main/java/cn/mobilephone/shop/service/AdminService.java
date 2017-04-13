package cn.mobilephone.shop.service;

import cn.mobilephone.shop.enity.Admin;


public interface AdminService {
	
	Admin checkAdmin(String name,String pwd);
	Boolean updateAdmin(String name,String pwd);
	
	
}
