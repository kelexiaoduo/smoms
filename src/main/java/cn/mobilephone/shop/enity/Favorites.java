package cn.mobilephone.shop.enity;

import java.io.Serializable;

public class Favorites implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1296337186283458892L;

	private int fav_id;
	private int userId;
	private int phoneId;
	public int getFav_id() {
		return fav_id;
	}
	public void setFav_id(int fav_id) {
		this.fav_id = fav_id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}
	
}
