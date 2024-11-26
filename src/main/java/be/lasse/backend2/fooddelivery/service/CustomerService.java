package be.lasse.backend2.fooddelivery.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import be.lasse.backend2.fooddelivery.model.CustomerEntity;
import be.lasse.backend2.fooddelivery.repository.CustomerRepository;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository movieRepository) {
        this.customerRepository = movieRepository;
    }

    public List<CustomerEntity> getAllCustomers() {
        return customerRepository.findAll();
    }

    public void add(CustomerEntity customerEntity) {
        customerRepository.save(customerEntity);
    }
}
