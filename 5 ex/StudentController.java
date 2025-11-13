package nm.lab.fiveEx;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository repo;

    @GetMapping("/students/{name}")
    public List<Student> getByName(@PathVariable String name) {
        return repo.findByName(name);
    }
}


