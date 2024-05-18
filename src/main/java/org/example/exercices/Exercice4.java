package org.example.exercices;

import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est votre nombre ? ");
        int nombre = scanner.nextInt();
        if (nombre / 3 == 3) {
            System.out.println(nombre + " est divisible par 3");
        } else {
            System.out.println(nombre + " n'est pas divisible par 3");
        }

        //Correction différente mais même résultat
        int nbr;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Entrez un nombre entier :");
        nbr = scanner.nextInt();
        if (nbr % 3 == 0) {
            System.out.println("Votre nombre est divisible par 3");
        } else {
            System.out.println("Votre nombre n'est pas divisible par 3");
        }
    }
}
