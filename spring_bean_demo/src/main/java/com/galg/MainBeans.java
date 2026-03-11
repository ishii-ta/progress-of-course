package com.galg;

import com.gal.algo.PasswordHasher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainBeans {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.gal.algo");
        context.refresh();
        PasswordHasher bean = context.getBean(PasswordHasher.class);
        System.out.println(bean);
        System.out.println(bean.hash("hello"));
        context.close();
    }
}
