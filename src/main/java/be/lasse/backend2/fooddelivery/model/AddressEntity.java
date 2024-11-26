package be.lasse.backend2.fooddelivery.entity;

import jakarta.persistence.*;

@Entity
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String street;
    Integer houseNumber;
    Integer postalCode;
    String townName;
}
