package com.company;

/**
 * Created by Acsel on 24.06.2017.
 */
public class Challenge {
    public Challenge(String author, String type, String text) {
        this.author = author;
        this.type = type;
        this.text = text;
    }
    private String author;
    private String type;
    private String text;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return  "=================================================\r\n" +
                "Challenge{" +
                "author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", text='" + text + '\'' +
                '}'+
                "\r\n=================================================";
    }
}
