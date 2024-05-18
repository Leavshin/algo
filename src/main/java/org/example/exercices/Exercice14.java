package org.example.exercices;

import java.util.Scanner;

public class Exercice14 {
    public static void main(String[] args) {
        int nbr, l;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        nbr = scanner.nextInt();
        for (l = 1; l < nbr; l++) {

            System.out.println();
        }

        //Correction
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre : ");
        int nbEntre = scanner.nextInt();
        int somme = 0;
        for (int i = 1; i <= nbEntre; i++) {
            somme += i; // somme = somme + i;
        }
        System.out.println("Somme des entiers pour " + nbEntre + " est égal à " + somme);

        //Correction 2
        int somme2 = 0;
        for (int j = 1; j <= nbEntre; j++) {
            System.out.println(j + " + ");
            somme2 += j;
        }
        System.out.print(nbEntre + " = " + (somme2 + nbEntre));
    }
}
