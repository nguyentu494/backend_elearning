package vn.edu.iuh.fit.appelearingbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.appelearingbe.models.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}