package repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import entities.EquipoEntity;

@Repository
public interface EquipoRepository extends JpaRepository<EquipoEntity, Serializable> {

	/* This method search in database by id. */
	   public EquipoEntity findById(Integer id);
}
