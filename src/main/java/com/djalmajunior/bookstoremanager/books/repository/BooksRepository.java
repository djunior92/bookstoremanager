package com.djalmajunior.bookstoremanager.books.repository;

import com.djalmajunior.bookstoremanager.books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Book, Long> {
}
