package org.sda.beans;

import lombok.Setter;
import org.sda.interfaces.BeanBookAuthor;
import org.sda.interfaces.BeanBookTitle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Tiina Raudla
 * @Date
 */
@Setter
@Component
public class MyBeanBook {
    private BeanBookTitle name;

    public MyBeanBook(@Qualifier("name") BeanBookTitle bookTitle) {
        this.name = name;
    }
    public String sayHello() {
        return "Hello!" + BeanBookTitle.getName();
    }
}
