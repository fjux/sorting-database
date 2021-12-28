package com.example.sortingdatabase.model;

import com.example.sortingdatabase.model.constants.Genre;
import com.example.sortingdatabase.model.constants.ThemeKeyword;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Collection;

@Entity
public class Movie{
    @Id
    private String movieId;
    private String title;
    private String publication;
    @ManyToOne
    private Director director;
    private Genre genre;
    @ManyToMany
    private Collection<ThemeKeyword> themeKeywords;

    public Movie(String title, String publication, Director director, Genre genre, Collection<ThemeKeyword> themeKeywords) {
        this.title = title;
        this.publication = publication;
        this.director = director;
        this.genre = genre;
        this.themeKeywords = themeKeywords;
    }

    public Movie() {
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
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

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
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
