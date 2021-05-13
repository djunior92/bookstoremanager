package com.djalmajunior.bookstoremanager.publishers.repository;

import com.djalmajunior.bookstoremanager.publishers.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
