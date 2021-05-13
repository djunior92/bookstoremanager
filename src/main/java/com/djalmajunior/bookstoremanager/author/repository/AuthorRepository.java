package com.djalmajunior.bookstoremanager.author.repository;

import com.djalmajunior.bookstoremanager.author.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
