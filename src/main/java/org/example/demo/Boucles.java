package org.example.demo;

import java.util.Scanner;

public class Boucles {
    public static void main(String[] args) {
        //Tant que ou WHILE
        int compteur = 1;
        while (compteur < 11) {
            System.out.println("Compteur est égal à : " + compteur);
            compteur++;
        }

        //Création d'une boucle mais avec moyen d'en sortir
        Scanner scanner = new Scanner(System.in);
        int nbr = 0;
        while (true) {
            System.out.println("Saisir le résultat de 2 + 1 pour sortir de la boucle");
            nbr = scanner.nextInt();
            if (nbr == 3) {
                break;
            }
        }

        //FOR
        for (int i = 0; i < 10; i++) {
            System.out.println(i * 2);
        }
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        //DO WHILE
        int nombre = 10;
        do {
            System.out.println(nombre);
            nombre --;
        } while (nombre > 0);

        System.out.println();

        //break et continue
        for (int cpt = 0; cpt < 10; cpt++){
            if (cpt ==3){
                continue; //n'affichera donc pas le 3 car skip le reste
            }
            if (cpt == 8){
                break; //s'arrêtera donc à 7
            }
            System.out.println(cpt);
        }
    }
}
