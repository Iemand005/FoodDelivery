package be.lasse.backend2.fooddelivery.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class RestaurantEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    @ManyToOne
    @JoinColumn
    private AddressEntity address;

    private String phoneNumber;

    private String name;

    private String kitchenType;

    Set<Dish> dishes;
}
