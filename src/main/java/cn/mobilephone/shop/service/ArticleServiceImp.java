package cn.mobilephone.shop.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.mobilephone.shop.dao.ArticleDao;
import cn.mobilephone.shop.enity.Article;

@Service("articleService")
public class ArticleServiceImp implements ArticleService {

	@Resource
	ArticleDao articleDao;
	public boolean insertArticle(Article article) {
		int i = articleDao.publishArticle(article);
		if(i==1){
			return true;
		}
		return false;
	}

}
