package org.sda;


import org.sda.beans.BookAuthor;
import org.sda.beans.MyBeanBook;
import org.sda.interfaces.BeanBookTitle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(AnnotationConfigApplicationContext.class);
        applicationContext.refresh();

        MyBeanBook myBeanBook = applicationContext.getBean(MyBeanBook.class);
        System.out.println(myBeanBook.sayHello());

        myBeanBook.setName((BeanBookTitle) new BookAuthor());
        System.out.println(myBeanBook.sayHello());
    }
}