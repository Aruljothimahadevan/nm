package nm.lab.sevenEx;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository repo;

    @GetMapping("/above/{age}")
    public List<Student> getAbove(@PathVariable int age) {
        return repo.findAboveAge(age);
    }
}



