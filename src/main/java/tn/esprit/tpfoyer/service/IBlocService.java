package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Bloc;

import java.util.List;

public interface IBlocService {
    public List<Bloc> retrieveAllBloc();
    public Bloc retrieveBloc(Long idBloc);
    public Bloc addBloc(Bloc c);
    public void removeBloc(Long idBloc);
    public Bloc modifyBloc(Bloc bloc);
   /* public void desaffecterfoyerequipe(Long idBloc, Long idFoyer);*/
   public void assignBlocToFoyer(Long idBloc , Long foyerid);
    public void desaffecterProjetFromEquipe(Long idBloc, Long foyerid);
    public List<Bloc> findBlocByFoyerIsNull();

}
