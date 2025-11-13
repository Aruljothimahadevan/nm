package nm.lab.nineEx;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<TravelBooking, Long> {
}