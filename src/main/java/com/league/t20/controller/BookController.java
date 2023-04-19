package com.league.t20.controller;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book")
public class BookController {

    //@Autowired
    //private BookRepository repository;

    @GetMapping("/{id}")
    public String findById(@PathVariable long id) {
        return "New Book";
    }

    @GetMapping("/")
    public Collection<String> findBooks() {
    	Arrays.asList(new String[]{"aa","bb"});
        return Arrays.asList(new String[]{"Book1","Book2"});
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String updateBook(
      @PathVariable("id") final String id, @RequestBody final String book) {
    	 return "New Book";
    }
}

