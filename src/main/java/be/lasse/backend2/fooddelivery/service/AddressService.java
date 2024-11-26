package be.lasse.backend2.fooddelivery.service;

import be.lasse.backend2.fooddelivery.model.Address;
import be.lasse.backend2.fooddelivery.repository.AddressRepository;

import org.springframework.stereotype.Service;

import java.util.List;

import be.lasse.backend2.fooddelivery.exception.AddressNotFoundException;

@Service
public class AddressService {
    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public List<Address> getAllActors() {
        return addressRepository.findAll();
    }

    public Address getAddressById(long id) throws AddressNotFoundException {
        return addressRepository.findById(id).orElseThrow(() -> new AddressNotFoundException(id));
    }
}
