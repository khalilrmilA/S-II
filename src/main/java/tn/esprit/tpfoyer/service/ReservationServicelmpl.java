package tn.esprit.tpfoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Reservation;
import tn.esprit.tpfoyer.repository.ReservationRepository;

import java.util.List;
@Service

public class ReservationServicelmpl implements IReservationService {
    @Autowired
    ReservationRepository reservationRepository;
    @Override
    public List<Reservation> retrieveAllBloc() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation retrieveBloc(Long idReservation) {
        return  reservationRepository.findById(String.valueOf(idReservation)).get();
    }

    @Override
    public Reservation addBloc(Reservation c) {
        return reservationRepository.save(c);
    }

    @Override
    public void removeBloc(Long idReservation) {
        reservationRepository.deleteById(String.valueOf(idReservation));
    }

    @Override
    public Reservation modifyBloc(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
