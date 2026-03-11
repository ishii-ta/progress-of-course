package com.gal.algo;
import org.springframework.stereotype.Component;
@Component

public class PasswordHasher {
    public String hash(String password){
        return new StringBuilder(password).reverse().toString();
    }
    public PasswordHasher(){
        System.out.println("PasswordHasher created");
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 146e3583890103c6877db8fe4fdb4558bf85eb99
