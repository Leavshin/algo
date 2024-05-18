package org.example.exercices;

public class Exercice2 {
    public static void main(String[] args) {
        int a, b;
        a = 1;
        b = 2;
        System.out.println("Valeur de a au départ : " + a);
        System.out.println("Valeur de b au départ : " + b);
        a = b;
        b = a;
        System.out.println("Valeur de a à la fin : " + a);
        System.out.println("Valeur de b à la fin : " + b);
        System.out.println("Réponse : non");
    }
}
