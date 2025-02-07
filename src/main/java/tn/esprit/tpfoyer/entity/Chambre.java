package tn.esprit.tpfoyer.entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;
@Entity

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    @Id

    
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    
    private Long idChambre;
    private Long numeroChambre;

    @Enumerated(EnumType.STRING)


    private TypeChambre typeC;

    @ManyToOne
    @JoinColumn(name = "idBloc")
    private Bloc bloc;

    @OneToMany(mappedBy = "chambre")
    private List<Reservation> reservations;
}
