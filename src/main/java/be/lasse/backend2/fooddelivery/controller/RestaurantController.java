package be.lasse.backend2.fooddelivery.controller;

import be.lasse.backend2.fooddelivery.model.Dish;
import be.lasse.backend2.fooddelivery.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("api/v1/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("{id}/dishes")
    public List<Dish> dishes(@PathVariable long id) {
        return restaurantService.getRestaurantById(id).getDishes();
    }

    @PutMapping("{id}/order")
    public String order(@PathVariable long id) {
        return "ok";
    }

    @GetMapping("{id}/orders")
    public List<Order> getOrders(@PathVariable long id) {
        return new List<Order>();
    }
    
}
