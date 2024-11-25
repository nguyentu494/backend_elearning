package vn.edu.iuh.fit.appelearingbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.appelearingbe.models.Course;
import vn.edu.iuh.fit.appelearingbe.models.Section;

import java.util.List;

public interface SectionRepository extends JpaRepository<Section, Long> {
    List<Section> findByCourseId(long courseId);

}