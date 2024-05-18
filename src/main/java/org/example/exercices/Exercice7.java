package org.example.exercices;

import java.util.Scanner;

public class Exercice7 {
    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez l'âge de l'enfant : ");
        age = scanner.nextInt();
        if (age >= 3 && age <= 6) {
            System.out.println("Catégorie : Baby");
        } else if (age >= 7 && age <= 8) {
            System.out.println("Catégorie : Poussin");
        } else if (age >= 9 && age <= 10) {
            System.out.println("Catégorie : Pupille");
        } else if (age >= 11 && age <= 12) {
            System.out.println("Catégorie : Minime");
        } else {
            System.out.println("Catégorie : Cadet");
        }

        //Correction différente mais même résultat
        int agee;
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Entrer l'âge de l'enfant : ");
        agee = scanner.nextInt();
        if (age < 3 || age >= 18) {
            System.out.println("Vous ne pouvez pas vous inscrire au club");
        } else {
            System.out.println("Voyons dans quelle catégorie est votre enfant : ");
            if (agee <= 6) {
                System.out.println("- Baby");
            } else {
                if (agee <= 8) {
                    System.out.println("- Poussin");
                } else {
                    if (agee <= 10) {
                        System.out.println("- Pupille");
                    } else {
                        if (agee <= 12) {
                            System.out.println("- Minime");
                        } else {
                            System.out.println("- Cadet");
                        }
                    }
                }
            }
        }

        //Autre solution possible
        int ageee;
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Entrez l'âge de l'enfant : ");
        ageee = scanner.nextInt();
        switch (age) {
            case 3, 4, 5, 6:
                System.out.println("- Baby");
                break;
            case 7, 8:
                System.out.println("- Poussin");
                break;
            case 9, 10:
                System.out.println("- Pupille");
                break;
            case 11, 12:
                System.out.println("- Minime");
                break;
            case 13, 14, 15, 16, 17:
                System.out.println("- Cadet");
                break;
            default:
                System.out.println("Vous ne pouvez pas vous inscrire au club");
        }
    }
}