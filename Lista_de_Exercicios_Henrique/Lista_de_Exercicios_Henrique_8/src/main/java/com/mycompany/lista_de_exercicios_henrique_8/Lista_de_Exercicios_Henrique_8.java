/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_de_exercicios_henrique_8;

import java.util.Scanner;

/**
 *
 * @author h.moreira
 */
public class Lista_de_Exercicios_Henrique_8 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();
        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de numeros pares: " + pares);
        System.out.println("Quantidade de numeros impares: " + impares);

    }
}
