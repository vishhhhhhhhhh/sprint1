package com.capg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.entity.Customer;

@Repository 
public interface ICustomerRepository extends JpaRepository <Customer, String>{

  
	
}