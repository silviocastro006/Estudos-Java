/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeiros_comandos;

import java.util.Scanner;

public class UsandoSwitchCase {
    public static void main(String[] args) {
        // Aqui vou fazer o mesmo exemplo do exercíci da aula 10 parte 2
        
        Scanner teclado = new Scanner(System.in);
        
        int pernas = teclado.nextInt();
        String tipo;
        switch(pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6,8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
    }
}
