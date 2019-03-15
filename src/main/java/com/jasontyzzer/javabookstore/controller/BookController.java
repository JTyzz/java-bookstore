package com.jasontyzzer.javabookstore.controller;

import com.jasontyzzer.javabookstore.model.Author;
import com.jasontyzzer.javabookstore.model.Book;
import com.jasontyzzer.javabookstore.repository.AuthorRepository;
import com.jasontyzzer.javabookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/books", produces = MediaType.APPLICATION_JSON_VALUE)
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping(value = "")
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
}
