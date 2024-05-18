package org.example.exercices;

import java.util.Scanner;

public class Exercice9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est votre taille (en cm) ? ");
        int taille = scanner.nextInt();
        System.out.println("Quel est votre poids (en kg) ? ");
        int poids = scanner.nextInt();
        if (taille >= 145 && taille <= 171 && poids >= 43 && poids <= 65) {
            System.out.println("Votre taille correspondante est la 1");
        } else if (taille >= 160 && taille <= 182 && poids >= 48 && poids <= 71) {
            System.out.println("Votre taille correspondante est la 2");
        } else if (taille >= 163 && taille <= 183 && poids >= 54 && poids <= 77) {
            System.out.println("Votre taille correspondante est la 3");
        } else {
            System.out.println("Vous n'avez pas de taille correspondante.");
        }

        //Correction
        int t;
        int p;
        //Récupération des infos de l'utilisateur
        //Test conditionnel pour savoir quelle taille
        //if ((t >= 145 && t < 172 && p >= 43 && p < 48) || (t >= 145 && t < 169 && p >= 48 && p < 54) || (t >= 145 && t < 166 && p >= 54 && p < 60) || (t >= 145 && t < 163 && p >= 60 && p < 66)) {
        System.out.println("Taille 1");


    }
}
