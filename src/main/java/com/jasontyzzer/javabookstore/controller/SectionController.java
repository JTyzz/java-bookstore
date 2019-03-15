package com.jasontyzzer.javabookstore.controller;

import com.jasontyzzer.javabookstore.model.Book;
import com.jasontyzzer.javabookstore.model.Section;
import com.jasontyzzer.javabookstore.repository.BookRepository;
import com.jasontyzzer.javabookstore.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/sections", produces = MediaType.APPLICATION_JSON_VALUE)
public class SectionController {

    @Autowired
    SectionRepository sectionRepository;

    @GetMapping(value = "")
    public List<Section> getAllSections(){
        return sectionRepository.findAll();
    }
}
