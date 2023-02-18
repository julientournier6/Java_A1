package com.TP2;

import java.util.Scanner;

public class discriminant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        double a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        double b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        double c = scanner.nextInt();
        System.out.println("L`equation est : "+a+"x² + "+b+"x + "+c);
        double delta = (int) (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0) {
            System.out.println("Ce polynome a deux racines imaginaires");
            double sqrt = -Math.sqrt(-delta);
            double xr = -b/(2*a);
            double xi = (-sqrt)/(2*a);
            System.out.println("Ses racines sont xa = "+ xr + " + " + xi + "i" + " et xb = " + xr + " - " + xi + "i");
        } else if (delta == 0) {
            System.out.println("Ce polynome a une racine double");
            double x =(-b/(2*a));
            System.out.println("Sa racine est x = "+x);
        } else {
            System.out.println("Ce polynome a deux racines");
            double xa = (-b-Math.sqrt(delta))/(2*a);
            double xb = (-b+Math.sqrt(delta))/(2*a);
            System.out.println("Ses racines sont xa = "+xa + " et xb = " + xb);
        }


    }
}
