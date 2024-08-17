/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_de_exercicios_henrique_7;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author h.moreira
 */
public class Lista_de_Exercicios_Henrique_7 {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean senVal = false;

        while (!senVal) {
            System.out.print("Digite uma senha (minimo de 8 caracteres): ");
            String senha = scan.nextLine();

            if (senha.length() >= 8) {
                senVal = true;
                System.out.println("Senha valida!");
            } else {
                System.out.println("Senha invalida. Tente novamente.");
            }
        }
    }
}
