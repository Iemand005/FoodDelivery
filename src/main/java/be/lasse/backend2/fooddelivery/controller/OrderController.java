package be.lasse.backend2.fooddelivery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping("api/v1/orders")
public class OrderController {

    @GetMapping
    public List<Object> getOrders() {
        return new List();
    }
    
    @PostMapping("{id}/confirm")
    public String confirmOrder(@PathVariable Long id) {
        //TODO: process POST request
        
        return "";
    }

    @PostMapping("{id}/cancel")
    public String cancelOrder(@PathVariable Long id) {
        //TODO: process POST request
        
        return "";
    }
    
    
}
