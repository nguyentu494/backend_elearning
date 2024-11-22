package vn.edu.iuh.fit.appelearingbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.edu.iuh.fit.appelearingbe.models.Course;
import vn.edu.iuh.fit.appelearingbe.models.Lesson;
import vn.edu.iuh.fit.appelearingbe.models.Section;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    Course findById(long id);
    List<Course> findByRatingGreaterThanEqual(Double rating);
    List<Course> findByTeacherId(long id);
    //Top 5 theo view
    List<Course> findTop5ByOrderByViewDesc();

    //get course by student id
    List<Course> findByEnrollCourses_Id_Student_Id(long id);
}