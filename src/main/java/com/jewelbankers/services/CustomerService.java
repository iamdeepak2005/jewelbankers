package com.jewelbankers.services;

import com.jewelbankers.entity.Customer;
import com.jewelbankers.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Objects;

@Service
public class CustomerService {

	
	@Autowired
	private CustomerRepository customerRepository;
    private List<Customer> customers;

    public CustomerService() {
        //this.customers = buildFakeCustomers();
    }

	/*
	 * private List<Customer> buildFakeCustomers() { Customer c1 = new
	 * Customer(1L,"John Doe", "john@example.com", "1234567890"); Customer c2 = new
	 * Customer(2L,"Jane Smith", "jane@example.com", "0987654321"); Customer c3 =
	 * new Customer(3L,"Michael Johnson", "michael@example.com", "1122334455");
	 * Customer c4 = new Customer(4L,"Patricia Brown", "patricia@example.com",
	 * "6677889900"); Customer c5 = new Customer(5L,"Linda Davis",
	 * "linda@example.com", "2233445566");
	 * 
	 * return List.of(c1, c2, c3, c4, c5); }
	 */

    public List<Customer> findAll() {
    	return customerRepository.findAll();
        //return this.customers;
    }

	
	  public Optional<Customer> findById(Long id) { return this.customerRepository.findById(id); }

	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}
	 
}
