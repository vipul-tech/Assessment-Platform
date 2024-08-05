package com.assessment.platform.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.platform.entities.Address;
import com.assessment.platform.repositories.AddressRepository;
import com.assessment.platform.services.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public Address addAddress(Address address) {
		return addressRepository.save(address);
	}

	@Override
	public Address updateAddress(Address address) {
		return addressRepository.save(address);
	}

	@Override
	public Address getAddressById(int addressId) {
		Optional<Address> optionalAddress = addressRepository.findById(addressId);

		if (optionalAddress.isPresent()) {
			return optionalAddress.get();
		} else {
			return null;
		}

	}

}
