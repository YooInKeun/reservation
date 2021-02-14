package me.minho.reservation.repository;

import me.minho.reservation.domain.Reservation;

import java.time.LocalDate;
import java.util.List;


public interface CustomReservationRepository {
    List<Reservation> findAllByDate(LocalDate date);
}
