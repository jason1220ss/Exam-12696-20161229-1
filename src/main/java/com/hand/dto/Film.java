package com.hand.dto;

/**
 * Created by jason on 2016/12/29.
 */
public class Film {
    private Integer filmId;
    private String title;
    private String description;
    private Integer languageId;

    public Film() {}

    public Film(String title, String description, int languageId) {
        this.title = title;
        this.description = description;
        this.languageId = languageId;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }
}
