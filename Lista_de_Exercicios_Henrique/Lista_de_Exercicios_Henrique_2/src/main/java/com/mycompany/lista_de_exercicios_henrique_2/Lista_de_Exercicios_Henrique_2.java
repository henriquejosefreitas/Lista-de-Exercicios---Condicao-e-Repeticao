/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_de_exercicios_henrique_2;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author h.moreira
 */
public class Lista_de_Exercicios_Henrique_2 {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(1, 100);
        int resposta = 0;
        int palpite;

        System.out.println("Tente adivinhar o numero entre 1 e 100!");

        while (resposta != numeroAleatorio) {
            System.out.print("Digite seu palpite: ");
            palpite = scan.nextInt();
            
            if (palpite < numeroAleatorio) {
                System.out.println("O numero e maior!\n");
            } else if (palpite > numeroAleatorio) {
                System.out.println("O numero e menor!\n");
            } else if (palpite == numeroAleatorio){
                System.out.println("Parabens! Voce acertou o numero!\n");
                resposta = numeroAleatorio;
            }
        }
    }
}
