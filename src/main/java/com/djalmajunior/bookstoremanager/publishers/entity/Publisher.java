package com.djalmajunior.bookstoremanager.publishers.entity;

import com.djalmajunior.bookstoremanager.books.entity.Book;
import com.djalmajunior.bookstoremanager.entity.Auditable;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Publisher extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false, unique = true, length = 100)
    private String code;

    @Column(nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDate foundationDate;

    @OneToMany(mappedBy = "publisher", fetch = FetchType.LAZY)
    private List<Book> books;
}
