package com.TP2;


import java.util.Scanner;

public class parite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un entier");
        int a = scanner.nextInt();
        if ( a%2==0) {
            System.out.printf("%d est un nombre pair", a);
        }
        else{
            System.out.printf("%d est une nombre impair", a);
        }

    }
}
