package tn.esprit.spring.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.Entity.Service;
@Repository
public interface ServiceRepository  extends CrudRepository<Service,Long> {

}
