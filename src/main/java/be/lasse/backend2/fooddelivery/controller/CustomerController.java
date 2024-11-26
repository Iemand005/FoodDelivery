package be.lasse.backend2.fooddelivery.controller;

import be.lasse.backend2.fooddelivery.model.CustomerEntity;
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
    public CustomerEntity register(@RequestBody CustomerEntity customerEntity) {
        customerService.add(customerEntity);
        return customerEntity;
    }
}
