package de.ait.restaurantapp.services;

import de.ait.restaurantapp.dto.ReservationForm;
import de.ait.restaurantapp.model.Reservation;

import java.util.List;

public interface ReservationService {

    Reservation createReservation(ReservationForm form);  // <-- poprawione

    List<Reservation> getAllReservations();

    void cancelReservation(Long reservationId);
}
