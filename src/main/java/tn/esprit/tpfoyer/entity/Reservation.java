package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import jdk.jfr.BooleanFlag;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private String idReservation;
    private Date anneUniversitaire;
    private boolean estValide;
    @ManyToMany
    Set<Etudiant> etudiants;


}
