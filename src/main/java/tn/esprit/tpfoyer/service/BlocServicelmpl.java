package tn.esprit.tpfoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.repository.BlocRepository;


import java.util.List;
@Service
public class BlocServicelmpl implements IBlocService {

    @Autowired

    BlocRepository blocRepository;
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
}
