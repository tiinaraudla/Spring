package org.sda.beans;

import org.sda.interfaces.BeanAuthor;
import org.springframework.stereotype.Component;

/**
 * @author Tiina Raudla
 */
@Component(value = "Author")
public class BookAuthor implements BeanAuthor {
    private String author;

    public BookAuthor() {
        this.author = "Sophie Benedict";
    }
    @Override
    public String getBookAuthor() {
        return this.author;
    }

}
