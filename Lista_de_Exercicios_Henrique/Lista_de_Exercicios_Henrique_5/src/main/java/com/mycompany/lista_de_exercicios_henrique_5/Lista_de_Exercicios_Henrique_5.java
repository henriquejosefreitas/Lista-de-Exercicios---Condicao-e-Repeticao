/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_de_exercicios_henrique_5;

import java.util.Scanner;
/**
 *
 * @author h.moreira
 */
public class Lista_de_Exercicios_Henrique_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Digite um numero");
        num = scan.nextInt();
        
        for (int x = 1; x < 11; x++) {
        System.out.println(num+" . "+x+" = "+num * x);    
        }
    }
}
