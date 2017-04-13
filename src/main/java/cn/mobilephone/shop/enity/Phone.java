package cn.mobilephone.shop.enity;

import java.io.Serializable;

public class Phone implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1542287948027549471L;
	
	private int phoneId;
	private String phoneName; 
	private String phoneFirm; //手机厂商
	private String describe; //手机描述
	private String status;
	private int unitPrice;
	private int sales;
	private String phoneColor;
	private String phoneStorage;
	private int inventory;//库存
	private String imgUrl;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getPhoneStorage() {
		return phoneStorage;
	}
	public void setPhoneStorage(String phoneStorage) {
		this.phoneStorage = phoneStorage;
	}
	
	public int getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}
	public String getPhoneName() {
		return phoneName;
	}
	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}
	public String getPhoneFirm() {
		return phoneFirm;
	}
	public void setPhoneFirm(String phoneFirm) {
		this.phoneFirm = phoneFirm;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public int getPhonePrice() {
		return unitPrice;
	}
	public void setPhonePrice(int phonePrice) {
		this.unitPrice = phonePrice;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public String getPhoneColor() {
		return phoneColor;
	}
	public void setPhoneColor(String phoneColor) {
		this.phoneColor = phoneColor;
	}
	public int getInventory() {
		return inventory;
	}
	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	
}
