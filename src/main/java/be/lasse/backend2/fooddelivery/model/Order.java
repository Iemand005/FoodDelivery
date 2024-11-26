package be.lasse.backend2.fooddelivery.model;

import java.util.*;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Dish> orderItems = new ArrayList<>();

    public Order() {}

    public Order(Customer customer, Restaurant restaurant, List<Dish> dishes, Double totalPrice, OrderStatus status) {
        this.customer = customer;
        this.restaurant = restaurant;
        this.orderItems = orderItems;
        this.totalPrice = totalPrice;
        this.status = status;
    }
}
