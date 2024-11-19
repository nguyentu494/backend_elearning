package vn.edu.iuh.fit.appelearingbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.appelearingbe.ids.LessonUserId;
import vn.edu.iuh.fit.appelearingbe.models.LessonUser;

public interface LessonUserRepository extends JpaRepository<LessonUser, LessonUserId> {
}