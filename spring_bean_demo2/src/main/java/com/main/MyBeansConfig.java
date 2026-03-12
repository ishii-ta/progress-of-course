package com.main;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Bean;
import com.gal.algo.Calc;
import com.gal.algo.MyCalc;

@Configuration
public class MyBeansConfig {
    //will create beans and provide to spring context, then onwards context will manage
    @Bean
    StringBuilder getStringBuilder(){
        return new StringBuilder("bean from Configuration");
    }

    @Bean
    @Primary
    Calc getCalc(){
        return new MyCalc();
    }
    @Bean(name="getCalcNamedBean")
    Calc getCalc2(){
        return new MyCalc();
    }
}