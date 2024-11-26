package be.lasse.backend2.fooddelivery.repository;

import be.lasse.backend2.fooddelivery.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AddressRepository extends JpaRepository<Address, Long> {
    Optional<Address> findById(long id);
}
