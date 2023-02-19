package com.TP2;

import java.util.Scanner;

public class carres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Merci de saisir un entier");
        int x = scanner.nextInt();
        System.out.println("La valeur de x est : "+ x + "et la valeur de x² est : "+ x*x);
    }
}
