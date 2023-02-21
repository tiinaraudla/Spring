package org.sda.configuration;

import org.sda.beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Tiina Raudla
 * @Date
 */
@Configuration
public class ApplicationConfiguration {
    @Bean
    public MyBean myBean() {
        MyBean myBean = new MyBean();
        myBean.setName("Tiina");
        return myBean;
    }
}
