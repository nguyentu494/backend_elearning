package vn.edu.iuh.fit.appelearingbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.appelearingbe.models.Category;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findById(long id);
}