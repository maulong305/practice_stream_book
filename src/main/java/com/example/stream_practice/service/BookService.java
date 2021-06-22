package com.example.stream_practice.service;

import com.example.stream_practice.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book findById(Long id);
    Book save(Book book);
    boolean delete(Long id);
}
