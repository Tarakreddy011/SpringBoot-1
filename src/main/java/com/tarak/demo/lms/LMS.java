package com.tarak.demo.lms;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class LMS {

    @Id
    int id;
    String bookname;
    String author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}