package tn.esprit.spring.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.Entity.Facture;
@Repository
public interface FactureRepository  extends CrudRepository<Facture,Long> {
	
	@Query("SELECT count(*) FROM Facture")
    public long countfact();
	
	
	

	

}
