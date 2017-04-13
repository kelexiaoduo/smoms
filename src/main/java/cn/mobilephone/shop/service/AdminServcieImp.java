package cn.mobilephone.shop.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.mobilephone.shop.dao.AdminDao;
import cn.mobilephone.shop.enity.Admin;

@Service("adminService")
public class AdminServcieImp implements AdminService {

	@Resource
	private AdminDao adminDao;
	
	public Admin checkAdmin(String name,String pwd) {
		Admin admin = adminDao.findAdminByName(name);
		if(admin.getAdminPwd().equals(pwd)){
			return admin;
		}
		return null;
	}

	public Boolean updateAdmin(String name, String pwd) {
		Admin admin = new Admin();
		admin.setAdminName(name);
		admin.setAdminPwd(pwd);
		int i = adminDao.modifyAdminPwd(admin);
		Boolean b = null;
		if(i==1){
			b = true;
		}else{
			b = false;
		}
		return b;
	}

}
