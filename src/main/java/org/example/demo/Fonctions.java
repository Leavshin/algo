package org.example.demo;

public class Fonctions {
    public static void main(String[] args) {
        int p;
        p = perimetreRectangle(10, 15);
        System.out.println("Le périmètre du rectangle est : " + p);

        //Pour la procédure
        direBonjour();

    }

    //<visibilité> <autre caractétistique> <type de retour> <nomFonction>(<parametres>)
    public static int perimetreRectangle(int largeur, int longueur) {
        int perimetre;
        perimetre = 2 * (largeur + longueur);
        return perimetre;
    }

    public static void direBonjour() {
        System.out.println("Bonjour,");
        //Procédure qui appelle la fonction du dessus
        System.out.println("Le rectangle du jour a un périmètre de : " + perimetreRectangle(30,50));

    }
}