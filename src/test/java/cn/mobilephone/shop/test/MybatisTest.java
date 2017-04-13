package cn.mobilephone.shop.test;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MybatisTest {
	ClassPathXmlApplicationContext ctx;
	@Before
	public void init(){
		ctx = new ClassPathXmlApplicationContext("spring-web.xml","spring-mybatis.xml","spring-service.xml");
	}
	
	@Test
	public void datasource(){
		DataSource ds = ctx.getBean("dataSource",DataSource.class);
		System.out.println(ds);
	}
	
	@Test
	public void sqlSessionFactory(){
		SqlSessionFactory factory = ctx.getBean("sqlSessionFactory",SqlSessionFactory.class);
		System.out.println(factory);
	}
	
	
		
		
}





