package com.gal.algo;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class FourDigitOtpGenerator implements OtpGenerator{
    @Override
    public String getOtp(){
        return ""+new Random().nextInt(1000000);
    }
}
