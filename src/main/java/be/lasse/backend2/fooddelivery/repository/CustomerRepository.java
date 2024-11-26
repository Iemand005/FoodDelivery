package be.lasse.backend2.fooddelivery.repository;

import be.lasse.backend2.fooddelivery.model.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

}
