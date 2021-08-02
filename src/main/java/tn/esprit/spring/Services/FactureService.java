package tn.esprit.spring.Services;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;

import tn.esprit.spring.Entity.Client;
import tn.esprit.spring.Entity.Facture;
import tn.esprit.spring.Repository.ClientRepository;
import tn.esprit.spring.Repository.FactureRepository;
import tn.esprit.spring.uti.pdf.PDFGenerator;
@Service
public class FactureService implements IFactureService {

	private static final Logger logger = LogManager.getLogger(PDFGenerator.class);
	@Autowired
	PDFGenerator fact;
	
	@Autowired
	FactureRepository eRepo;
	
	@Autowired
	ClientRepository clientrep;
	
	
	
public void generatePdfReport(int id_client) {

	//affecterFacture(id_client);

		for (Facture facture : eRepo.findAll()) {
			try {
				Document document = new Document();
				PdfWriter.getInstance(document, new FileOutputStream(fact.getPdfNameWithDate(facture.getRef())));
				document.open();
				fact.addLogo(document);
				fact.addDocTitle(document, facture);
				fact.createTable(document,facture);
				fact.addFooter(document);
				document.close();
				logger.info("------------------Votre rapport PDF est prêt!-------------------------");

			} catch (FileNotFoundException | DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}


	}
/*
             private void affecterFacture(int id){
            	 Client c = clientrep.findById(id).get();
            	 Facture fac = new Facture();
            	 fac.setClients(c);
            	 fac.setDateDebut(new Date());
            	 fac.setDateValidite(new Date());
            	 fac.setMontant(20000);
            	 fac.setTitre("");
            	 eRepo.save(fac);

             }*/

public void ajouterFactureAffecterClients( Facture fact, int idclient) {
	// TODO Auto-generated method stub
	Client client = clientrep.findById(idclient).get();
	fact.setClients(client);
	eRepo.save(fact);

}




}
