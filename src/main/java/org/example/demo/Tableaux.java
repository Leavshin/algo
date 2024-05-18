package org.example.demo;

import java.util.Arrays;

public class Tableaux {
    public static void main(String[] args) {
        //Déclaration d'un tableau
        int[] ages;
        //Allocation de la mémoire pour 5 élements
        ages = new int[5];
        //int[] ages = new int[5]; //autre façon de faire en 1 ligne

        ages[0] = 10;
        ages[1] = 20;
        ages[2] = 30;
        ages[3] = 40;
        ages[4] = 50;
        System.out.println("Element à l'index 0 : " + ages[0]);
        System.out.println("Element à l'index 1 : " + ages[1]);
        System.out.println("Element à l'index 2 : " + ages[2]);
        System.out.println("Element à l'index 3 : " + ages[3]);
        System.out.println("Element à l'index 4 : " + ages[4]);
        System.out.println(Arrays.toString(ages)); //pour afficher le tableau

        //Taille de mon tableau
        System.out.println("Taille du tableau : " + ages.length); //pour calculer la taille

        //Parcourir un tableau avec une boucle for
        for (int i = 0; i < ages.length; i++) {
            System.out.println("Elément à l'index " + i + " : " + ages[i]);
        }

        boolean[] tableauBoolean;
        String[] tableauChaine = {"Bonjour", "Léa", "Gontier"};
        System.out.println(tableauChaine.length);
        System.out.println(Arrays.toString(tableauChaine));


        //Tableaux multi-dimensionnels
        System.out.println("Tableaux multi-dimensionnels");

        //String[][] titresNoms = new String[3][2];
        String[][] titresNoms = {
                {"Mr", "Mme", "Mlle"},
                {"Zekri Ali", "Gontier"}
        };
        System.out.println(titresNoms[0][0] + " " + titresNoms[1][0]); //M (ligne 0, colonne0) Zekri Ali (ligne 1, colonne 0)
        System.out.println(titresNoms[0][2] + " " + titresNoms[1][1]); //Mlle (ligne 0, colonne1) Gontier (ligne 1, colonne 1)

        //Taille du tableau
        System.out.println(titresNoms.length); //ne va pas calculer le nombre de données mais le nombre d'éléments, donc 2 tableaux et non pas 5 noms
        System.out.println(titresNoms[1].length); //calcule le nombre d'éléments dans le 2ème tableau, donc 2
        System.out.println(titresNoms[2].length); //3 éléments puisque 1er tableau
    }

}