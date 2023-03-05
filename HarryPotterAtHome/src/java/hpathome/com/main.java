package hpathome.com;


import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        character();
        wand();
        house();

    }

    public static void character() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom de votre sorcier : ");
        String name = scanner.nextLine();
        System.out.println("Le nom de votre sorcier est " + name);
        System.out.println("Bien " + name + ", il est l'heure d'aller chez Ollivander pour acheter ta baguette. " +
                "Appuie sur Entrée pour aller chez Ollivander");
        scanner.nextLine();
    }

    public static void wand(){
        Scanner scanner = new Scanner(System.in);

        boolean sizeCorrect = false;
        boolean coreCorrect = false;
        String corePersonnality = "test";
        int wandSize = 3;
        System.out.println("Choisissons maintenant une baguette pour toi. Ou du moins, c'est la baguette qui va te choisir !");

        while (!sizeCorrect) {

            System.out.println("Te considères tu comme : \r\n1. Grand \r\n2. De taille moyenne\r\n3. De petite taille");
            int size = scanner.nextInt();


            if (size == 1) {
                Random r = new Random();
                int minbig = 27;
                int maxbig = 40;
                int bigsize = r.nextInt(maxbig - minbig) + minbig;
                wandSize = bigsize;
                sizeCorrect = true;
            } else if (size == 2) {
                Random r = new Random();
                int minmedium = 20;
                int maxmedium = 27;
                int mediumsize = r.nextInt(maxmedium - minmedium) + minmedium;
                wandSize = mediumsize;
                sizeCorrect = true;


            } else if (size == 3) {
                Random r = new Random();
                int minshort = 12;
                int maxshort = 20;
                int shortsize = r.nextInt(maxshort - minshort) + minshort;
                wandSize = shortsize;
                sizeCorrect = true;

            } else {
                System.out.println("Merci de choisir ta taille ! Tape 1, 2 ou 3 dans la console.");
            }
        }

        while (!coreCorrect){

            System.out.println("Qu'est-ce qui te caractérise le mieux ?\r\n1. La détermination \r\n2. L'imagination\r\n3.L'intelligence\r\n4. L'optimisme\r\n5. La gentillesse");
            int personnality = scanner.nextInt();


            if (personnality==1){
                corePersonnality = "un crin de licorne ";
                coreCorrect = true;
            } else if (personnality==2){
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

        System.out.println("Ta baguette t'a choisi !\r\nC'est une baguette avec "+ corePersonnality + "et qui mesure " + wandSize+ " cm.");
        System.out.println("Il est maintenant l'heure de se rendre à Poudlard pour la cérémonie de répartition !");
        System.out.println("Appuyez sur Entrée pour vous rendre à Poudlard");
        scanner.nextLine();



    }
    public static void house(){
        Scanner scanner = new Scanner(System.in);
        String house = "House";
        boolean correctHouse = false;
        System.out.println("""
                Bienvenu à Poudlard ! Je suis le professeur McGonagall et je vais être en charge de vous enseigner la métamorphose cette année.\r
                Je suis aussi directrice de la maison Gryffondor.\r
                En parlant de maisons, il est l'heure de vous répartir dans votre maison, qui restera la même pour vos 7 ans à Poudlard.\r
                Mettez donc le choixpeau sur votre tête et laissez le vous guidez""");
        System.out.println("Appuyez sur Entrée pour mettre le Choixpeau sur votre tête.");
        scanner.nextLine();
        System.out.println("""
                Oui je vois, je vois, un futur brillant, un grand potentiel... Je décèle 4 qualités principale chez toi.Laquelle considère tu comme la plus grande ?\r
                1. L'audace\r
                2. La loyauté\r
                3. La curiosité\r
                4. L'ambition\r
                """);
        int numberHouse = scanner.nextInt();

        while (!correctHouse){
            if(numberHouse==1){
                house = "Gryffondor ";
                correctHouse = true;
            } else if (numberHouse==2) {
                house = "Poufsouffle ";
                correctHouse = true;
            }else if (numberHouse==3) {
                house = "Serdaigle ";
                correctHouse = true;
            }else if (numberHouse==4) {
                house = "Serpentard ";
                correctHouse = true;
            }else {
                System.out.println("Merci de choisir ta plus grande qualité ! Tape 1, 2, ou 3 dans la console.");
            }
        }

        System.out.println("Félicitation ! Tu es maintenant un "+ house +" !" +
                "\r\nVa maintenant te reposer pour débuter ta première année à Poudlard.");



    }
}

