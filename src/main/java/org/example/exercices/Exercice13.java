package org.example.exercices;

import java.util.Scanner;

public class Exercice13 {
    public static void main(String[] args) {
        int nbr, j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre 1");
        nbr = scanner.nextInt();
        System.out.println("Veuillez saisir le nombre 2");
        nbr = scanner.nextInt();
        System.out.println("Veuillez saisir le nombre 3");
        nbr = scanner.nextInt();
        System.out.println("Veuillez saisir le nombre 4");
        nbr = scanner.nextInt();
        System.out.println("Veuillez saisir le nombre 5");
        nbr = scanner.nextInt();
        System.out.println("Veuillez saisir le nombre 6");
        nbr = scanner.nextInt();

        for (j = 0; j < nbr; ) {
            if (j < nbr) {
                continue;
            } else {
                j = nbr;
            }

        }
        System.out.println("Le nombre le plus grand est : " + j);

        //Correction, pas réussi
        Scanner scanner1 = new Scanner(System.in);
        int nbEntre, nbMax;
        nbMax = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Veuillez saisir le nombre " + i + " : ");
            nbEntre = scanner.nextInt();
            if (nbEntre > nbMax) {
                nbMax = nbEntre;
            }
        }
        System.out.println("Le nombre le plus grand que vous avez saisi est : " + nbMax);

        //Autre type de réponse, plus complète
        Scanner scanner2 = new Scanner(System.in);
        int nbrEntre, nbrMax;
        nbrMax = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Veuillez saisir le nombre " + i + " : ");
            nbrEntre = scanner.nextInt();

            //pour la 1ère itération
            if ((nbrEntre > nbrMax) || (i == 1)) {
                nbrMax = nbrEntre;
            }
        }
        System.out.println("Le nombre le plus grand que vous avez saisi est : " + nbrMax);

    }
}
