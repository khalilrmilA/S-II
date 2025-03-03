package tn.esprit.tpfoyer.service;


import tn.esprit.tpfoyer.entity.Reservation;

import java.util.List;

public interface IReservationService {
    public List<Reservation> retrieveAllBloc();
    public Reservation retrieveBloc(Long idReservation);
    public Reservation addBloc(Reservation c);
    public void removeBloc(Long idReservation);
    public Reservation modifyBloc(Reservation reservation);

}
