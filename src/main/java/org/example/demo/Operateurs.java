package org.example.demo;

public class Operateurs {
    public static void main(String[] args) {
        //région opérateurs arithmétiques
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int originalResult = result;
        
        result = result - 1;
        System.out.println(originalResult + " - 1 = " + result);
        originalResult = result;

        result = result * 2;
        System.out.println(originalResult + " * 2 = " + result);
        originalResult = result;

        result = result / 2;
        System.out.println(originalResult + " / 2 = " + result);
        originalResult = result;

        //TODO quand choses à ne pas oublier de faire

        result = result + 8;
        System.out.println(originalResult + " + 8 = " + result);
        originalResult = result;

        result = result % 7;
        System.out.println(originalResult + " modulo 7 = " + result);
        originalResult = result;

        //région opérateurs unaires
        int nombre = +1;
        System.out.println(nombre); //1

        //Opérateur de décrémentation
        nombre --; //qui résume ceci : nombre = nombre -1;
        System.out.println(nombre); //0
        //Opérateur d'incrémentation
        nombre ++; //qui résume ceci : nombre = nombre +1;
        System.out.println(nombre); //1

        //Opérateur de négation unaire
        nombre += 2; //qui résume nombre = nombre -2;
        System.out.println(nombre); //3
        nombre = -nombre; //pour rendre le nombre négatif
        System.out.println(nombre); //-3

        //Opérateur not
        boolean success = false;
        System.out.println(success); //false
        System.out.println(!success); //true

        //région affectation composée
        int x = 5;

        //incrémentation
        x +=5; //x = x + 5
        //décrémentation
        x -=3; //x = x -3

        //Opérateur d'égalité relationnelle
        int value1 = 1;
        int value2 = 2;
        boolean resultat; //valeur false par défaut
        resultat = value1 == value2;
        System.out.println(resultat); //false
        resultat = value1 != value2;
        System.out.println(resultat); //true
        resultat = value1 > value2;
        System.out.println(resultat); //false

        //ET : les deux conditions doivent être vraies
        resultat = (value1 == 1) && (value2 == 2);
        System.out.println(resultat); //true

        //OU : l'une ou l'autre des conditions doit être vraie
        resultat = (value1 == 1) || (value2 == 2);
        System.out.println(resultat); //true car au moins une est vraie



    }
}