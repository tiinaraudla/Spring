package org.sda.beans;

import org.sda.interfaces.BeanName;
import org.springframework.stereotype.Component;

/**
 * @author Tiina Raudla
 * @Date
 */
@Component(value = "secondName")
public class SecondName implements BeanName {
    private String name;
    public SecondName() {
        this.name = "Raudla";
    }
    @Override
    public String getName() {
        return this.name;
    }
}
