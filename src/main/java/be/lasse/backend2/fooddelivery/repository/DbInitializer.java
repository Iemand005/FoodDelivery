package be.lasse.backend2.fooddelivery.repository;

import be.lasse.backend2.fooddelivery.model.*;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!prod")
public class DbInitializer {
    private AddressRepository addressRepository;
    private CustomerRepository customerRepository;

    public DbInitializer(AddressRepository actorRepository, CustomerRepository movieRepository) {
        this.addressRepository = actorRepository;
        this.customerRepository = movieRepository;
    }

    @PostConstruct
    public void initialize() {
        /*var frances = new AddressEntity();
        var steve = new Actor("Steve Buscemi");
        var woody = new Actor("Woody Harrelson");

        frances = addressRepository.save(frances);
        steve = addressRepository.save(steve);
        woody = addressRepository.save(woody);

        var fargo = new Movie("Fargo", "Joel & Ethan Coen", 1996);
        var three_billboards = new Movie("Three Billboards Outside Ebbing, Missouri", "Martin McDonagh", 2017);

        fargo.addActor(frances);
        fargo.addActor(steve);

        three_billboards.addActor(frances);
        three_billboards.addActor(woody);

        customerRepository.save(fargo);
        customerRepository.save(three_billboards);*/
    }
}
