package org.example.java6nsu26sd21102.service;

import org.example.java6nsu26sd21102.dto.BookRequest;
import org.example.java6nsu26sd21102.dto.BookResponse;

import java.util.List;

public interface BookService {

    List<BookResponse> findAll();

    BookResponse findById(long id);

    BookResponse add(BookRequest book);

    BookResponse update(BookRequest book, long id );

    void delete(long id);
}
