
package reto34.reto34.repository;

import reto34.reto34.ScoreInterface;
import reto34.reto34.model.Score;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ScoreRepository {
    @Autowired
        private ScoreInterface crud5;

    public List<Score> getAll(){
        return (List<Score>) crud5.findAll();
    }
    
    public Optional <Score> getScore(int id){
        return crud5.findById(id);
    }
    
    public Score save(Score score){
        return crud5.save(score);
    }
    public void delete(Score score){
        crud5.delete(score);
    }
}
