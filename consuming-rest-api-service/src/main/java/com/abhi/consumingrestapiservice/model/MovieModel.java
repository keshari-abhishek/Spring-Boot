package com.abhi.consumingrestapiservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class MovieModel {
    private int id;
    private String title;
    private String posterURL;
    private String imdbId;

    // Default constructor
    public MovieModel() {
    }

    // Parameterized constructor
    public MovieModel(int id, String title, String posterURL, String imdbId) {
        this.id = id;
        this.title = title;
        this.posterURL = posterURL;
        this.imdbId = imdbId;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for posterURL
    public String getPosterURL() {
        return posterURL;
    }

    public void setPosterURL(String posterURL) {
        this.posterURL = posterURL;
    }

    // Getter and Setter for imdbId
    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    // toString method for easy debugging
    @Override
    public String toString() {
        return "MovieModel{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", posterURL='" + posterURL + '\'' +
                ", imdbId='" + imdbId + '\'' +
                '}';
    }
}
