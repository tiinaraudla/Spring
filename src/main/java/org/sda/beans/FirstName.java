package org.sda.beans;

import org.sda.interfaces.BeanName;
import org.springframework.stereotype.Component;

/**
 * @author Tiina Raudla
 * @Date
 */
@Component(value = "firstName")
public class FirstName implements BeanName {
    private String name;

    public FirstName() {
        this.name = "Tiina";
    }

    @Override
    public String getName() {
        return this.name;
    }
}
