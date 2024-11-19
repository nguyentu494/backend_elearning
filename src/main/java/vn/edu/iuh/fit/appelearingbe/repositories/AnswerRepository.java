package vn.edu.iuh.fit.appelearingbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.appelearingbe.models.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
}