package com.deepti.bookcatalog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deepti.bookcatalog.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

	List<Book> findByTitle(String title);

	List<Book> findByAuthname(String authname);

	List<Book> findByIsbn(String isbn);

}
