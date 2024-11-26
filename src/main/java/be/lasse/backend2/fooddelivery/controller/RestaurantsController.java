package be.lasse.backend2.fooddelivery.controller;

import be.lasse.backend2.fooddelivery.model.Restaurant;
import be.lasse.backend2.fooddelivery.service.RestaurantService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("api/v1/restaurants")
public class RestaurantController {

    RestaurantService restaurantService;
    
    @GetMapping("search")
    public List<Restaurant> search(@RequestParam String kitchenType, @RequestParam String town) {

        return restaurantService.getRestaurantsByKitchenTypeAndTown(kitchenType, town);
    }

    @PutMapping("order")
    public String order() {
        return "ok";
    }
}
