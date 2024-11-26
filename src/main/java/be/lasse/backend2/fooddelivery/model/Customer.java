package be.lasse.backend2.fooddelivery.model;

import jakarta.persistence.*;

@Entity
public class CustomerEntity {
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

    protected CustomerEntity() {}

    public CustomerEntity(String firstName, String lastName, String email, AddressEntity address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public AddressEntity getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
