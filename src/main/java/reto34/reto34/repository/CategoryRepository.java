
package reto34.reto34.repository;

import reto34.reto34.CategoryInterface;
import reto34.reto34.model.Category;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepository {
   @Autowired
        private CategoryInterface crud;

    public List<Category> getAll(){
        return (List<Category>) crud.findAll();
    }
    
    public Optional <Category> getCategory(int id){
        return crud.findById(id);
    }
    
    public Category save(Category category){
        return crud.save(category);
    }
    
    public void delete(Category category){
       crud.delete(category);
    }
    
}
