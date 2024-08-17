/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_de_exercicios_henrique_6;

import java.util.Scanner;

/**
 *
 * @author h.moreira
 */
public class Lista_de_Exercicios_Henrique_6 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor digite seu peso: ");
        int n1 = scan.nextInt();
        System.out.println("Por favor digite sua altura: ");
        double n2 = scan.nextDouble();
        double imc = n1 / (n2*n2);
        System.out.println("IMC: "+imc);
        
    if (imc < 18.8){
    System.out.println("Abaixo peso");
    
    }else if(imc >= 18.8 & imc <= 24.9){
    System.out.println("Peso normal"); 
    
    }else if(imc >= 25 & imc <= 29.9){
    System.out.println("Sobrepeso");
    
    }else if(imc >= 30 & imc <= 34.9){
    System.out.println("Obesidade");
    
    }




    
    }
}
