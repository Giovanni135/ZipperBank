package io.zipcoder.service;

import io.zipcoder.domain.Customer;
import io.zipcoder.repositories.CustomerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class CustomerService {

    @Inject
    private CustomerRepository customerRepository;


    public ResponseEntity<Iterable<Customer>> getCustomers() {
        Iterable<Customer> allAccounts = customerRepository.findAll();
        return new ResponseEntity<>(allAccounts, HttpStatus.OK);
    }


    public ResponseEntity<?> getCustomerById() {
        Customer c = customerRepository.findOne();
        return new ResponseEntity<>(c, HttpStatus.OK);
    }

    public ResponseEntity<?> createCustomer() {
        customer = customerRepository.save(customer);
        return new ResponseEntity<>(customer, HttpStatus.CREATED);
    }

    public ResponseEntity<?> updateCustomer(Customer customer){
        customerRepository.updateCustomer(customer);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    public ResponseEntity<?> deleteCustomer(){
        customerRepository.removeCustomerById();
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
