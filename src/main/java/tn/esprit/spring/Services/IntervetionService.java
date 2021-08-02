package tn.esprit.spring.Services;

import java.util.Date;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.esprit.spring.Entity.Client;
import tn.esprit.spring.Entity.Intervention;
import tn.esprit.spring.Entity.TypeIntervention;
import tn.esprit.spring.Repository.InterventionRepository;
@Service
public class IntervetionService implements IInterventionService {

	@Autowired
	InterventionRepository interrep;
	
	@Override
	public List<Intervention> retrieveAllInterventions() {
		List<Intervention> users= (List<Intervention>) interrep.findAll();
		return users;
	}

	@Override
	public Long addIntervention(Intervention inter) {
		interrep.save(inter);
		return inter.getId();
	}

	@Override
	public Intervention addInterventions(Intervention inter) {
		interrep.save(inter);
		return inter;
	}

	@Override
	public void deleteIntervention(Long id) {
		Intervention inter=interrep.findById(id).get();
		interrep.delete(inter);
		
	}

	@Override
	public Intervention updateIntervention(Intervention inter, TypeIntervention type) {
		inter.setType(type);
		interrep.save(inter);
		return inter;
	}

	@Override
	public Intervention updateInterventions(Intervention inter) {
		return interrep.save(inter);
	}

	@Override
	public Intervention retrieveIntervention(Long id) {
		return interrep.findById(id).get();
	}

	@Override
	public long getNombreInterventionJPQL() {
		return interrep.countinter();
	}
/*
	@Override
	public List<Intervention> getInterventionByClientAndDate(Client clients, Intervention inter, Date date) {
		return interrep.getInterventionByClientAndDate(clients, inter, date);
		
	}
*/
	@Override
	public void mettreAjourTypeByInterventionIdJPQL(TypeIntervention type, long interventionId) {
		interrep.mettreAjourTypeByInterventionIdJPQL(type, interventionId);
		
	}

}
