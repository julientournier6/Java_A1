package com.TP1.question1;

import java.util.Scanner;

public class volume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir la longeur du pavé en m^3 ");
        float longueur = scanner.nextInt();
        System.out.println("Veuillez saisir la largeur du pavé en m^3 ");
        float largeur = scanner.nextInt();
        System.out.println("Veuillez saisir la hauteur du pavé en m^3 ");
        float hauteur = scanner.nextInt();
        float volume = longueur * largeur * hauteur;
        System.out.println("Le volume du pavé de longueur " + longueur + " de largeur " + largeur + " de hauteur " + " est de : " + volume + " m^3 ");
    }
}
