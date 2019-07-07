package com.company.dao;

import com.company.model.Author;

import java.util.List;

public interface AuthorDao {

    Author addAuthor(Author author);

    List<Author> getAllAuthors();

    Author getAuthor(int id);

    void updateAuthor(Author author);

    void deleteAuthor(int id);


}
