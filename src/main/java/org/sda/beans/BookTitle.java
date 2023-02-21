package org.sda.beans;

import org.sda.interfaces.BeanTitle;
import org.springframework.stereotype.Component;

/**
 * @author Tiina Raudla
 * @Date
 */
@Component(value = "Title")
public class BookTitle implements BeanTitle {
    @lombok.Getter
    private String bookTitle;

    public BookTitle() {
        this.bookTitle = "Grace Kelly";
    }


}
