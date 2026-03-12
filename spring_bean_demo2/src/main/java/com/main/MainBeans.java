package com.main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gal.algo.Calc;
import com.gal.algo.PasswordHasher;

public class MainBeans {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //which packages to scan for annotations @Component
        //Componect scan
        context.scan("com");
        context.refresh();
        PasswordHasher bean = context.getBean(PasswordHasher.class);
        PasswordHasher bean2 = context.getBean(PasswordHasher.class);
        System.out.println(bean);
        System.out.println(bean2);
        System.out.println(bean.hash("hello"));

        StringBuilder bean3 = context.getBean(StringBuilder.class);
        System.out.println(bean3);


        Calc bean4 = context.getBean(Calc.class);
        int sum = bean4.add(4, 5);
        System.out.println(sum);

        String[] beans = context.getBeanDefinitionNames();
        for(String bea : beans) {
            System.out.println(bea);
        }

        Object bean5 = context.getBean("myCalc");
        Object bean6 = context.getBean("getCalc");
        //create an object of dataSource and inject into the spring context
        ClassPathXmlApplicationContext xmlContext = new ClassPathXmlApplicationContext("beans.xml");
        xmlContext.refresh();
        StringBuilder bean7 = xmlContext.getBean(StringBuilder.class);
        System.out.println(bean7);


    }
}