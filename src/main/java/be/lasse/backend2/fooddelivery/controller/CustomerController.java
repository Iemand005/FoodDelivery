package be.lasse.backend2.fooddelivery.controller;

import be.lasse.backend2.fooddelivery.model.Customer;
import be.lasse.backend2.fooddelivery.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/v1/customer")
public class CustomerController {

    CustomerService customerService;

    @PutMapping("register")
    public Customer register(@RequestBody Customer customerEntity) {
        return customerService.add(customerEntity);
    }
}
