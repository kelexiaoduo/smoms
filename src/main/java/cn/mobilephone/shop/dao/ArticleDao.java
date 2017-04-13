package cn.mobilephone.shop.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.mobilephone.shop.enity.Article;

@Transactional
public interface ArticleDao {
	
	int publishArticle(Article article);
	List<Article> findArticleByPublisher(String publisher);
	List<Article> findArticleByTitle(String title);
	int deleteArticleByArticleId(int id);
	int updateArticle(Article article);
	
}
