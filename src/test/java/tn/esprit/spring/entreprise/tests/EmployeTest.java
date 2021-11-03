package tn.esprit.spring.entreprise.tests;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.spring.controller.RestControlEmploye;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.Contrat;


@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeTest {
	@Autowired
    RestControlEmploye controllerEmploye;
	@Test
    public void testAjouterEmploye(){

		 Employe employe=new Employe("Chedy","Rhaiem","chedy.rhaiem@esprit.tn",true,Role.ADMINISTRATEUR );
	        Employe employe2=new Employe("Chedy","Rh","chedy@esprit.tn",true,Role.ADMINISTRATEUR );
	        Employe employe3=new Employe("Chedi","Rhm","chedy23@esprit.tn",true,Role.ADMINISTRATEUR );
	        controllerEmploye.ajouterEmploye(employe);
	        controllerEmploye.ajouterEmploye(employe2);
	        controllerEmploye.ajouterEmploye(employe3);
    }
	@Test 
	public void testMettreAjourEmailByEmployeId() {
		controllerEmploye.mettreAjourEmailByEmployeId("chedy.rhaiem2@esprit.tn", 1);
		}
	/*@Test 
	public void testAffecterEmployeADepartement() {
		controllerEmploye.affecterEmployeADepartement(1, 5);
		controllerEmploye.affecterEmployeADepartement(2, 1);
	}*/
	/*@Test
	public void testDesaffecterEmployeDuDepartement() {
		controllerEmploye.desaffecterEmployeDuDepartement(2, 1);
	}*/
	@Test 
	public void testAjouterContrat() {
		Date  dateDebut = new Date( "08/07/2021" );
		Contrat contrat=new Contrat(dateDebut,"CDI",1202);
		Contrat contrat2=new Contrat(dateDebut,"CDI",1250);
		Contrat contrat3=new Contrat(dateDebut,"CDI",1250);
		controllerEmploye.ajouterContrat(contrat);
		controllerEmploye.ajouterContrat(contrat2);
		controllerEmploye.ajouterContrat(contrat3);
	}
	@Test
	public void testAffecterContratAEmploye() {
		controllerEmploye.affecterContratAEmploye(1, 1);
	}
	@Test
	public void testGetEmployePrenomById() {
		controllerEmploye.getEmployePrenomById(1);
	}
	@Test
	public void testDeleteEmployeById() {
		controllerEmploye.deleteEmployeById(2);
	}
	@Test
	public void testDeleteContratById() {
		controllerEmploye.deleteContratById(2);
	}
	@Test 
	public void testGetNombreEmployeJPQL() {
		controllerEmploye.getNombreEmployeJPQL();
	}
	@Test 
	public void testGetAllEmployeNamesJPQL() {
		controllerEmploye.getAllEmployeNamesJPQL();
	}
	/*@Test 
	public void testGetAllEmployeByEntreprise() {
		controllerEmploye.getAllEmployeByEntreprise(1);
	}
	@Test */
	public void testMettreAjourEmailByEmployeIdJPQL() {
		controllerEmploye.mettreAjourEmailByEmployeIdJPQL("shadyrhaiem@gmail.com", 2);;
	}
	@Test
	public void testGetSalaireMoyenByDepartementId() {
		controllerEmploye.getSalaireMoyenByDepartementId(1);
	}
}
