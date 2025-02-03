package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;

import java.util.List;
@Entity

public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;
    private String nomUniversite;
    private String adresse;

    @OneToMany(mappedBy = "universite")
    private List<Foyer> foyers;
}
