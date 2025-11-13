package nm.lab.eightEx;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository repo;

    // ✅ Create
    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        return repo.save(student);
    }

    // ✅ Read all
    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    // ✅ Read by ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
    }

    // ✅ Update
    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student details) {
        Student student = repo.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
        student.setName(details.getName());
        student.setAge(details.getAge());
        return repo.save(student);
    }

    // ✅ Delete
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        repo.deleteById(id);
        return "Student deleted with id: " + id;
    }
}

