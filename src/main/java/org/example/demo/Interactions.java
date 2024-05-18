package org.example.demo;

import java.util.Scanner;

public class Interactions {
    public static void main(String[] args) {
        //Le différents print (prinIn, print, printf (f pour formated))
        System.out.println("Bonjour");
        System.out.println("à tous");
        System.out.println(""); //permet de sauter une ligne
        System.out.print("Bonjour"); //ne va pas passer à la ligne et pas d'espace
        System.out.print("à tous");
        System.out.println();

        int age = 25;
        double poids = 70;
        String nom = "John Doe";
        System.out.printf("\nNom : %s, Age : %d, Poids : %.2f kg\n", nom, age, poids);

        //L'objet scanner
        Scanner scanner = new Scanner(System.in);

        //Les différents next de scanner, valables pour tous les types :
        // Demander le nom à l'utilisateur avec nextLine
        System.out.println("Quel est votre nom ? ");
        String nomUtilisateur = scanner.nextLine(); //prend toute la ligne
        System.out.println("Bonjour " + nomUtilisateur);

        //Demander le prénom à l'utilisateur avec next
        System.out.println("Quel est votre prénom ? ");
        String prenomUtilisateur = scanner.next(); //s'arrête au premier espace
        System.out.println("Bonjour " + prenomUtilisateur);

        //Demander l'âge à l'utilisateur avec nextInt
        System.out.println("Quel est votre âge ? ");
        int ageUtilisateur = scanner.nextInt();
        System.out.println("Vous avez " + ageUtilisateur + " ans");

        scanner.nextLine(); //permet de récupérer la touche entrée laissée par le nextIn
        //Demander la ville à l'utilisateur avec next
        System.out.println("Quel est votre ville ? ");
        String villeUtilisateur = scanner.nextLine(); //impossible d'entrer la ville sauf si manipulation au-dessus
        System.out.println("Vous habitez à " + villeUtilisateur);

        //Fermer le scanner
        //scanner.close(); //très peu pratiqué en vérité car quand fermé, fermé
    }
}
