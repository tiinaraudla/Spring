package org.sda;

import org.sda.beans.BookAuthor;
import org.sda.beans.MyBeanBook;
import org.sda.configuration.ApplicationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(ApplicationConfiguration.class);
        applicationContext.refresh();

        MyBeanBook myBeanBook = applicationContext.getBean(MyBeanBook.class);
        System.out.println(myBeanBook);

        myBeanBook.setBookAuthor(new BookAuthor());
        System.out.println(myBeanBook);

    }
}