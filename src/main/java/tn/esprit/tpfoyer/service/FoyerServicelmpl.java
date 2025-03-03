package tn.esprit.tpfoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Etudiant;
import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.repository.EtudiantRepository;
import tn.esprit.tpfoyer.repository.FoyerRepository;

import java.util.List;
@Service

public class FoyerServicelmpl implements IFoyerService{
    @Autowired
    FoyerRepository foyerRepository;
    @Override
    public List<Foyer> retrieveAllFoyer() {
        return null;
    }

    @Override
    public Foyer retrieveFoyer(Long id) {
        return null;
    }

    @Override
    public Foyer addFoyer(Foyer c) {
        return foyerRepository.save(c);
    }

    @Override
    public void removeFoyer(Long id) {

    }

    @Override
    public Foyer modifyFoyer(Foyer c) {
        return null;
    }

   /* FoyerRepository foyerRepository;
    public List<Foyer> retrieveAllFoyer() {
        return foyerRepository.findAll();
    }
    public Foyer retrieveFoyer(Long idEtudiant) {
        return foyerRepository.findById(idEtudiant).get();
    }
    public Foyer addFoyer(Foyer c) {
        return foyerRepository.save(c);
    }
    public void removeFoyer(Long id) {
        foyerRepository.deleteById(idEtudiant);
    }

    public Foyer modifyFoyer(Foyer c) {
        return foyerRepository.save(etudiant);
    }
*/
}
