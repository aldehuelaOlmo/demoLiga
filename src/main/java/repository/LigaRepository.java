package repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.LigaEntity;

@Repository
public interface LigaRepository extends JpaRepository<LigaEntity, Serializable> {

	 /* This method search in database by id. */
	   public LigaEntity findById(Integer id);
}
