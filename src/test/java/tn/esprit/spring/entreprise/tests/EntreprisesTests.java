package tn.esprit.spring.entreprise.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.controller.RestControlEntreprise;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Entreprise;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;



@SpringBootTest
public class EntreprisesTests {
	private static final Logger l = Logger.getLogger(EntreprisesTests.class);
	
	@Autowired
	RestControlEntreprise entrepriseControl;
	
/*	@Test
	public void testEntreprise() {
		l.info("*********** Debut tests  **************");
		Entreprise e = new Entreprise("nameEntreprise","Ghazela");
		
		Departement depRH = new Departement("RH");

		e.addDepartement(depRH);

		Entreprise testEntr  = entrepriseControl.ajouterEntreprise(e); 
		
Departement testDep = entrepriseControl.ajouterDepartement(depRH);
		
		entrepriseControl.affecterDepartementAEntreprise(testDep.getId(), testEntr.getId());
		
		List<String> departements = entrepriseControl.getAllDepartementsNamesByEntreprise(testEntr.getId());
		
		for (String departementName : departements) {
			l.info(departementName);
		}
		
		Entreprise entreprise = entrepriseControl.getEntrepriseById(testEntr.getId());
		l.info(entreprise);
		
		
		
		l.info("supp department ");
		entrepriseControl.deleteDepartementById(testDep.getId());
		
		l.info("supp entreprise ");
		entrepriseControl.deleteEntrepriseById(testEntr.getId());
		
		
		l.info("*********** Fin tests *********  ");
		
		
	}
*/




}
