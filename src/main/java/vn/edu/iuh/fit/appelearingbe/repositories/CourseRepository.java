package vn.edu.iuh.fit.appelearingbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import vn.edu.iuh.fit.appelearingbe.models.Course;
import vn.edu.iuh.fit.appelearingbe.models.Lesson;
import vn.edu.iuh.fit.appelearingbe.models.Section;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    Course findById(long id);
    List<Course> findByRatingGreaterThanEqual(Double rating);
    List<Course> findByTeacherId(long id);

    @Query("""
            select c from Course c
            where upper(c.category.name) like upper(concat('%', ?1, '%')) or upper(c.teacher.name) like upper(concat('%', ?2, '%')) or upper(c.title) like upper(concat('%', ?3, '%'))""")
    List<Course> findTop9ByCategory_NameContainsIgnoreCaseOrTeacher_NameContainsIgnoreCaseOrTitleContainsIgnoreCase(String name, String name1, String title);

}