package nm.lab.fiveEx;



import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByName(String name);  // Auto query: SELECT * FROM student WHERE name=?
}
