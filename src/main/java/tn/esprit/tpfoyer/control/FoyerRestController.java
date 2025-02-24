package tn.esprit.tpfoyer.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Etudiant;
import tn.esprit.tpfoyer.service.IEtudiantService;

import java.util.List;

public class FoyerRestController {
    @Autowired
    IEtudiantService etudiantService;
    // http://localhost:8089/tpfoyer/chambre/retrieve-all-chambres
    @GetMapping("/retrieve-all-etudiant")
    public List<Etudiant> getChambres() {
        List<Etudiant> listEtudiants = etudiantService.retrieveAllEtudiants();
        return listEtudiants;
    }
    // http://localhost:8089/tpfoyer/chambre/retrieve-chambre/8
    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveChambre(@PathVariable("etudiant-id") Long idEtudiant) {
        Etudiant etudiant = etudiantService.retrieveEtudiant(idEtudiant);
        return etudiant;
    }
    // http://localhost:8089/tpfoyer/chambre/add-chambre
    @PostMapping("/add-chambre")
    public Etudiant addChambre(@RequestBody Etudiant c) {
        Etudiant etudiant = etudiantService.addEtudiant(c);
        return etudiant;
    }
    // http://localhost:8089/tpfoyer/chambre/remove-chambre/{chambre-id}
    @DeleteMapping("/remove-chambre/{etudent-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Long idEtudiant) {
        etudiantService.removeEtudiant(idEtudiant);
    }
    // http://localhost:8089/tpfoyer/chambre/modify-chambre
    @PutMapping("/modify-etudiant")
    public Etudiant modifyChambre(@RequestBody Etudiant c) {
        Etudiant etudiant = etudiantService.modifyEtudiant(c);
        return etudiant;
    }
}
