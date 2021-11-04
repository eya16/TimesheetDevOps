package tn.esprit.spring.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.entities.Departement;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.repository.EntrepriseRepository;

@Service
public class EntrepriseServiceImpl implements IEntrepriseService {

	@Autowired
    EntrepriseRepository entrepriseRepoistory;
	@Autowired
	DepartementRepository deptRepoistory;
	
	public Entreprise ajouterEntreprise(Entreprise entreprise) {
		entrepriseRepoistory.save(entreprise);
		return entreprise;
	}

	public Departement ajouterDepartement(Departement dep) {
		deptRepoistory.save(dep);
		return dep;
	}
	
	public void affecterDepartementAEntreprise(int depId, int entrepriseId) {
	
		Optional<Entreprise> entrepriseManagedEntity = entrepriseRepoistory.findById(entrepriseId);
		Optional<Departement> depManagedEntity = deptRepoistory.findById(depId);

		if(entrepriseManagedEntity.isPresent() && depManagedEntity.isPresent())  {
				
				
				depManagedEntity.get().setEntreprise(entrepriseManagedEntity.get());
				deptRepoistory.save(depManagedEntity.get());
		
	}
	}
	
	public List<String> getAllDepartementsNamesByEntreprise(int entrepriseId) {
		List<String> depNames = new ArrayList<>();
		Optional<Entreprise> entrepriseManagedEntity = entrepriseRepoistory.findById(entrepriseId);

		if(entrepriseManagedEntity.isPresent() ) {
		
		for(Departement dep : entrepriseManagedEntity.get().getDepartements()){
			depNames.add(dep.getName());
		}
		}
		return depNames;
		
	}

	@Transactional
	public void deleteEntrepriseById(int entrepriseId) {
		Optional<Entreprise> entrepriseManagedEntity = entrepriseRepoistory.findById(entrepriseId);
		if(entrepriseManagedEntity.isPresent() ) {
		entrepriseRepoistory.delete(entrepriseManagedEntity.get());	
	}
	}

	@Transactional
	public void deleteDepartementById(int depId) {
		Optional<Departement> depManagedEntity = deptRepoistory.findById(depId);
     if(depManagedEntity.isPresent()) {
		deptRepoistory.delete(depManagedEntity.get());	
     }
	}


	public Entreprise getEntrepriseById(int entrepriseId) {
		return entrepriseRepoistory.findById(entrepriseId).orElse(null);	
	}

}
