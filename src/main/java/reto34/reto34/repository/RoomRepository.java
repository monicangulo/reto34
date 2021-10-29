
package reto34.reto34.repository;

import reto34.reto34.RoomInterface;
import reto34.reto34.model.Rooms;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RoomRepository {
      @Autowired
    private RoomInterface crud;

    public List<Rooms> getAll(){
        return (List<Rooms>) crud.findAll();
    }
    
    public Optional <Rooms> getRoom(int id){
        return crud.findById(id);
    }
    
    public Rooms save(Rooms rooms){
        return crud.save(rooms);
    }
    public void delete(Rooms rooms){
        crud.delete(rooms);
    }
}
