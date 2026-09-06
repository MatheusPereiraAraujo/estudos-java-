package com.mycompany.poo;
import java.util.Scanner;
import java.lang.Math;
public class Cilindro {
    public static void main(String[] args) {
       float r, alt, area, vol;
       Scanner ent = new Scanner(System.in);
       System.out.println("Área e Volume de um Cilindro");
       System.out.println("Digite o valor do raio:");
       r = ent.nextFloat();
       System.out.println("Digite o valor da altura:");
       alt = ent.nextFloat();
       area = (float) (2 * Math.PI * r * (alt + r));
       vol = (float)(Math.PI * Math.pow(r,2)) * alt;
       System.out.printf("Área: %.2f",area);
       System.out.printf("\nVolume: %.2f",vol);
    }    
}
