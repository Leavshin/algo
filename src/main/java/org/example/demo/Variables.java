package org.example.demo;

public class Variables {
    public static void main(String[] args) {

        //Déclaration d'une variable
        /*
        Sur
        plusieurs
        lignes
         */

        // Syntaxe : <type> <nom> (ou identificateur), ! minuscule: primitif; majuscule: objet
        int age; //int entier sur 32 bites
        long indice; //long entier sur 64 bites
        float distance;
        double monnaie;
        boolean estVrai;
        char lettre;
        //chaîne de caractères : String n'est pas considéré comme un type primitif
        String prenom;

        //<type> <nom> = valeur;
        int jour = 5;
        //Affectation
        age= 35;
        indice = 10_000; //_ possible pour nombres longs
        distance = 12.74F; //f obligatoire pour différencier du double
        monnaie = 15.5;
        estVrai = false;
        lettre = '1'; //guillemets simples
        prenom = "Léa";

        System.out.println(prenom);

    }
}
