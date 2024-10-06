/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces_Simples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;

public class Par_ou_impar {
    public static void main(String[] args) {
        
        // tela simples
        JFrame tela = new JFrame();
        tela.setSize(300,300);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);
        
        
        // painel para a tela
        JPanel fundo = new JPanel();
        fundo.setSize(300,300);
        fundo.setBackground(Color.decode("#c1def3"));
        fundo.setLayout(null);
        tela.add(fundo);
        
        
        // input para o número
        JSpinner spinner = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));
        spinner.setBounds(75, 30, 150, 30);
        fundo.add(spinner);
        
        // botão para verificar
        JButton botao = new JButton("Verificar");
        botao.setBounds(100, 100, 100,30 );
        fundo.add(botao);
        botao.setBackground(Color.white);
        
        // Local de resposta
        JLabel resposta = new JLabel("Aqui aparecerá a resposta");
        resposta.setBounds(55,150,190,100);
        resposta.setBackground(Color.white);
        resposta.setForeground(Color.red);
        resposta.setOpaque(true);
        Border border = BorderFactory.createLineBorder(Color.black);
        resposta.setBorder(border);
        fundo.add(resposta);
        resposta.setHorizontalAlignment(JLabel.CENTER);
                
        
        // adicionando ação para o botão
        botao.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                int num = Integer.parseInt(spinner.getValue().toString());
                if(num%2==0){
                resposta.setText(String.format("O número %d é PAR", num));
                resposta.setForeground(Color.green);
            }
                else{
                    resposta.setText(String.format("O número %d é IMPAR",num));
                    resposta.setForeground(Color.red);
                }
            }
            
        });
        
        
        tela.setResizable(false);
        tela.setVisible(true);
    }
}
