package be.lasse.backend2.fooddelivery.repository;

import be.lasse.backend2.fooddelivery.model.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AddressRepository extends JpaRepository<AddressEntity, Long> {
    Optional<AddressEntity> findById(long id);
}
