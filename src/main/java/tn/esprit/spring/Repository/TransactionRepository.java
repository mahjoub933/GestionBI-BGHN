package tn.esprit.spring.Repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.Entity.Transaction;
@Repository
public interface TransactionRepository extends CrudRepository <Transaction,Long> {

}
