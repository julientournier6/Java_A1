package hpathome.com;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        character();
        wand();

    }

    public static void character() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom de votre sorcier : ");
        String name = scanner.nextLine();
        System.out.println("Le nom de votre sorcier est " + name);
        System.out.println("Bien " + name + ", choisissons maintenant une baguette pour toi. Ou du moins, c'est la baguette qui va te choisir !");

    }

    public static void wand(){
        Scanner scanner = new Scanner(System.in);

        boolean sizeCorrect = false;
        boolean coreCorrect = false;
        String corePersonnality;
        int wandSize;
        while (!sizeCorrect) {

            System.out.println("Te considères tu comme : \r\n1. Grand \r\n2. De taille moyenne\r\n3. De petite taille");
            int size = scanner.nextInt();


            if (size == 1) {
                Random r = new Random();
                int minbig = 27;
                int maxbig = 40;
                int bigsize = r.nextInt(maxbig - minbig) + minbig;
                bigsize = wandSize;

                System.out.println("La taille de votre baguette est de " + bigsize + " cm.");
                sizeCorrect = true;
            } else if (size == 2) {
                Random r = new Random();
                int minmedium = 20;
                int maxmedium = 27;
                int mediumsize = r.nextInt(maxmedium - minmedium) + minmedium;
                System.out.println("La taille de votre baguette est de " + mediumsize + " cm.");
                sizeCorrect = true;

            } else if (size == 3) {
                Random r = new Random();
                int minshort = 12;
                int maxshort = 20;
                int shortsize = r.nextInt(maxshort - minshort) + minshort;
                System.out.println("La taille de votre baguette est de " + shortsize + " cm.");
                sizeCorrect = true;
            } else {
                System.out.println("Merci de choisir ta taille ! Tape 1, 2 ou 3 dans la console.");
            }
        }

        while (!coreCorrect){

            System.out.println("Qu'est-ce qui te caractérise le mieux ?\r\n1. La détermination \r\n2. L'imagination\r\n3.L'intelligence\r\n4. L'optimisme\r\n5. La gentillesse");
            int personnality = scanner.nextInt();


            if (personnality==1);{
                corePersonnality = "un crin de licorne ";
                coreCorrect = true;
            }

            else if (personnality==2){
                corePersonnality = "un cheveu de Vélane ";
                coreCorrect = true;
            } else if (personnality==3) {
                corePersonnality = "Une plume de phénix ";
                coreCorrect = true;
            } else if (personnality==4) {
                corePersonnality = "Un ventricule de dragon ";
                coreCorrect = true;
            } else if (personnality==5) {
                corePersonnality = "Une corne de Serpent cornu ";
                coreCorrect = true;
            } else {
                System.out.println("Merci de choisir ta taille ! Tape 1, 2, 3, 4 ou 5 dans la console.");
            }
        }



    }
}

