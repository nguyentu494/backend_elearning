package vn.edu.iuh.fit.appelearingbe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import vn.edu.iuh.fit.appelearingbe.models.User;

import java.time.LocalDateTime;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmailAndPassword(String email, String password);
    User findByEmail(String email);
    @Transactional
    @Modifying
    @Query("""
            update User u set u.avatar = ?1, u.name = ?2, u.description = ?3, u.phone = ?4, u.date_of_birth = ?5
            where u.id = ?6""")
    int updateAvatarAndNameAndDescriptionAndPhoneAndDate_of_birthById(String avatar, String name, String description, String phone, LocalDateTime date_of_birth, long id);
}