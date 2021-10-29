
package reto34.reto34;

import reto34.reto34.model.Message;
import org.springframework.data.repository.CrudRepository;


public interface MessageInterface extends CrudRepository<Message, Integer>{
    
}
