package generation.mx.repositories;

import org.springframework.stereotype.Repository;

import generation.mx.models.UserModel;
import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long>{
	public abstract ArrayList<UserModel> findByName(String name);
}
