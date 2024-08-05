package com.assessment.platform.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assessment.platform.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
