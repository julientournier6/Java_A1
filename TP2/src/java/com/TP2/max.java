package com.TP2;

import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        if (a>b){
            System.out.printf(a + " est le maximum. ");
            System.out.printf(b + " est le minimum. ");
        } else if (a == b) {
            System.out.println("Les deux nombres sont égaux, merci de saisir deux nombres différentes");
        } else {
            System.out.printf(b + " est le maximum. ");
            System.out.printf(a + " est le minimum. ");
        }
    }
}
