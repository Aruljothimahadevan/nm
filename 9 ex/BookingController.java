package nm.lab.nineEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    @Autowired
    private BookingRepository repo;
    // Create a booking
    @PostMapping
    public TravelBooking addBooking(@RequestBody TravelBooking booking) {
        return repo.save(booking);
    }
    // Get all bookings
    @GetMapping
    public List<TravelBooking> getAllBookings() {
        return repo.findAll();
    }
}
