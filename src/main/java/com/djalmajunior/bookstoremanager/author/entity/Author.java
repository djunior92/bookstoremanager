package com.djalmajunior.bookstoremanager.author.entity;

import com.djalmajunior.bookstoremanager.books.entity.Book;
import com.djalmajunior.bookstoremanager.entity.Auditable;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Author extends Auditable {



    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private List<Book> books;
}
