/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VerificadorEleitoral;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tela_eleitor {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, UnsupportedLookAndFeelException, InstantiationException {
        
        // Criação da tela principal
        JFrame tela = new JFrame("Exercício eleitor - Curso em Video");
        tela.setSize(515,639);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);
        tela.setResizable(false);
        
        // Criar imagem para fundo da tela
        ImageIcon imagem_fundo = new ImageIcon("src\\VerificadorEleitoral\\imagens\\Img_fundo.png");
        JLabel fundo = new JLabel(imagem_fundo);
        fundo.setSize(500,600);
        tela.add(fundo);
        
        // Criar JRadioButton
        JRadioButton op1 = new JRadioButton("Idade maior que 18 e menor que 70");
        JRadioButton op2 = new JRadioButton("Idade entre 16, 17 ou maior que 70");
        JRadioButton op3 = new JRadioButton("Idade menor que 16");
       
        
        // Criar um grupo de botões
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(op1);
        grupo.add(op2);
        grupo.add(op3);
        
        // Inserir na tela
        fundo.add(op1);
        fundo.add(op2);
        fundo.add(op3);
       
        op1.setSize(250,50);
        op2.setSize(250,50);
        op3.setSize(250,50);

        op1.setLocation(25, 430);
        op2.setLocation(25, 470);
        op3.setLocation(25, 510);
        
        // Formatando as seleções
        op1.setOpaque(false);
        op2.setOpaque(false);
        op3.setOpaque(false);
        
        op1.setFont(new Font("Arial",Font.PLAIN,13));
        op2.setFont(new Font("Arial",Font.PLAIN,13));
        op3.setFont(new Font("Arial",Font.PLAIN,13));

        op1.setFocusPainted(false);
        op2.setFocusPainted(false);
        op3.setFocusPainted(false);
        
        
        // Criando um botão para fazer alguma coisa
        JButton botao = new JButton("Verificar");
        botao.setSize(150,50);
        botao.setLocation(310, 500);
        fundo.add(botao);
        botao.setFont(new Font("Calibri",Font.ITALIC,28));
        botao.setVerticalAlignment(JButton.CENTER);
        botao.setFocusPainted(false);
        botao.setForeground(Color.black);
        botao.setBackground(Color.decode("#9ec2ac"));
        botao.setOpaque(true);
        
        // Criar uma ação
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               if(grupo.getSelection()==null){
                   JOptionPane.showMessageDialog(null, "Favor escolher uma opção!", "Erro", JOptionPane.ERROR_MESSAGE);
               } else if(op1.isSelected()){
                   ImageIcon imagem_op = new ImageIcon("src\\VerificadorEleitoral\\Imagens\\obrigatorio.png");
                   JOptionPane.showMessageDialog(null, null,"Voto Obrigatorio", 0, imagem_op);
               } else if(op2.isSelected()){
                   ImageIcon imagem_op = new ImageIcon("src\\VerificadorEleitoral\\Imagens\\opcional.png");
                   JOptionPane.showMessageDialog(null, null,"Voto Opcional", 0, imagem_op);
               } else if(op3.isSelected()){
                   ImageIcon imagem_op = new ImageIcon("src\\VerificadorEleitoral\\Imagens\\proibido.png");
                   JOptionPane.showMessageDialog(null, null,"Voto Proibido", 0, imagem_op);
               }
            }
            
        });

        
        // Motrar a tela
        tela.setVisible(true);
  
    }
}
