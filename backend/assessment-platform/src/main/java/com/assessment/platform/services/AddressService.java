package com.assessment.platform.services;

import com.assessment.platform.entities.Address;

public interface AddressService {
	
	Address addAddress(Address address);
	
	Address updateAddress(Address address);
	
	Address getAddressById(int addressId);

}
