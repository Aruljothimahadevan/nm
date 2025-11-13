package nm.lab.sevenEx;


import jakarta.persistence.*;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Student> findAboveAge(int age) {
        return em.createQuery("SELECT s FROM Student s WHERE s.age > :age", Student.class)
                .setParameter("age", age)
                .getResultList();
    }
}

