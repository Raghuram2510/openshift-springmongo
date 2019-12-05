package com.bulkhiring.openshifttutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bulkhiring.openshifttutorial.model.Customer;
import com.bulkhiring.openshifttutorial.repository.CustomerRepository;

@RestController
public class CustomerServiceController {

	@Autowired
	private CustomerRepository repository;

	@RequestMapping(value = "/ping")
	public String test() {
		return "Ping Service Successful";
	}

	@RequestMapping(value = "/newcustomer", method = RequestMethod.POST)
	public String newCustomer(@RequestBody Customer customer) {
		if (null != customer) {
			repository.save(customer);
			return "SUCCESS";
		}
		return "FAILURE";
	}

	@RequestMapping("/customer/{id}")
	public Customer getCustomerDetailsById(@PathVariable("id") int customerId) {
		System.out.println(customerId);
		Customer customer = null;
		if (customerId > 0) {
			customer = repository.findByCustomerId(customerId);
		}

		return customer;

	}

}
