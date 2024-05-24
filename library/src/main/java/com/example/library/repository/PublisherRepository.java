package com.example.library.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library.entity.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}
