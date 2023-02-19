package com.TP2;

import java.util.Scanner;

public class factorielle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt(), factorielle = 1;
        for (int i = 1; i <= n; i++) {
            factorielle*=i;

        }

        System.out.println(n + "! = " + factorielle);



    }
}
