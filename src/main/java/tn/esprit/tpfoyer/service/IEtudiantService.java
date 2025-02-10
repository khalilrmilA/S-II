package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.entity.Etudiant;

import java.util.List;

public interface IEtudiantService {
    public List<Etudiant> retrieveAllEtudiants();
    public Etudiant retrieveEtudiant(Long idEtudiant);
    public Etudiant addEtudiant(Etudiant c);
    public void removeEtudiant(Long idEtudiant);
    public Etudiant modifyEtudiant(Etudiant etudiant);
}
