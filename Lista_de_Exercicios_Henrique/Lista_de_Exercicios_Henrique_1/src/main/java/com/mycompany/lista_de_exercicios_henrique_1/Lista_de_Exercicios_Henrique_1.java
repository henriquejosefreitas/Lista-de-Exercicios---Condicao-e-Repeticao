/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_de_exercicios_henrique_1;

import java.util.Scanner;
/**
 *
 * @author h.moreira
 */
public class Lista_de_Exercicios_Henrique_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua primeira nota: ");
        int n1 = scan.nextInt();
        System.out.println("Digite sua segunda nota: ");
        int n2 = scan.nextInt();
        System.out.println("Digite sua terceira nota: ");
        int n3 = scan.nextInt();

        double med = (n1+n2+n3)/3;
        System.out.println("Sua media: "+med);
        
    if (med >= 7){
    System.out.println("Aprovado");
    
    }else if(med >= 5 && med < 7 ){
    System.out.println("Recuperacao"); 
    
    }else if(med < 5){
    System.out.println("Reprovado");
    
    }




    
    }
}
