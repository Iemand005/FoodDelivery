package be.lasse.backend2.fooddelivery.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    @ManyToOne
    @JoinColumn
    private Address address;

    private String phoneNumber;

    private String name;

    private String kitchenType;

    Set<Dish> dishes;
}
