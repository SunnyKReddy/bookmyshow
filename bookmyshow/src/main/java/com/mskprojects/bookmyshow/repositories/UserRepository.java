package com.mskprojects.bookmyshow.repositories;

import com.mskprojects.bookmyshow.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    Optional<User> findById(Long userId);
    Optional<User> findByEmail(String userEmail);
    Optional<User> findByEmailAndName(String userEmail, String userName);
    @Override
    User save(User user);
}
