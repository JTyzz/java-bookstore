package com.jasontyzzer.javabookstore.repository;

import com.jasontyzzer.javabookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}