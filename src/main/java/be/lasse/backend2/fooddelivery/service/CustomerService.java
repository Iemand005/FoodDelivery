package be.lasse.backend2.fooddelivery.service;

import org.springframework.stereotype.Service;

import java.util.List;

import be.lasse.backend2.fooddelivery.model.Customer;
import be.lasse.backend2.fooddelivery.repository.CustomerRepository;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository movieRepository) {
        this.customerRepository = movieRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer add(Customer customerEntity) {
        return customerRepository.save(customerEntity);
    }
}
