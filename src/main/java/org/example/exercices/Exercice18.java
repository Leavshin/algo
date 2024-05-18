package org.example.exercices;

import java.util.Scanner;

public class Exercice18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre 1");
        int nbr1 = scanner.nextInt();
        System.out.println("Veuillez saisir le nombre 2");
        int nbr2 = scanner.nextInt();
        int nbrmax;
        nbrmax = grandNombre(nbr1, nbr2);
        System.out.println("Le nombre le plus grand entre " + nbr1 + " et " + nbr2 + " est : " + nbrmax);

        //Correction partie 1
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier nombre : ");
        int nbr = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxième nombre : ");
        int nbrr = scanner.nextInt();
        System.out.println(plusGrand(nbr, nbrr));
    }

    public static int grandNombre(int nbr1, int nbr2) {
        int grandNbr;
        if (nbr1 > nbr2) {
            grandNbr = nbr1;
        } else {
            grandNbr = nbr2;
        }
        return grandNbr;
    }

    //Correction partie 2
    public static int plusGrand(int nbrA, int nbrB) {
        int lePlusGrand;
        if (nbrA > nbrB) {
            lePlusGrand = nbrA;
        } else {
            lePlusGrand = nbrB;
        }
        return lePlusGrand;
    }

    //Autre méthode plus concise
    public static int plusGrandV2(int nbrA, int nbrB) {
        if (nbrA > nbrB) {
            return nbrA;
        }
        return nbrB;
    }
}