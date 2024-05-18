package org.example.exercices;

import java.util.Scanner;

public class Exercice10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbr = 0;
        while (true) {
            System.out.println("Saisir un nombre compris entre 1 et 3");
            nbr = scanner.nextInt();
            if (nbr > 1 && nbr < 3) {
                break;
            }
        }

        //Correction différente mais même résultat
        Scanner scanner1 = new Scanner(System.in);
        int nbr1;
        System.out.println("Saisir un nombre compris entre 1 et 3 (compris)");
        nbr1 = scanner1.nextInt();
        while (nbr1 < 1 || nbr1 > 3) {
            System.out.println("Saisie erronée, recommencer : ");
            nbr1 = scanner.nextInt();
        }
        System.out.println("Votre numéro est : " + nbr1);
    }
}
