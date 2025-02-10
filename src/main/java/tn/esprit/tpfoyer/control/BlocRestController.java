package tn.esprit.tpfoyer.control;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.service.IBlocService;
import tn.esprit.tpfoyer.service.IChambreService;

import java.util.List;
@RequiredArgsConstructor
@RequestMapping("/bloc")
@RestController
public class BlocRestController {
    @Autowired
    IBlocService blocService;
    // http://localhost:8089/tpfoyer/bloc/retrieve-all-bloc
    @GetMapping("/retrieve-all-bloc")
    public List<Bloc> getChambres() {
        List<Bloc> listBlocs = blocService.retrieveAllBloc();
        return listBlocs;
    }
    // http://localhost:8089/tpfoyer/bloc/retrieve-bloc/8
    @GetMapping("/retrieve-bloc/{bloc-id}")
    public Bloc retrieveChambre(@PathVariable("bloc-id") Long idBloc) {
        Bloc bloc = blocService.retrieveBloc(idBloc);
        return bloc;
    }
    // http://localhost:8089/tpfoyer/bloc/add-bloc
    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc c) {
        Bloc bloc = blocService.addBloc(c);
        return bloc;
    }
    // http://localhost:8089/tpfoyer/bloc/remove-bloc/{bloc-id}
    @DeleteMapping("/remove-bloc/{bloc-id}")
    public void removeChambre(@PathVariable("bloc-id") Long IdBloc) {
        blocService.removeBloc(IdBloc);
    }
    // http://localhost:8089/tpfoyer/bloc/modify-bloc
    @PutMapping("/modify-bloc")
    public Bloc modifyChambre(@RequestBody Bloc c) {
        Bloc bloc = blocService.modifyBloc(c);
        return bloc;
    }
}
