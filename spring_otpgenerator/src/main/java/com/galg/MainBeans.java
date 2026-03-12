package com.galg;

import com.gal.algo.UserVerifier;


import javax.sql.DataSource;
import com.gal.algo.UserVerifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainBeans {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();

        // scan packages containing beans
        context.scan("com.gal.algo");
        context.refresh();

        UserVerifier userVerifier=context.getBean(UserVerifier.class);
        userVerifier.verifyUser();
    }
}
