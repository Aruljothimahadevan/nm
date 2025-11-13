package nm.lab.tweleEx;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/trainBookings")
public class TrainBookingController {

    @Autowired
    private TrainBookingRepository repo;

    // Create a new booking
    @PostMapping
    public TrainBooking addBooking(@RequestBody TrainBooking booking) {
        return repo.save(booking);
    }

    // Get all bookings
    @GetMapping
    public List<TrainBooking> getAllBookings() {
        return repo.findAll();
    }

    // Get booking by ID
    @GetMapping("/{id}")
    public TrainBooking getBookingById(@PathVariable Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Booking not found with ID: " + id));
    }

    // Update booking
    @PutMapping("/{id}")
    public TrainBooking updateBooking(@PathVariable Long id, @RequestBody TrainBooking updatedBooking) {
        TrainBooking booking = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Booking not found with ID: " + id));
        booking.setPassengerName(updatedBooking.getPassengerName());
        booking.setSource(updatedBooking.getSource());
        booking.setDestination(updatedBooking.getDestination());
        booking.setTravelDate(updatedBooking.getTravelDate());
        return repo.save(booking);
    }

    // Delete booking
    @DeleteMapping("/{id}")
    public String deleteBooking(@PathVariable Long id) {
        repo.deleteById(id);
        return "Booking deleted with ID: " + id;
    }
}
