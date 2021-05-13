package com.djalmajunior.bookstoremanager.users.repository;

import com.djalmajunior.bookstoremanager.users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
