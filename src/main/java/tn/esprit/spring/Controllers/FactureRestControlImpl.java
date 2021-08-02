package tn.esprit.spring.Controllers;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.Entity.Facture;
import tn.esprit.spring.Services.FactureService;
import tn.esprit.spring.Services.IFactureService;
import tn.esprit.spring.uti.pdf.PDFGenerator;
@RestController
public class FactureRestControlImpl {
	
	@Autowired
	FactureService pDFGenerator;
	//http://localhost:8081/SpringMVC/servlet/test/{id}
	
@PostMapping("/test/{id}")	
public void pDFgenerator(@PathVariable int id){
	//PDFGenerator pDFGenerator = getBean("pdfGenerator",PDFGenerator.class);
	
	pDFGenerator.generatePdfReport(id);
}
//http://localhost:8081/SpringMVC/servlet/ajouterFactureAffecterClient/{idClient}

@PostMapping("/ajouterFactureAffecterClient/{idClient}")
public void ajouterFactureAffecteridclient(@RequestBody Facture facture, @PathVariable int idclient) {
	pDFGenerator.ajouterFactureAffecterClients(facture, idclient);
}

}