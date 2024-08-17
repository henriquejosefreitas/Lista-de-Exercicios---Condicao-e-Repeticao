/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_de_exercicios_henrique_4;

import java.util.Scanner;
/**
 *
 * @author h.moreira
 */
public class Lista_de_Exercicios_Henrique_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String usuCor = "groot";
        String senCor = "1234";
        int ten = 0;
        boolean aut = false;

        while (ten < 3 && !aut) {
            System.out.print("Nome de usuario: ");
            String usuario = scan.nextLine();
            System.out.print("Senha: ");
            String senha = scan.nextLine();

            if (usuario.equals(usuCor) && senha.equals(senCor)) {
                aut = true;
                System.out.println("Login bem-sucedido!");
            } else {
                ten++;
                System.out.println("Nome de usuario ou senha incorretos. Tentativas restantes: " + (3 - ten));
            }
        }

        if (!aut) {
            System.out.println("Numero maximo de tentativas atingido. Acesso bloqueado.");
        }

    }
}