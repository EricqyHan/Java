package com.company.dao;

import com.company.model.Author;

import java.util.List;

public interface AuthorDao {

    Author addAuthor(Author author);

    List<Author> getAllAuthors();

    Author getAuthor(int author_id);

    void updateAuthor(Author author);

    void deleteAuthor(int author_id);


}
