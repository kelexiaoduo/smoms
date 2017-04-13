package cn.mobilephone.shop.enity;

import java.io.Serializable;
import java.sql.Date;

public class Article implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1468694332791563666L;

	private int articleId;
	private String articleContent;
	private String publisher;
	private Date modifyTime;
	private String articleTitle;
	
	public String getArticleTitle() {
		return articleTitle;
	}
	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public String getArticleContent() {
		return articleContent;
	}
	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	
	
}
