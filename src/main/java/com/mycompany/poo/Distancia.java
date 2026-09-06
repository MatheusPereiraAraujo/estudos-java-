package com.mycompany.poo;
import java.util.Scanner;
import java.lang.Math;
public class Distancia {
    public static void main(String[] args) {
        float xA, yA, xB, yB, dist;
        Scanner ent = new Scanner(System.in);
        System.out.println("Distância entre 2 pontos A e B");
        System.out.println("Digite a abcissa de A (xA):");
        xA = ent.nextFloat();
        System.out.println("Digite a ordenada de A (yA):");
        yA = ent.nextFloat();
        System.out.println("Digite a abcissa de B (xB):");
        xB = ent.nextFloat();
        System.out.println("Digite a ordenada de B (yB):");
        yB = ent.nextFloat();
        dist = (float)Math.sqrt(Math.pow(xB-xA,2)+ Math.pow(yB-yA,2));
        System.out.printf("A distância vale: %.1f",dist);
    }   
}