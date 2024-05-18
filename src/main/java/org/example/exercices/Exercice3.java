package org.example.exercices;

public class Exercice3 {
    public static void main(String[] args) {
        int a, b, c;
        a = 1;
        b = 2;
        System.out.println("Valeur de a au départ : " + a);
        System.out.println("Valeur de b au départ : " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("Valeur de a à la fin : " + a);
        System.out.println("Valeur de b à la fin : " + b);
    }
}
