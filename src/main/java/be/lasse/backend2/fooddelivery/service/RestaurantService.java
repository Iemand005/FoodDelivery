package be.lasse.backend2.fooddelivery.service;

import be.lasse.backend2.fooddelivery.model.Restaurant;
import be.lasse.backend2.fooddelivery.repository.RestaurantRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;

    RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    public List<Restaurant> getRestaurantsByKitchenTypeAndTown(String kitchenType, String town) {
        List<Restaurant> restaurants;

        restaurants = new ArrayList<>();



        return restaurants;
    }

    public Restaurant getRestaurantById(long id) {
        return restaurantRepository.findById(id).get();
    }

}
