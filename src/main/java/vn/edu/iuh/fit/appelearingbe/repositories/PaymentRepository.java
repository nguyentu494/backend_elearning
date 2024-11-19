package vn.edu.iuh.fit.appelearingbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.appelearingbe.models.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Payment findById(long id);
}