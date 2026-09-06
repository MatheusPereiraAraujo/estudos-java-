package com.mycompany.poo;
import java.util.Scanner;
public class ConversorTemperatura {
    public static void main(String[] args) {
        float tc, tf;
        Scanner ent = new Scanner(System.in);
        System.out.println("Conversão de temperaturas");
        System.out.println("Digite uma temperatura, em °F:");
        tf = ent.nextFloat();//Leitura da variável
        tc = 5 * (tf - 32) / 9;
        System.out.printf("%.0f°F = %.1f °C",tf,tc);
    }
    
}