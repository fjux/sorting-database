package com.example.sortingdatabase.model;

import com.example.sortingdatabase.model.constants.Genre;
import com.example.sortingdatabase.model.constants.ThemeKeyword;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Book {
    @Id
    private String isbn;
    private String title;
    private String publication;
    private int pageNumber;
    private String description;
    @ManyToMany
    private Collection<Author> authors;
    private Genre genre;
    private Collection<ThemeKeyword> themeKeywords;

    public Book() {
    }

    public Book(String title, String publication, int pageNumber, String description, Collection<Author> authors, Genre genre, Collection<ThemeKeyword> themeKeywords) {
        this.title = title;
        this.publication = publication;
        this.pageNumber = pageNumber;
        this.description = description;
        this.authors = authors;
        this.genre = genre;
        this.themeKeywords = themeKeywords;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Collection<Author> authors) {
        this.authors = authors;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Collection<ThemeKeyword> getThemeKeywords() {
        return themeKeywords;
    }

    public void setThemeKeywords(Collection<ThemeKeyword> themeKeywords) {
        this.themeKeywords = themeKeywords;
    }
}
