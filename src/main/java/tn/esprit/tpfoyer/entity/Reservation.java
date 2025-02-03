package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String idReservation;
    private Date anneeUniversitaire;
    private boolean estValide;

    @ManyToOne
    @JoinColumn(name = "idChambre")
    private Chambre chambre;

    @ManyToOne
    @JoinColumn(name = "idEtudiant")
    private Etudiant etudiant;
}
