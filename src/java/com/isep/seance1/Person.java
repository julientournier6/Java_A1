package com.isep.seance1;

import java.lang.reflect.Method;

import java.time.Period;
import java.util.Scanner;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(verifyInput(name))
            this.name = name;
        System.out.println("Le nom est incorrect");
    }

    public static boolean verifyInput(String name){
        if(name.length() > 2)
            return false;
        return true;
    }
}