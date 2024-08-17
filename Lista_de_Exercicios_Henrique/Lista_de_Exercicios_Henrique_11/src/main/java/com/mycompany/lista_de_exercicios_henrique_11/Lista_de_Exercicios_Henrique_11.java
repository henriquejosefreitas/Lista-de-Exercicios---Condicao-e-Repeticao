/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_de_exercicios_henrique_11;
import java.util.Scanner;
/**
 *
 * @author h.moreira
 */
public class Lista_de_Exercicios_Henrique_11 {


   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura:");
        double temperatura = scan.nextDouble();

        System.out.println("Digite a unidade de origem (C para Celsius, F para Fahrenheit):");
        char unidadeOrigem = scan.next().charAt(0);

        if (unidadeOrigem == 'c') {
            double fahrenheit = (temperatura * 9/5) + 32;
            System.out.println(temperatura + " graus Celsius e igual a " + fahrenheit + " graus Fahrenheit.");
        } else if (unidadeOrigem == 'f') {
            double celsius = (temperatura - 32) * 5/9;
            System.out.println(temperatura + " graus Fahrenheit e igual a " + celsius + " graus Celsius.");
        } else {
            System.out.println("Unidade de origem invalida. Por favor, digite 'C' para Celsius ou 'F' para Fahrenheit.");
        }

    }
}