package com.example.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.model.Customer;
import com.example.domain.repository.CustomerRepository;

@Service
@Transactional
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	public List<Customer> getCustomers() {
		return customerRepository.selectAll();
	}
}
