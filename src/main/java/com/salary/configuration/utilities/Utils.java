package com.salary.configuration.utilities;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.Random;

@Component
public class Utils {





    private final Random RANDOM = new SecureRandom();
    private final String ALPHABET="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String generateId(int lenght){
        return randomstring(lenght);
    }


    private String randomstring(int lenght){

        StringBuilder rvalue= new StringBuilder(lenght);

        for (int i=0; i < lenght; i++){
            rvalue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }

        return new String(rvalue);
    }}