package com.TP2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix;
        System.out.println("Choisissez un programme");

        choix = scanner.nextInt();

        switch (choix){
            case 1 :
                new discriminant();
                break;
            case 2 :
                new countdown();
                break;


        }
    }



    }


