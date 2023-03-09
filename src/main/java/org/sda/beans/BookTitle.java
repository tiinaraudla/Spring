package org.sda.beans;

import org.sda.interfaces.BeanBookTitle;
import org.springframework.stereotype.Component;

/**
 * @author Tiina Raudla
 * @Date
 */
@Component(value = "name")
public class BookTitle implements BeanBookTitle {
    private String name;

    public BookTitle() {
        this.name = "Grace Kelly";
    }

}