package vn.edu.iuh.fit.appelearingbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.appelearingbe.ids.EnrollCourseId;
import vn.edu.iuh.fit.appelearingbe.models.Bill;

public interface BillRepository extends JpaRepository<Bill, EnrollCourseId> {
}