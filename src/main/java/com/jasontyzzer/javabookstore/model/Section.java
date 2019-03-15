package com.jasontyzzer.javabookstore.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "section")
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long sectionid;
    private String sectionname;

    @ManyToOne
    @JoinColumn(name = "bookid")
    private Set<Book> books = new HashSet<>();

    public Section() {

    }


}
