package com.TP2;

public class countdown {
    public static void main(String[] args) {
        int timer = 11;
        int i = 0;
        while(i<=10){
            timer-=1;
            System.out.println(timer);
            i+=1;

        }
        System.out.println("Boom");
    }
}
