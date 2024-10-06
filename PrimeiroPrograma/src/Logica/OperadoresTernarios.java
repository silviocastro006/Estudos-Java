/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.Scanner;

public class OperadoresTernarios {
    public static void main(String[] args) {
        /* 1 ) Receber 3 notas, calcular a média e se <= 5 "Reprovado", 
               se >= 6 "Aprovado"

                int n1 = 3;
                int n2 = 2;
                int n3 = 1;

                float media = (float) (n1+n2+n3)/3;

                String resultado = media >= 6 ? "Aprovado":"Reprovado";

                System.out.println(resultado);*/
        
        
        // 2 ) Pedir 3 nomes se 1 dos 3 for Silvio, escreve "Ma oi!"

            Scanner scanner = new Scanner(System.in);
            String nome = null;
            String resultado = null;


            for(int c = 0; c<3; c++){

                nome = scanner.nextLine();
                resultado = nome.equals("Silvio") ? "Ai que susto Silvio Santos":"Cadê Silvio Santos?";

            }


            System.out.println(resultado);
        
        
        
        
        
    }
    
    
    
    
    
}
