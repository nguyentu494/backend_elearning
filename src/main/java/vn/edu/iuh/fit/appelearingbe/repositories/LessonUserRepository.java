package vn.edu.iuh.fit.appelearingbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNullApi;
import org.springframework.transaction.annotation.Transactional;
import vn.edu.iuh.fit.appelearingbe.enums.StatusLesson;
import vn.edu.iuh.fit.appelearingbe.ids.LessonUserId;
import vn.edu.iuh.fit.appelearingbe.models.LessonUser;

import java.util.Optional;

public interface LessonUserRepository extends JpaRepository<LessonUser, LessonUserId> {
    LessonUser findById_Lesson_IdAndId_Student_Id(Long lessonId, Long studentId);
    @Modifying
    @Transactional
    @Query("UPDATE LessonUser lu SET lu.status = :#{#lessonUser.status} WHERE lu.id = :id")
    int updateById(LessonUserId id, LessonUser lessonUser);

}