package nm.lab.nineEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/buses")
public class BusController {

    @Autowired
    private BusRepository repo;

    // ----------------------------
    // Add a new bus from HTML form
    // ----------------------------
    @PostMapping("/add")
    public Bus addBus(@ModelAttribute Bus bus) {
        return repo.save(bus);
    }

    // ----------------------------
    // Get all buses (JSON)
    // ----------------------------
    @GetMapping("/all")
    public List<Bus> getAllBuses() {
        return repo.findAll();
    }

    // ----------------------------
    // Search buses by source and destination
    // Example: /buses/search?source=CityA&destination=CityB
    // ----------------------------
    @GetMapping("/search")
    public List<Bus> searchBuses(@RequestParam String source, @RequestParam String destination) {
        return repo.findBySourceAndDestination(source, destination);
    }

    // ----------------------------
    // Update seats for a bus
    // Example: /buses/update/1 with JSON {"seats":50}
    // ----------------------------
    @PutMapping("/update/{id}")
    public Bus updateSeats(@PathVariable int id, @RequestBody Bus bus) {
        Bus b = repo.findById(id).orElseThrow(() -> new RuntimeException("Bus not found"));
        b.setSeats(bus.getSeats());
        return repo.save(b);
    }

    // ----------------------------
    // Delete a bus by id
    // Example: /buses/delete/1
    // ----------------------------
    @DeleteMapping("/delete/{id}")
    public String deleteBus(@PathVariable int id) {
        repo.deleteById(id);
        return "Deleted bus with id " + id;
    }
}
