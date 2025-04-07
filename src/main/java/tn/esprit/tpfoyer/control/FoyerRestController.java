package tn.esprit.tpfoyer.control;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.service.IFoyerService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/foyer")
@RestController
public class FoyerRestController {
/*    @Autowired
    IFoyerService Iservicefoyer;
    // http://localhost:8089/tpfoyer/chambre/retrieve-foyer
    @GetMapping("/retrieve-all-foyer")
    public List<Foyer> getFoyer() {
        List<Foyer> listEtudiants = Iservicefoyer.retrieveAllFoyer();
        return listEtudiants;
    }
    // http://localhost:8089/tpfoyer/chambre/retrieve-chambre/8
    @GetMapping("/retrieve-foyer/{foyer-id}")
    public Foyer retrieveFoyer(@PathVariable("foyer-id") Long idEtudiant) {
        Foyer foyer = Iservicefoyer.retrieveFoyer(idEtudiant);
        return foyer;
    }
    // http://localhost:8089/tpfoyer/chambre/add-chambre
    @PostMapping("/add-foyer")
    public Foyer addChambre(@RequestBody Foyer c) {
        Foyer foyer = Iservicefoyer.addFoyer(c);
        return foyer;
    }
    // http://localhost:8089/tpfoyer/chambre/remove-chambre/{chambre-id}
    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void removeFoyer(@PathVariable("foyer-id") Long idEtudiant) {
        Iservicefoyer.removeFoyer(idEtudiant);
    }
    // http://localhost:8089/tpfoyer/chambre/modify-chambre
    @PutMapping("/modify-foyer")
    public Foyer modifyFoyer(@RequestBody Foyer c) {
        Foyer foyer = Iservicefoyer.modifyFoyer(c);
        return foyer;
    }*/
}
