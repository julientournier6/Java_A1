package com.TP1.question1;

import java.util.Scanner;

public class somme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier + "est égale à " + somme);
        System.out.println("Veuillez saisir le premier entier");

    }
}