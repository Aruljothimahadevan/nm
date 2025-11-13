package nm.lab.sixEx;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository repo;

    // ✅ Temporary browser-friendly update for testing
    @GetMapping("/update-test/{id}")
    public Student updateStudentTest(@PathVariable int id) {
        Student student = repo.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
        student.setName("Updated Name");   // change name
        student.setAge(student.getAge() + 1); // increment age
        return repo.save(student);          // save updated student
    }

    // ✅ List all students
    @GetMapping("/all")
    public Iterable<Student> getAllStudents() {
        return repo.findAll();
    }
}


