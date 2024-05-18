package org.example.exercices;

public class Exercice18bis {
    public static void main(String[] args) {
        System.out.println(presentation("Léa", "Gontier", 25));
    }

    public static String presentation(String prenom, String nom, int age ){
        String message = "Bonjour " + prenom + " " + nom + ", vous avez " + age + " ans.";
        return message;
        //Autre façon de faire
        //return "Bonjour " + prenom + " " + nom + ", vous avez " + age + "ans.";
    }
}
