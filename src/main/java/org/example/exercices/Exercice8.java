package org.example.exercices;

import java.util.Scanner;

public class Exercice8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est le côté AB ? ");
        double ab = scanner.nextDouble();
        System.out.println("Quel est le côté AC ? ");
        double ac = scanner.nextDouble();
        System.out.println("Quel est le le côté BC ? ");
        double bc = scanner.nextDouble();
        if (ab == ac && ab == bc) {
            System.out.println("Le triangle est équilatéral");
        } else if (ab == ac) {
            System.out.println("Le triangle est isocèle en A mais n'est pas équilatéral.");
        } else if (ab == bc) {
            System.out.println("Le triangle est isocèle en B mais n'est pas équilatéral.");
        } else if (ac == bc) {
            System.out.println("Le triangle est isocèle en C mais n'est pas équilatéral.");
        } else {
            System.out.println("Le triangle n'est isocèle ni en A, ni en B, ni en C.");
        }

        //Correction différente mais même résultat
        int ab1, ac1, bc1;
        //Récupération des valeurs fournies par l'utilisateur
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Quel est le côté AB ? ");
        ab1 = scanner.nextInt();
        System.out.println("Quel est le côté AC ? ");
        ac1 = scanner.nextInt();
        System.out.println("Quel est le côté BC ? ");
        bc1 = scanner.nextInt();
        //Test sur les longueurs
        if (ab1 == bc1) { //le côté AB est égal à BC
            if (bc1 == ac1) {  //le côté BC est égal à AC donc équilatéral
                System.out.println("Le triangle est équilatéral");
            } else {    //le côté BC n'est pas égal à AC donc isocèle en B
                System.out.println("Le triangle est isocèle en B mais n'est pas équilatéral.");
            }
        } else { //le côté AB n'est pas égal à BC
            if (bc1 == ac1) {  //le côté BC est égal à AC donc isocèle en C
                System.out.println("Le triangle est isocèle en C mais n'est pas équilatéral.");
            } else {    //le côté BC n'est pas égal à AC
                if (ab1 == ac1) {   //le côté AB est égal à AC donc isocèle en A
                    System.out.println("Le triangle est isocèle en A mais n'est pas équilatéral.");
                } else {    //le côté AB n'est pas égal à AC donc rien
                    System.out.println("Le triangle n'est isocèle ni en A, ni en B, ni en C.");
                }

            }

        }
    }
}
