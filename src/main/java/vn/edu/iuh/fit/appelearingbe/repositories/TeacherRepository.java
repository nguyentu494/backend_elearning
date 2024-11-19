package vn.edu.iuh.fit.appelearingbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.appelearingbe.models.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}