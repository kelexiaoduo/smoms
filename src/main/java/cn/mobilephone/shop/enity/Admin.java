package cn.mobilephone.shop.enity;

import java.io.Serializable;

public class Admin implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2291312967201201137L;
	private int adminId;
	private String adminName;
	private String adminPwd;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPwd() {
		return adminPwd;
	}
	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}
	
}
