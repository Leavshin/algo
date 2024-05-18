package org.example.exercices;

import java.util.Arrays;
import java.util.Scanner;

public class Exercice19 {
    public static void main(String[] args) {
        int[] tableauChiffre = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        System.out.println("Elément à l'index 8 : " + tableauChiffre[8]);

        //Correction différente mais même résultat
        //Tableau de 10 éléments
        int[] tab = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < tab.length; i++) {
            System.out.println("Entrez la valeur n°" + i);
            tab[i]= scanner.nextInt();
        }
        System.out.println(Arrays.toString(tab));
        System.out.println("9ème élément de mon tableau : " + tab[8]);
    }
}
