package vn.edu.iuh.fit.appelearingbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.appelearingbe.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findById(long id);
}