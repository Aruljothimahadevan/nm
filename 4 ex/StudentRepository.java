package nm.lab.fourEx;
import org.springframework.data.repository.PagingAndSortingRepository;
import nm.lab.fourEx.Student;
public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {
}
