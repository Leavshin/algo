package org.example.exercices;

import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
        int n;
        double prix1 = 0.5;
        double prix2 = 0.4;
        double prix3 = 0.3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre de photocopies désiré");
        n = scanner.nextInt();
        if (n < 10) {
            System.out.println("Le prix pour " + n + " photocopies est de " + n * prix1 + " euros");
        } else {
            if (n >= 10 && n <= 20) {   //souligné en jaune car inutile
                System.out.println("Le prix pour " + n + " photocopies est de " + n * prix2 + " euros");
            } else {
                System.out.println("Le prix pour " + n + " photocopies est de " + n * prix3 + " euros");
            }
        }

        //Correction différente mais même résultat
        //Etape 1 : récupérer le nombre de copies à faire
        int nbCopie;
        double prixAPayer;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Entrer le nombre de photocopies");
        nbCopie = scanner.nextInt();
        System.out.println("Vous avez demandé " + nbCopie + " photocopies.");
        //Etape 2 :
        if (nbCopie < 10) {
            prixAPayer = 0.5 * nbCopie;
        } else {
            if (nbCopie <= 20) {
                prixAPayer = 0.4 * nbCopie;
            } else {
                prixAPayer = 0.3 * nbCopie;
            }
        }
        System.out.println("Pour " + nbCopie + " photocopies, le montant à payer est de " + prixAPayer + " euros.");

    }
}
