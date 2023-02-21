package org.sda.beans;

import lombok.Setter;
import org.sda.interfaces.BeanAuthor;
import org.sda.interfaces.BeanTitle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Tiina Raudla
 * @Date
 */
@Setter
@Component
public class MyBeanBook {
    private BeanTitle bookTitle;
    private BeanAuthor bookAuthor;
    public MyBeanBook(@Qualifier("Title") BeanTitle bookTitle) {
        this.bookTitle = bookTitle;
    }
    public String sayBook() {
        return "Book" + BeanTitle.getBookTitle();
    }

    public MyBeanBook(@Qualifier("Author") BeanAuthor bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
}
