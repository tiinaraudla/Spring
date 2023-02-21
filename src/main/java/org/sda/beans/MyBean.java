package org.sda.beans;

import lombok.Setter;

/**
 * @author Tiina Raudla
 * @Date
 */
@Setter
public class MyBean {
    private String name;

    public String sayHello() {
        return "Hello!" + name;
    }
}
