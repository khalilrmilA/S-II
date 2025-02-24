package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Etudiant;
import tn.esprit.tpfoyer.entity.Foyer;

import java.util.List;

public interface IFoyerService {
    public List<Foyer> retrieveAllFoyer();
    public Foyer retrieveFoyer(Long id);
    public Foyer addFoyer(Foyer c);
    public void removeFoyer(Long id);
    public Foyer modifyFoyer(Foyer c);
}
