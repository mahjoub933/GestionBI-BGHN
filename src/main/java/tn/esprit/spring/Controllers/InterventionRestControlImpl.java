package tn.esprit.spring.Controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.Entity.Intervention;
import tn.esprit.spring.Entity.TypeIntervention;
import tn.esprit.spring.Services.IInterventionService;


@RestController
public class InterventionRestControlImpl {

	
	@Autowired
	 IInterventionService interService;

	//http://localhost:8081/SpringMVC/servlet/retrieve-all-interventions
	 @GetMapping("/retrieve-all-interventions")
	public List<Intervention> getInterventions() {
	List<Intervention> list = interService.retrieveAllInterventions();
	return list;
	}
	//http://localhost:8081/SpringMVC/servlet/retrieve-intervention/{intervention-id}
	 @GetMapping("/retrieve-intervention/{intervention-id}")

	 public Intervention retrieveIntervention(@PathVariable("intervention-id") Long interventionId){
		 return interService.retrieveIntervention(interventionId);
	 }
	//Ajouter intervention : http://localhost:8081/SpringMVC/servlet/add-intervention
	 @PostMapping("/add-intervention")

	 public Intervention addIntervention(@RequestBody Intervention i){
		 Intervention intervention=interService.addInterventions(i);
		 return intervention;
	 }
	//http://localhost:8081/SpringMVC/servlet/remove-intervention/{intervention-id}
	 @DeleteMapping("/remove-intervention/{intervention-id}")
	 
	 public void removeIntervention(@PathVariable("intervention-id")Long interventionId){
		 interService.deleteIntervention(interventionId);
	 }
	//http://localhost:8081/SpringMVC/servlet/modify-intervention
	 @PutMapping("/modify-intervention")
	 
	 public Intervention modifyIntervention(@RequestBody Intervention intervention){
		 return interService.updateInterventions(intervention);
	 }
	// URL : http://localhost:8081/SpringMVC/servlet/getNombreInterventionJPQL
	    @GetMapping(value = "getNombreInterventionJPQL")
		public long getNombreInterventionJPQL() {
	    	return interService.getNombreInterventionJPQL();
	    }
	 // Modifier type : http://localhost:8081/SpringMVC/servlet/mettreAjourTypeByInterventionIdJPQL/2/newtype
	 	@PutMapping (value = "/mettreAjourTypeByInterventionIdJPQL/{newtype}/{id}")
	 	@ResponseBody
	 	public void mettreAjourTypeByInterventionIdJPQL(@PathVariable("newtype") TypeIntervention type, @PathVariable("id") long interventionId) {	
	 		interService.mettreAjourTypeByInterventionIdJPQL(type, interventionId);
	}
}
