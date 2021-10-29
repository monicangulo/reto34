
package reto34.reto34;

import reto34.reto34.model.Reservation;
import org.springframework.data.repository.CrudRepository;


public interface ReservationInterface extends CrudRepository<Reservation, Integer> {
    
}
