package vn.edu.iuh.fit.appelearingbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.edu.iuh.fit.appelearingbe.models.Course;
import vn.edu.iuh.fit.appelearingbe.models.Lesson;
import vn.edu.iuh.fit.appelearingbe.models.Section;
import vn.edu.iuh.fit.appelearingbe.models.Student;

import java.util.Collection;
import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    Course findById(long id);
    List<Course> findByRatingGreaterThanEqual(Double rating);
    List<Course> findByTeacherId(long id);

    @Query("""
            select c from Course c
            where upper(c.category.name) like upper(concat('%', ?1, '%')) or upper(c.teacher.name) like upper(concat('%', ?2, '%')) or upper(c.title) like upper(concat('%', ?3, '%'))""")
    List<Course> findTop9ByCategory_NameContainsIgnoreCaseOrTeacher_NameContainsIgnoreCaseOrTitleContainsIgnoreCase(String name, String name1, String title);

    //Top 5 theo view mà user chưa enroll
    @Query("""
            select c from Course c
            where c.id not in (select ec.id.course.id from EnrollCourse ec where ec.id.student.id = :id)
            order by c.view desc""")
    List<Course> findTop5ByViewNot(long id);

    List<Course> findByEnrollCourses_Id_Student_Id(long id);

    @Query("select c from Course c where c.id not in (select ec.id.course.id from EnrollCourse ec where ec.id.student.id = :id)")
    List<Course> findByEnrollCourses_Id_StudentNot(long id);

}