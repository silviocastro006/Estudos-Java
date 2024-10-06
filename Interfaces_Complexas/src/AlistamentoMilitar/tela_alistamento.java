/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlistamentoMilitar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class tela_alistamento {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException{
       // Definindo um tema para o progama
       UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        
        
       // Configurando a tela inicial
       JFrame tela = new JFrame("Exercício 2 aula 09 - Alistamento Militar");
       tela.setSize(515, 639);
       tela.setLocationRelativeTo(null);
       tela.setLayout(null);
       
       // Configurando o fundo da tela
       ImageIcon image = new ImageIcon("src\\AlistamentoMilitar\\imagens\\tela_militar.png");
       JLabel fundo = new JLabel(image);
       fundo.setSize(500, 600);
       tela.add(fundo);
       
       
       // Criando uns labels para indicar informações
       JLabel idade = new JLabel("Idade");
       idade.setSize(150,30);
       idade.setLocation(60, 370);
       idade.setForeground(Color.black);
       idade.setFont(new Font("Arial",Font.BOLD,40));
       fundo.add(idade);
       
       // Adicionando um slider para informar a idade
       JSlider slider = new JSlider(JSlider.HORIZONTAL,0,100,0);
       slider.setLocation(170, 375);
       slider.setSize(200, 50);
       fundo.add(slider);
       slider.setOpaque(false);
       slider.setBackground(Color.red);
       slider.setMajorTickSpacing(20);
       slider.setMinorTickSpacing(5);
       slider.setPaintLabels(true);
       slider.setPaintTicks(true);
       slider.setPaintLabels(true);

       // Adicionando um label para mostra a idade atual
       JLabel idade_atual = new JLabel("0");
       idade_atual.setLocation(395, 365);
       idade_atual.setSize(100,40);
       fundo.add(idade_atual);
       idade_atual.setFont(new Font("Arial",Font.PLAIN,40));
       
       // Adicionando botões na tela
       ImageIcon img_analisar = new ImageIcon("src\\AlistamentoMilitar\\imagens\\img_ver.png");
       JButton bot_analisar = new JButton("Analisar", img_analisar);
       bot_analisar.setSize(160,80);
       bot_analisar.setLocation(170, 450);
       bot_analisar.setFont(new Font("Arial",Font.BOLD,17));
       bot_analisar.setBackground(Color.decode("#467f3f"));
       bot_analisar.setForeground(Color.white);
       bot_analisar.setFocusPainted(false);
       fundo.add(bot_analisar);
       
       // Adicionando uma ação para o slider e o label
       slider.addChangeListener(new ChangeListener(){
           @Override
           public void stateChanged(ChangeEvent ce) {
               idade_atual.setText(String.valueOf(slider.getValue()));
           }
           
       });
       
       // Adicionando uma ação para o botão analisar
       bot_analisar.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent ae) {
               int idade_slider = Integer.parseInt(String.valueOf(slider.getValue()));
               
               
               if(idade_slider==69){
                   String status = "Escolheu esta idade por que ein?";
                   ImageIcon icon = new ImageIcon("src\\AlistamentoMilitar\\imagens\\imagem_al.png");
                   JOptionPane.showMessageDialog(null, status, "Verificando informações", JOptionPane.INFORMATION_MESSAGE, icon); 
               } else if(idade_slider>18){
                   int ano_alist = idade_slider - 18;
                   String status = String.format("Você deveria ter se alistado há %d anos",ano_alist);
                   ImageIcon icon = new ImageIcon("src\\AlistamentoMilitar\\imagens\\alistamento1.png");
                   JOptionPane.showMessageDialog(null, status, "Verificando informações", JOptionPane.INFORMATION_MESSAGE, icon);
               } else if(idade_slider==18){
                   String status = "Seu alistamento é este ano, boa sorte....";
                   ImageIcon icon = new ImageIcon("src\\AlistamentoMilitar\\imagens\\alistamento2.png");
                   JOptionPane.showMessageDialog(null, status, "Verificando informações", JOptionPane.INFORMATION_MESSAGE, icon);
               } else{
                   int ano_alist = 18 - idade_slider;
                    ImageIcon icon = new ImageIcon("src\\AlistamentoMilitar\\imagens\\alistamento3.png");
                   String status = String.format("Te espero daqui a %d anos.....", ano_alist);
                   JOptionPane.showMessageDialog(null, status, "Verificando informações", JOptionPane.INFORMATION_MESSAGE, icon);
                   
               }
           }
           
       });
               

       
       
       
       
       tela.setVisible(true);
       tela.setResizable(false);
    }
}
