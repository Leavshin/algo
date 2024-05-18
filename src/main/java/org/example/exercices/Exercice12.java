package org.example.exercices;

import java.util.Scanner;

public class Exercice12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int resultat = i * 9;
            System.out.println("9 x " + i + " = " + resultat);
        }

        //Correction différente mais même résultat, en plus poussé
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle table de multiplication voulez-vous ?");
        int nbr = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + nbr + " = " + (i * nbr));
        }

    }
}
