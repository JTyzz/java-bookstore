package com.jasontyzzer.javabookstore.controller;

import com.jasontyzzer.javabookstore.model.Book;
import com.jasontyzzer.javabookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/data/books/", produces = MediaType.APPLICATION_JSON_VALUE)
public class DataBookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping(value = "")
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    @PutMapping("{id}")
    public Book putBookById(@RequestBody Book newBook, @PathVariable long id) throws URISyntaxException {
        Optional<Book> bookToUpdate = bookRepository.findById(id);
        if (bookToUpdate.isPresent()) {
            newBook.setBookid(id);
            bookRepository.save(newBook);
            return newBook;
        }
        return null;
    }

    @PostMapping("{id}/{authorid}")
    public String addBookToAuthor(@PathVariable("id") long id, @PathVariable("authorid") long authorid) {
        bookRepository.writtenBy(id, authorid);
        return "Added author ID: " + authorid +" to book ID:" + id;
    }

    @DeleteMapping("{id}")
    public Book deleteBookById(@PathVariable long id) {
        var foundBook = bookRepository.findById(id);
        if (foundBook.isPresent()) {
            bookRepository.deleteById(id);
            return foundBook.get();
        }
        return null;
    }
}
