package com.jasontyzzer.javabookstore.controller;


import com.jasontyzzer.javabookstore.model.Author;
import com.jasontyzzer.javabookstore.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    @RequestMapping(path = "/authors", produces = MediaType.APPLICATION_JSON_VALUE)
    public class AuthorController {

        @Autowired
        AuthorRepository authorRepository;

        @GetMapping(value = "")
        public List<Author> getAllAuthors(){
            return authorRepository.findAll();
        }
}
