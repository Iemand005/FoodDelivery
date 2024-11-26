package be.lasse.backend2.fooddelivery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import be.lasse.backend2.fooddelivery.exception.AddressNotFoundException;
import be.lasse.backend2.fooddelivery.repository.AddressRepository;
import be.lasse.backend2.fooddelivery.service.AddressService;

// MockitoExtension: enables @Mock en @InjectMocks
@ExtendWith(MockitoExtension.class)
public class ActorServiceTest {
    // @Mock: zet mock op voor elke test
    @Mock
    private AddressRepository actorRepository;

    // @InjectMocks: maak een actorService voor elke test, voorzie een mock alle argumenten
    @InjectMocks
    private AddressService actorService;

    @Test
    public void givenNoActorExistsWithId_whenActorIsDeleted_thenActorNotFoundExceptionIsThrown() {
        // Mock existsById methode
        Mockito.when(actorRepository.existsById(1L)).thenReturn(false);
        // of:
        // Mockito.doReturn(false).when(actorRepository).existsById(1L);

        // Call de methode onder test (moet throwen)
        final var exception = Assertions.assertThrows(AddressNotFoundException.class, () -> actorService.deleteActor(1L));

        // Check of exception klopt
        Assertions.assertEquals("Actor not found for id: 1", exception.getMessage());
    }

    @Test
    public void givenActorExistsWithId_whenActorIsDeleted_thenActorIsDeleted() throws AddressNotFoundException {
        // Mock existsById methode
        Mockito.when(actorRepository.existsById(1L)).thenReturn(true);
        // of:
        // Mockito.doReturn(true).when(actorRepository).existsById(1L);

        // Call de methode onder test
        actorService.deleteActor(1L);

        // Kijk na of de deleteById methode gecalld is
        Mockito.verify(actorRepository).deleteById(1L);
    }
    // Let op: zorg ervoor dat elk geval getest is (happy cases en unhappy cases!)
}
