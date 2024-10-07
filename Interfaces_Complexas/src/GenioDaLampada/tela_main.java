/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenioDaLampada;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Aluno
 */
public class tela_main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        
        // Mudar o tema
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        
        //Criar tela principal
        JFrame tela = new JFrame("Exercício Gênio da Lâmpada");
        tela.setSize(515, 639);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);
        
        
        // Criar imagem de fundo
        ImageIcon imagem_fundo = new ImageIcon("src\\GenioDaLampada\\imagens\\tela_genio.png");
        JLabel fundo = new JLabel(imagem_fundo);
        fundo.setSize(500, 600);
        tela.add(fundo);
        
        
        // Texto inicial no balao
        JLabel texto = new JLabel("<html>Estou pensando em um número <u><strong>entre 1 e 5</strong></u>.<br><br>Tente adivinhar que valor é esse.</html>");
        texto.setSize(275, 100);
        texto.setLocation(35, 100);
        fundo.add(texto);
        texto.setFont(new Font("Calibri",Font.PLAIN,19));
        

        // Inserir os componentes na tela
        JLabel lbl_val = new JLabel("Valor");
        lbl_val.setSize(100, 30);
        lbl_val.setLocation(30, 420);
        fundo.add(lbl_val);
        lbl_val.setFont(new Font("Calibri",Font.BOLD,30));
        
        JSpinner spinner = new JSpinner(new SpinnerNumberModel(0, 0, 5, 1));
        spinner.setSize(60, 40);
        spinner.setLocation(110, 415);
        fundo.add(spinner);
        spinner.setFont(new Font("Calibri",Font.BOLD,30));
        
        JButton bot_palpite = new JButton("Palpite");
        bot_palpite.setSize(150, 50);
        bot_palpite.setLocation(80, 480);
        fundo.add(bot_palpite);
        bot_palpite.setBackground(Color.white);
        bot_palpite.setFont(new Font("Calibri",Font.BOLD,30));
        bot_palpite.setToolTipText("Clique em mim para tentar adivinhar!");

        
        // Mudar a cor de fundo do botão quando passar o mouse
        bot_palpite.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent e) {
                bot_palpite.setBackground(Color.decode("#ECEBA1"));
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                bot_palpite.setBackground(Color.white);
            }
            
});
        
        
        //Função principal do progama
        bot_palpite.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {

                double n =  1 + Math.random() * (5-1);
                int valor_certo = (int) n;
                
                System.out.println(valor_certo);
                
                int pal = Integer.parseInt(String.valueOf(spinner.getValue()));
                
                if(pal==0){
                    JOptionPane.showMessageDialog(null, "Favor indicar valor de 1 a 5", "ERRO", JOptionPane.ERROR_MESSAGE);
                } else if(pal==valor_certo){
                    texto.setText("<html>ACERTOU!</html>");
                    texto.setFont(new Font("Calibri",Font.BOLD,50));
                    texto.setForeground(Color.decode("#658E5D"));
                    texto.setLocation(50, 100);
                } else{
                    texto.setText(String.format("<html>ERROU! O número que pensei foi %d</html>", valor_certo));
                    texto.setFont(new Font("Calibri",Font.BOLD,30));
                    texto.setForeground(Color.decode("#C98C8D"));
                }
                
               
                
    }});
        



        // Visualizar tela
        tela.setVisible(true);

    }   
}