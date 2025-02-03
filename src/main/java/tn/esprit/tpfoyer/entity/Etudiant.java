package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
@Entity

public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    private Date dateNaissance;

    @OneToMany(mappedBy = "etudiant")
    private List<Reservation> reservations;
}
