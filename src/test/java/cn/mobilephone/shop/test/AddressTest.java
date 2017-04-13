package cn.mobilephone.shop.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mobilephone.shop.dao.AddressDao;
import cn.mobilephone.shop.enity.Address;

public class AddressTest {

	ClassPathXmlApplicationContext ctx;
	@Before
	public void init(){
		ctx = new ClassPathXmlApplicationContext("spring-web.xml","spring-mybatis.xml","spring-service.xml");
	}
	
	@Test
	public void testAddAddress(){
		AddressDao aDao = ctx.getBean("addressDao",AddressDao.class);
		Address address = new Address();
		address.setAddress("广东省广州市白云区陈田社区陈田社区");
		address.setIsFirst("是");
		address.setPhoneNum("18809331234");
		address.setPostcode(12334);
		address.setReceiver("mumu");
		System.out.println(aDao.addAddress(address));
		
	}
	
	@Test
	public void testDeleteAddress(){
		AddressDao aDao = ctx.getBean("addressDao",AddressDao.class);
		System.out.println(aDao.deleteAddress(10002));
	}
	
	@Test
	public void testUpdateAddress(){
		AddressDao aDao = ctx.getBean("addressDao",AddressDao.class);
		Address address = new Address();
		address.setAddress("广东省汕头市潮阳区凤岗街道潮阳黄图盛中学");
		address.setIsFirst("否");
		address.setPhoneNum("17732123451");
		address.setPostcode(515100);
		address.setReceiver("mulin");
		address.setAddrId(10003);
		System.out.println(aDao.updateAddress(address));
	}
	
}



