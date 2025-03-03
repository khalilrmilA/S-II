package tn.esprit.tpfoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.repository.BlocRepository;
import tn.esprit.tpfoyer.repository.FoyerRepository;


import java.util.List;
@Service
public class BlocServicelmpl implements IBlocService {


    @Autowired
    BlocRepository blocRepository;
    @Autowired
        FoyerRepository foyerRepository;
    public List<Bloc> retrieveAllBloc() {
        return blocRepository.findAll();
    }
    public Bloc retrieveBloc(Long idBloc) {
        return blocRepository.findById(idBloc).get();
    }
    public Bloc addBloc(Bloc c) {
        return blocRepository.save(c);
    }
    public void removeBloc(Long idbloc) {
        blocRepository.deleteById(idbloc);
    }
    public Bloc modifyBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }
    public void assignBlocToFoyer(Long idBloc, Long idFoyer) {
        Bloc bloc = blocRepository.findById(idBloc).get();
        Foyer foyer = foyerRepository.findById(idFoyer).get();
// on set le fils dans le parent :
        bloc.setFoyer(foyer);
        blocRepository.save(bloc);
    }
    public void desaffecterProjetFromEquipe(Long idBloc, Long idFoyer) {
        Bloc bloc = blocRepository.findById(idBloc).get();
        Foyer foyer = foyerRepository.findById(idFoyer).get();
// on enlève le fils du parent :
        foyer.getBlocs().remove(bloc);
        foyerRepository.save(foyer);
    }


}
