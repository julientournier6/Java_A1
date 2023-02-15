package com.TP1.question1;

import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int division = premierEntier / deuxiemeEntier;
        int resteDivision = premierEntier % deuxiemeEntier;
        System.out.println("La division de " + premierEntier + " par " + deuxiemeEntier + " est égale à " + division + " et le reste est de " + resteDivision);
    }
}