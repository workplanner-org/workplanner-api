package legends.workplanner.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import legends.workplanner.model.AppUser;



@Repository
public interface AppUserRepo extends CrudRepository<AppUser, Integer>{
    
    public AppUser findAppUserByID(int id);
    public AppUser findAppUserByUsername(String username);

}   
