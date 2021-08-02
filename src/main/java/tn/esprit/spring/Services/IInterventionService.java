package tn.esprit.spring.Services;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.spring.Entity.Client;
import tn.esprit.spring.Entity.Intervention;
import tn.esprit.spring.Entity.TypeIntervention;



public interface IInterventionService {

	List<Intervention> retrieveAllInterventions();
	Long addIntervention(Intervention inter);
	Intervention addInterventions(Intervention inter);
	void deleteIntervention(Long id);
	Intervention updateIntervention(Intervention inter,TypeIntervention type);
	public Intervention updateInterventions(Intervention inter);
	Intervention retrieveIntervention(Long id);
	public long getNombreInterventionJPQL();
	/*public List<Intervention> getInterventionByClientAndDate(Client clients, Intervention inter, 
			Date date);*/
	public void mettreAjourTypeByInterventionIdJPQL(TypeIntervention type, long interventionId);
	
}
