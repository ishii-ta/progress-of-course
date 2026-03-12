package com.gal.algo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserVerifier {

    @Autowired
    OtpGenerator otpGenerator;

    @Autowired
    public UserVerifier(OtpGenerator otpGenerator){
        super();
        System.out.println("Constructor setting the otpGenerator" + otpGenerator);
        this.otpGenerator = otpGenerator;
    }

    @Autowired
    public void setUserVerifier(OtpGenerator otpGenerator){
        System.out.println("Setting setter otpGenerator" + otpGenerator);
        this.otpGenerator = otpGenerator;
    }

    public OtpGenerator getOtpGenerator(){
        return otpGenerator;
    }
    public void verifyUser(){
        String otp = otpGenerator.getOtp();
        if(otp != null){
            System.out.println("User verified");
        }
        else{
            System.out.println("verification failed");
        }
    }

}