package repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.JugadorEntity;

@Repository
public interface JugadorRepository extends JpaRepository<JugadorEntity, Serializable>{

	/* This method search in database by id. */
	   public JugadorEntity findById(Integer id);
}
