package cn.mobilephone.shop.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mobilephone.shop.dao.AdminDao;
import cn.mobilephone.shop.enity.Admin;
import cn.mobilephone.shop.service.AdminService;

public class AdminTest {

	ClassPathXmlApplicationContext ctx;
	@Before
	public void init(){
		ctx = new ClassPathXmlApplicationContext("spring-web.xml","spring-mybatis.xml","spring-service.xml");
	}
	
	@Test
	public void testAddAdmin(){
		Admin admin = new Admin();
		AdminDao adminDao  = ctx.getBean("adminDao",AdminDao.class);
		admin.setAdminName("周杰伦");
		admin.setAdminPwd("root");
		adminDao.saveAdmin(admin);
	}
	
	@Test
	public void testFindAdmin(){
		Admin admin = new Admin();
		AdminDao adminDao  = ctx.getBean("adminDao",AdminDao.class);
		admin = adminDao.findAdminByName("superadmin");
		System.out.println(admin.getAdminId()+","+admin.getAdminPwd());
	}	
	
	@Test
	public void testCheckAdmin(){
		AdminService adminService = ctx.getBean("adminService",AdminService.class);
		Admin b = adminService.checkAdmin("周杰伦", "root");
		System.out.println(b.getAdminId()+"");
	}
	
	@Test
	public void testUpdateAdmin(){
		Admin admin = new Admin();
		AdminDao adminDao  = ctx.getBean("adminDao",AdminDao.class);
		admin.setAdminName("周杰伦");
		admin.setAdminPwd("1234");
		int i = adminDao.modifyAdminPwd(admin);
		System.out.println(i);
	}
	@Test
	public void testUpdateAdminService(){
		AdminService adminService = ctx.getBean("adminService",AdminService.class);
		Boolean b = adminService.updateAdmin("周杰伦", "root");
		System.out.println(b);
	}
	
}
