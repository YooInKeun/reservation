package me.minho.reservation.repository;

import me.minho.reservation.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long>, CustomReservationRepository {
}
