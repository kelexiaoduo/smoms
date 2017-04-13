package cn.mobilephone.shop.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mobilephone.shop.dao.ArticleDao;
import cn.mobilephone.shop.enity.Article;

public class ArticleTest {
	
	ClassPathXmlApplicationContext ctx;
	@Before
	public void init(){
		ctx = new ClassPathXmlApplicationContext("spring-web.xml","spring-mybatis.xml","spring-service.xml");
	}
	
	@Test
	public void tetsInsertArticle(){
		ArticleDao dao = ctx.getBean("articleDao",ArticleDao.class);
		Article a = new Article();
		a.setPublisher("superadmin");
		a.setArticleTitle("令人震惊的真相");
		a.setArticleContent(" 您好！非常感谢您在百忙之中抽出宝贵时间来回答这份关于广州白云山风景区游客满意度的访谈问卷。本问卷纯属个人毕业论文资料的收集和调查，本问卷采取匿名调查的形式，不会泄露您本人的信息，请您放心如实填写。谢谢您的帮助与支持！");
		int i = dao.publishArticle(a);
		System.out.println(i);
	}
	
	@Test
	public void testFindArticleByPublisher(){
		ArticleDao dao = ctx.getBean("articleDao",ArticleDao.class);
		List<Article> list = dao.findArticleByPublisher("周杰伦");
		for(Article a:list){
			System.out.println(a.getArticleId()+","+a.getArticleTitle()+","+a.getModifyTime());
		}
	}
	
	@Test
	public void testFindArticleByTitle(){
		ArticleDao dao = ctx.getBean("articleDao",ArticleDao.class);
		List<Article> list = dao.findArticleByTitle("全");
		for(Article a:list){
			System.out.println(a.getArticleId()+","+a.getArticleTitle()+","+a.getModifyTime());
			System.out.println(a.getArticleContent());
		}
	}
	
	@Test
	public void testDeleteArticle(){
		ArticleDao dao = ctx.getBean("articleDao",ArticleDao.class);												
		int i = dao.deleteArticleByArticleId(10006);
		System.out.println(i);
	}
	
	@Test
	public void testUpdateArticle(){
		Article article = new Article();
		ArticleDao dao = ctx.getBean("articleDao",ArticleDao.class);
		article.setArticleId(10008);
		article.setArticleTitle("修改后的名字");
		int i = dao.updateArticle(article);
		System.out.println(i);
	}
	
}

