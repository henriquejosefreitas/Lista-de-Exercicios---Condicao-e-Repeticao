/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_de_exercicios_henrique_3;

import java.util.Scanner;

/**
 *
 * @author h.moreira
 */
public class Lista_de_Exercicios_Henrique_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero do tipo de equacao");
        System.out.println("Digite 1 para somar '+'");
        System.out.println("Digite 2 para subtrair '-'");
        System.out.println("Digite 3 para multiplicar '*'");
        System.out.println("Digite 4 para dividir '/' \n");
        int si = scan.nextInt();
        System.out.println("Digite o pimeiro numero");
        int n2 = scan.nextInt();
        System.out.println("Digite o segundo numero");
        int n3 = scan.nextInt();
        double res = 0;


        
    if (si == 1){
    res = n2 + n3;
    System.out.println("resultado: "+n2+" + "+n3+" = "+res);
    
    }else if(si == 2){
    res = n2 - n3;
    System.out.println("resultado: "+n2+" - "+n3+" = "+res); 
    
    }else if(si == 3){
    res = n2 * n3;    
    System.out.println("resultado: "+n2+" x "+n3+" = "+res);
    
    }else if(si == 4){
    res = n2 / n3;
    System.out.println("resultado: "+n2+" : "+n3+" = "+res); 
    
    }
    if(si > 4 || si < 1){
        
        System.out.println("ERRO");
        
    }
}
}