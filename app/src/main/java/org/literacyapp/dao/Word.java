package org.literacyapp.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "WORD".
 */
public class Word {

    private Long id;
    private String language;
    private String text;

    public Word() {
    }

    public Word(Long id) {
        this.id = id;
    }

    public Word(Long id, String language, String text) {
        this.id = id;
        this.language = language;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
