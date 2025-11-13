package nm.lab.nineEx;



import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BusRepository extends JpaRepository<Bus, Integer> {
    List<Bus> findBySourceAndDestination(String source, String destination);
}
