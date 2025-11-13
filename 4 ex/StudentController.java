package nm.lab.fourEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StudentController {
    @Autowired
    private StudentRepository repo;
    @GetMapping("/students")
    public Page<Student> getStudents(@RequestParam int page, @RequestParam int size) {
        return repo.findAll(PageRequest.of(page, size, Sort.by("name").ascending()));
    }
}

