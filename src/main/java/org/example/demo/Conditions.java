package org.example.demo;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        // si => if
        if (3 > 2) {
            System.out.println("3 est supérieur à 2");
        }
        if (5 > 3.) System.out.println("5 est supérieur à 3"); //possible de le mettre sur 1seule ligne quand 1seule

        //else = sinon
        double note = 16;
        if (note >= 16) {
            System.out.println("Très bien");
        } else if (note >= 14) {
            System.out.println("Bien");
        } else if (note >= 12) {
            System.out.println("Assez bien");
        } else {
            System.out.println("Sans mention");
        }

        System.out.println("1 - Dire bonjour");
        System.out.println("2 - Dire bon après-midi");
        System.out.println("3 - Dire bonne nuit");

        int choix = 2;
        switch (choix) {
            case 1:
                System.out.println("Bonjour !");
                break;
            case 2:
                System.out.println("Bon après-midi !");
                break; //si pas de break, continue jusqu'au prochain break
            case 3:
                System.out.println("Bonne nuit !");
                break;
            default:
                System.out.println("Je n'ai pas compris votre choix");
        }

        //Autre alternative mais possible que si une seule ligne par case
        switch (choix) {
            case 1 -> System.out.println("Bonjour"); //pas besoin de break
            case 2 -> System.out.println("Bon après-midi");
            case 3 -> System.out.println("Bonne nuit");
            default -> System.out.println("Je n'ai pas compris votre choix");
        }

        //Exemple slide 47
        int n;
        System.out.println("Entrez un nombre");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Ce nombre est négatif");
        } else {
            if (n == 0) {
                System.out.println("Ce nombre est nul");
            } else {
                System.out.println("Ce nombre est positif");
            }
        }

        //Exemple slide 48, résultat idem mais toutes les conditions sont testées
        System.out.println("Entrez un nombre");
        n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Ce nombre est négatif");
        }
        if (n == 0) {
            System.out.println("Ce nombre est nul");
        }
        if (n > 0) {
            System.out.println("Ce nombre est positif");
        }

        //Exemple ET OU -> importance des priorités avec les ()
        boolean a = true; //parent1 prêt
        boolean b = false; //parent2 pas prêt
        boolean c = true; //enfant1 prêt
        boolean d = false; //enfant2 pas prêt

        boolean result1 = a || b && c && d;
        boolean result2 = (a || b) && (c && d);

        System.out.println("result 1 : " + result1);
        System.out.println("result 2 : " + result2);

    }
}
