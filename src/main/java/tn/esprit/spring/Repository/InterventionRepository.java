package tn.esprit.spring.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.Entity.Client;
import tn.esprit.spring.Entity.Intervention;
import tn.esprit.spring.Entity.TypeIntervention;
@Repository
public interface InterventionRepository  extends CrudRepository<Intervention,Long> {

	@Query("SELECT count(*) FROM Intervention")
    public long countinter();
	 @Query("SELECT type FROM Intervention")
	    public List<String> interventiontype();
	 @Modifying
	 @Transactional
	    @Query("UPDATE Intervention e SET e.type=:type1 where e.id=:interventionId")
	    public void mettreAjourTypeByInterventionIdJPQL(@Param("type1")TypeIntervention type, @Param("interventionId")long interventionId);
	 
	/* @Query("Select i from Intervention i "
				+ "where i.clients=:cl and "
				+ "i.intervention=:inter and "
				+ "i.date=:dateD")
	 public List<Intervention> getInterventionByClientAndDate(@Param("cl")Client clients, @Param("inter")Intervention intervention, @Param("dateD")Date date);
 */
}
