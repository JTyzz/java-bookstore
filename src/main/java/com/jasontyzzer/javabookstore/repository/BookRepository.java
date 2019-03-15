package com.jasontyzzer.javabookstore.repository;

import com.jasontyzzer.javabookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface BookRepository extends JpaRepository<Book, Long> {
    @Transactional
    @Modifying
    @Query(value = "INSERT INTO bookstore.writtenby (bookid, authorid) VALUES (:bookid, :authorid)", nativeQuery = true)
    void writtenBy(long bookid, long authorid);
}
