/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces_Simples;

import javax.swing.*;
import java.awt.*;

public class InputsJOptionPane {
    public static void main(String[] args) {
        
        int n=1;
        int tot = 0;
        int tot_par = 0;
        int tot_impar = 0;
        int acm100 = 0;
        float media;
        int cont = 0;
        
        while(n!=0){
            
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um valor<br>(0 interrompe)</html>", "Entrada de dados", JOptionPane.INFORMATION_MESSAGE));
            if (n==0){
                break;
            }
            tot += n;
            
            if(n%2==0){
                tot_par +=1;
            } else{
                tot_impar += 1;
            }
            
            if(n>100){
                acm100 +=1;
            }
            
            cont++;
        }
        
        media = (float) tot / cont;
        
        String resp = String.format("<html>Resultados<br>------------<br>Total de Valores: %d<br>Total de Pares: %d<br>Total de Ímpares: %d<br>Acima de 100: %d<br>Média dos valores: %.2f</html>",tot,tot_par,tot_impar,acm100,media);
        JOptionPane.showMessageDialog(null, resp, "Resultado Final", JOptionPane.INFORMATION_MESSAGE);
    }
}
