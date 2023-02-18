package com.TP2;

import java.util.Scanner;

public class egaliteStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir une phrase");
        String premiereChaine = scanner.nextLine();
        System.out.println("Veuillez saisir une autre phrase");
        String deuxiemeChaine = scanner.nextLine();
        if(premiereChaine == deuxiemeChaine){
            System.out.println("Les phrases sont les mêmes");
        } else if (premiereChaine.equals(deuxiemeChaine)) {
            System.out.println("Les phrases sont exactement les mêmes mais les majuscules ne le sont pas.");
        } else {
            System.out.println("Les phrases ne sont pas les mêmes");
        }


    }
}
