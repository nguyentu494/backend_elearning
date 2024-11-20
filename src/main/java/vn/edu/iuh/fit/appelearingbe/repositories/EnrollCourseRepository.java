package vn.edu.iuh.fit.appelearingbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.appelearingbe.ids.EnrollCourseId;
import vn.edu.iuh.fit.appelearingbe.models.EnrollCourse;

public interface EnrollCourseRepository extends JpaRepository<EnrollCourse, EnrollCourseId> {
    int countById_Course_Id(long courseId);
}