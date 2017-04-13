package cn.mobilephone.shop.enity;

import java.io.Serializable;

public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 225307703053016280L;
	private int userId;
	private String userName;
	private String userPwd;
	private String userRealName;
	private String userSex;
	private String userBirth;
	private String userPhoneNum;
	
	public User() {
		super();
	}

	public User(String userName, String userPwd, String userRealName,
			String userSex, String userBirth, String userPhoneNum) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
		this.userRealName = userRealName;
		this.userSex = userSex;
		this.userBirth = userBirth;
		this.userPhoneNum = userPhoneNum;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	
	public String getUserRealName() {
		return userRealName;
	}

	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}

	
	public String getUserBirth() {
		return userBirth;
	}

	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}

	public String getUserPhoneNum() {
		return userPhoneNum;
	}
	public void setUserPhoneNum(String userPhoneNum) {
		this.userPhoneNum = userPhoneNum;
	}
	
}
