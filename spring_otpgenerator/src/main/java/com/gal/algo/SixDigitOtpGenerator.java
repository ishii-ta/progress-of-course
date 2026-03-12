package com.gal.algo;

import java.util.Random;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Component
@Primary
public class SixDigitOtpGenerator implements OtpGenerator{
    @Override
    public String getOtp(){
        return ""+new Random().nextInt(1000000);
    }
}
