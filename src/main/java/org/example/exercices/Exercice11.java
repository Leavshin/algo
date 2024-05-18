package org.example.exercices;

import java.util.Scanner;

public class Exercice11 {
    public static void main(String[] args) {
        double ci, ta, cf; //capital initial, taux, nombre d'années, capital final
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir le capital de départ : ");
        ci = scanner.nextDouble();
        System.out.println("Saisir le taux en % : ");
        ta = scanner.nextDouble();
        //Formule pour calcul cf et capital final
        //cf = ci * Math.pow((1 + 7));
        //System.out.println("Pour un montant initial de " + ci + " avec un taux de " + ta + "% et un nombre d'années " + na + " votre capital final sera de " + cf);

        double som = ci;
        //while (som <= ci * 2) {
        //ci++;
        //som = som;
        //System.out.println("Le nombre d'années pour doubler le capital initial est de " + som);
        //}
        //TODO exo à refaire

        //Correction
        double capital;
        int annees = 0;
        double taux;
        double capitalDouble;
        double capitalFinal;

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Saisir le capital de départ : ");
        capital = scanner.nextDouble();
        capitalDouble = capital * 2;
        capitalFinal = capital;
        System.out.println("Saisir le taux : ");
        taux = scanner.nextDouble() / 100;

        //Combien d'années pour avoir le double du capital
        while (capitalFinal <= capitalDouble) {
            annees = annees + 1; //ou annees++
            capitalFinal = capital * Math.pow((1 + taux), annees);
            System.out.println("annee : " + annees + " capital à : " + capitalFinal);
        }
        System.out.println("Après " + annees + " années, j'aurai : " + capitalFinal + " sur mon compte.");

    }
}
