package cn.mobilephone.shop.enity;

import java.io.Serializable;

public class Evaluate implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2247830174759217895L;
	private int evaId;
	private int phoneId;
	private String userName;
	private String evaDetail;
	public int getEvaId() {
		return evaId;
	}
	public void setEvaId(int evaId) {
		this.evaId = evaId;
	}
	public int getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEvaDetail() {
		return evaDetail;
	}
	public void setEvaDetail(String evaDetail) {
		this.evaDetail = evaDetail;
	}
	
	
	
}
