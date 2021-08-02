package tn.esprit.spring.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.Entity.Bien;
import tn.esprit.spring.Entity.Facture;
@Repository
public interface BienRepository  extends CrudRepository<Bien,Long> {

}
