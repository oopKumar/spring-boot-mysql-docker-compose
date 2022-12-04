package com.oop.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oop.binding.Book;

public interface BookRepository extends JpaRepository<Book, Serializable> {

}
