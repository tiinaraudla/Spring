package org.sda.beans;

import org.sda.interfaces.BeanBookAuthor;
import org.springframework.stereotype.Component;

/**
 * @author Tiina Raudla
 */
@Component(value = "author")
public class BookAuthor implements BeanBookAuthor {
    private String author;

    public BookAuthor() {
        this.author = "Sophie Benedict";
    }
    @Override
    public String getAuthor() {
        return this.author;
    }
}