package org.sda.beans;

import lombok.Setter;
import org.sda.interfaces.BeanName;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Tiina Raudla
 * @Date
 */
@Setter
@Component
public class MyBean {
    private BeanName name;

    public MyBean(@Qualifier("firstName") BeanName name) {
        this.name = name;
    }
    public String sayHello() {
        return "Hello!" + name.getName();
    }
}
