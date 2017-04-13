package cn.mobilephone.shop.dao;

import cn.mobilephone.shop.enity.Address;

public interface AddressDao {

	int addAddress(Address address);
	int deleteAddress(int addrId);
	int updateAddress(Address address);
	
}
