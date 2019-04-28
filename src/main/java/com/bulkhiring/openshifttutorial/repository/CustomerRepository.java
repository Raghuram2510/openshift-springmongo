package com.bulkhiring.openshifttutorial.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bulkhiring.openshifttutorial.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

	public Customer findByCustomerId(int id);

}
