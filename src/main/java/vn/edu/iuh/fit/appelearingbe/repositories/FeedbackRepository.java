package vn.edu.iuh.fit.appelearingbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.appelearingbe.models.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}