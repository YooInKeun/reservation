package me.minho.reservation.repository;

import me.minho.reservation.domain.Reservation;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class ReservationRepositoryImpl implements CustomReservationRepository {
    @Override
    public List<Reservation> findAllByDate(LocalDate date) {
        return Collections.emptyList();
    }
}
