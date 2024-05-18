package org.example.exercices;

import java.util.Arrays;
import java.util.Scanner;

public class Exercice20 {
    public static void main(String[] args) {
        int[] tabNote = new int[15];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < tabNote.length; i++) {
            System.out.println("Entrez la valeur n°" + i);
            tabNote[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(tabNote));

        //Autre façon d'afficher le tableau
        for (int i = 1; i < tabNote.length; i++) {
            System.out.println("Note " + i + " : " + tabNote[i]);
        }

        //Correction différente mais même résultat
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Combien de notes avez-vous à saisir ?");
        int nbNotes = scanner.nextInt();
        int[] tab = new int[nbNotes];
        saisieTab(tab);
        System.out.println(Arrays.toString(tab));
    }

    public static void saisieTab(int[] tableau) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Entrer la valeur n°" + (i + 1));
            tableau[i] = scanner.nextInt();
        }
    }
}
