package com.galg;

import com.gal.algo.PasswordHasher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainBeans {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();

        context.scan("com.gal");   // FIXED
        context.refresh();

        PasswordHasher bean = context.getBean(PasswordHasher.class);
        PasswordHasher bean2 = context.getBean(PasswordHasher.class);

        System.out.println(bean);
        System.out.println(bean2);
        System.out.println(bean.hash("hello"));

        String[] beans = context.getBeanDefinitionNames();
        for(String beanname : beans){
            System.out.println(beanname);
        }

        Object bean5 = context.getBean("getCalc");  // now works
        System.out.println(bean5);

    }
}