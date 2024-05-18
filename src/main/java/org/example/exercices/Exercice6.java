package org.example.exercices;

import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est votre capital ? ");
        double c = scanner.nextInt();
        System.out.println("Quel est le taux ? ");
        double t = scanner.nextDouble();
        t = 1 + t / 100;
        System.out.println("Quel est le nombre d'années ? ");
        int n = scanner.nextInt();
        double p = Math.pow(t, n);
        System.out.println("Le résultat est : " + c * p);

        //Correction différente mais même résultat
        double ci, ta, na, cf; //capital initial, taux, nombre d'années, capital final
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Saisir le capital de départ : ");
        ci = scanner.nextDouble();
        System.out.println("Saisir le taux en % : ");
        ta = scanner.nextDouble();
        System.out.println("Saisir le nombre d'années : ");
        na = scanner.nextDouble();
        //Récupération utilisateur fini
        //Formule pour calcul cf et capital final
        cf = ci * Math.pow((1 + 7), na);
        System.out.println("Pour un montant initial de " + ci + " avec un taux de " + ta + "% et un nombre d'années " + na + " votre capital final sera de " + cf);
        //System.out.println("Votre gain sera de " + Math.round(cf-ci));
    }
}
