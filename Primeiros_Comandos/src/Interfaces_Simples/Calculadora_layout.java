/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces_Simples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 *
 * @author acer
 */
public class Calculadora_layout {
    public static void main(String[] args) {
        
        // ======== Criação da tela principal ==================
        JFrame tela = new JFrame();
        tela.setBounds(100, 100, 336, 443);
        tela.setResizable(false);
        tela.setTitle("Calculadora Silvio");
        ImageIcon icone_cal = new ImageIcon("src\\Imagens\\calculadora.png");
        tela.setIconImage(icone_cal.getImage());
        
        // ======== Criando os botões de baixo para cima ========
        
        // Fila nº 1 -> +/- | 0 | , | =
        JButton bt_dif = new JButton("+/-");
        JButton bt_0 = new JButton("0");
        JButton bt_vir = new JButton(",");
        JButton bt_igu = new JButton("=");
        
        // Fila nº 2 -> 1 | 2 | 3 | +
        JButton bt_1 = new JButton("1");
        JButton bt_2 = new JButton("2");
        JButton bt_3 = new JButton("3");
        JButton bt_mais = new JButton("+");     
        
        // Fila nº 3 -> 4 | 5 | 6 | -
        JButton bt_4 = new JButton("4");
        JButton bt_5 = new JButton("5");
        JButton bt_6 = new JButton("6");
        JButton bt_men = new JButton("-"); 
        
        // Fila nº 4 -> 7 | 8 | 9 | X
        JButton bt_7 = new JButton("7");
        JButton bt_8 = new JButton("8");
        JButton bt_9 = new JButton("9");
        JButton bt_mult = new JButton("X"); 
        
        // Fila nº 5 -> ¹/x | x² | SQRT | /
        JButton bt_frac = new JButton("¹/x");
        JButton bt_elev = new JButton("x²");
        JButton bt_raiz = new JButton();
        JButton bt_div = new JButton(); 
        
        // Fila nº 6 -> ¹/x | x² | SQRT | /
        JButton bt_perc = new JButton("%");
        JButton bt_ce = new JButton("CE");
        JButton bt_c = new JButton("C");
        JButton bt_apag = new JButton(); 
        
        // Linha principal
        JTextField input = new JTextField();
        input.setBounds(10,30,300,30);
        tela.add(input);
        

        // ======= Posicionando os botões na tela =======
       
        // Fila 1
        bt_dif.setBounds(4, 350, 75, 50);
        bt_0.setBounds(83, 350, 75, 50);
        bt_vir.setBounds(162, 350, 75, 50);
        bt_igu.setBounds(241, 350, 75, 50);
        
        // Fila 2
        bt_1.setBounds(4, 296, 75, 50);
        bt_2.setBounds(83, 296, 75, 50);
        bt_3.setBounds(162, 296,75, 50);
        bt_mais.setBounds(241, 296, 75, 50);
        
        // Fila 3
        bt_4.setBounds(4, 242, 75, 50);
        bt_5.setBounds(83, 242, 75, 50);
        bt_6.setBounds(162, 242,75, 50);
        bt_men.setBounds(241, 242, 75, 50);
        
        // Fila 4
        
        bt_7.setBounds(4, 188, 75, 50);
        bt_8.setBounds(83, 188, 75, 50);
        bt_9.setBounds(162, 188,75, 50);
        bt_mult.setBounds(241,188, 75, 50);
        
        // Fila 5
        bt_frac.setBounds(4, 134, 75, 50);
        bt_elev.setBounds(83, 134, 75, 50);
        bt_raiz.setBounds(162, 134,75, 50);
        bt_div.setBounds(241,134, 75, 50);
        
        // Fila 6
        bt_perc.setBounds(4,80, 75, 50);
        bt_ce.setBounds(83,80, 75, 50);
        bt_c.setBounds(162,80,75, 50);
        bt_apag.setBounds(241,80,75, 50);
        
        
        // ======= Adicionando botões na tela =======
        
        // Fila 1
        tela.add(bt_dif);
        tela.add(bt_0);
        tela.add(bt_vir);
        tela.add(bt_igu);
        
        // Fila 2
        tela.add(bt_1);
        tela.add(bt_2);
        tela.add(bt_3);
        tela.add(bt_mais);
        
        // Fila 3
        tela.add(bt_4);
        tela.add(bt_5);
        tela.add(bt_6);
        tela.add(bt_men);
        
        // Fila 4
        tela.add(bt_7);
        tela.add(bt_8);
        tela.add(bt_9);
        tela.add(bt_mult);
        
        // Fila 6
        tela.add(bt_frac);
        tela.add(bt_elev);
        tela.add(bt_raiz);
        tela.add(bt_div);
        
        //Fila 5
        tela.add(bt_perc);
        tela.add(bt_ce);
        tela.add(bt_c);
        tela.add(bt_apag);
        
       
        
        // COnfigurar ícones nos botões
        Icon icon_bapag = new ImageIcon("src\\Imagens\\delete.png");
        bt_apag.setIcon(icon_bapag);
        
        Icon icon_div = new ImageIcon("src\\Imagens\\divisao.png");
        bt_div.setIcon(icon_div);
        
        Icon icon_raiz = new ImageIcon("src\\Imagens\\raiz-quadrada.png");
        bt_raiz.setIcon(icon_raiz);
        
        
        // ===== Configurando a cor dos botões =====
        
        bt_dif.setBackground(Color.white);bt_dif.setBorder(BorderFactory.createLineBorder(Color.decode("#C7C7C7")));
        bt_0.setBackground(Color.white);bt_0.setBorder(BorderFactory.createLineBorder(Color.decode("#C7C7C7")));
        bt_vir.setBackground(Color.white);bt_vir.setBorder(BorderFactory.createLineBorder(Color.decode("#C7C7C7")));
        bt_igu.setBackground(Color.white);bt_igu.setBorder(BorderFactory.createLineBorder(Color.decode("#C7C7C7")));
        
        bt_1.setBackground(Color.white);bt_1.setBorder(BorderFactory.createLineBorder(Color.decode("#C7C7C7")));
        bt_2.setBackground(Color.white);bt_2.setBorder(BorderFactory.createLineBorder(Color.decode("#C7C7C7")));
        bt_3.setBackground(Color.white);bt_3.setBorder(BorderFactory.createLineBorder(Color.decode("#C7C7C7")));
        bt_mais.setBackground(Color.white);bt_mais.setBorder(BorderFactory.createLineBorder(Color.decode("#C7C7C7")));
        
        bt_4.setBackground(Color.white);bt_4.setBorder(BorderFactory.createLineBorder(Color.decode("#C7C7C7")));
        bt_5.setBackground(Color.white);bt_5.setBorder(BorderFactory.createLineBorder(Color.decode("#C7C7C7")));
        bt_6.setBackground(Color.white);bt_6.setBorder(BorderFactory.createLineBorder(Color.decode("#C7C7C7")));
        bt_men.setBackground(Color.white);bt_men.setBorder(BorderFactory.createLineBorder(Color.decode("#C7C7C7")));
        
        bt_7.setBackground(Color.white);bt_7.setBorder(BorderFactory.createLineBorder(Color.decode("#C7C7C7")));
        bt_8.setBackground(Color.white);bt_8.setBorder(BorderFactory.createLineBorder(Color.decode("#C7C7C7")));
        bt_9.setBackground(Color.white);bt_9.setBorder(BorderFactory.createLineBorder(Color.decode("#C7C7C7")));
        bt_mult.setBackground(Color.white);bt_mult.setBorder(BorderFactory.createLineBorder(Color.decode("#C7C7C7")));
        
        bt_frac.setBackground(Color.white);bt_frac.setBorder(BorderFactory.createLineBorder(Color.decode("#C7C7C7")));
        bt_elev.setBackground(Color.white);bt_elev.setBorder(BorderFactory.createLineBorder(Color.decode("#C7C7C7")));
        bt_raiz.setBackground(Color.white);bt_raiz.setBorder(BorderFactory.createLineBorder(Color.decode("#C7C7C7")));
        bt_div.setBackground(Color.white);bt_div.setBorder(BorderFactory.createLineBorder(Color.decode("#C7C7C7")));

        bt_perc.setBackground(Color.white);bt_perc.setBorder(BorderFactory.createLineBorder(Color.decode("#C7C7C7")));
        bt_ce.setBackground(Color.white);bt_ce.setBorder(BorderFactory.createLineBorder(Color.decode("#C7C7C7")));
        bt_c.setBackground(Color.white);bt_c.setBorder(BorderFactory.createLineBorder(Color.decode("#C7C7C7")));
        bt_apag.setBackground(Color.white);bt_apag.setBorder(BorderFactory.createLineBorder(Color.decode("#C7C7C7")));
        
       // ===== Alterando a fonte dos botões ====
       
        bt_dif.setFont(new Font("Arial", Font.BOLD, 15));
        bt_0.setFont(new Font("Arial", Font.BOLD, 15));
        bt_vir.setFont(new Font("Arial", Font.BOLD, 15));
        bt_igu.setFont(new Font("Arial", Font.BOLD, 15));
        bt_1.setFont(new Font("Arial", Font.BOLD, 15));
        bt_2.setFont(new Font("Arial", Font.BOLD, 15));
        bt_3.setFont(new Font("Arial", Font.BOLD, 15));
        bt_mais.setFont(new Font("Arial", Font.BOLD, 15));
        bt_4.setFont(new Font("Arial", Font.BOLD, 15));
        bt_5.setFont(new Font("Arial", Font.BOLD, 15));
        bt_6.setFont(new Font("Arial", Font.BOLD, 15));
        bt_men.setFont(new Font("Arial", Font.BOLD, 15));
        bt_7.setFont(new Font("Arial", Font.BOLD, 15));
        bt_8.setFont(new Font("Arial", Font.BOLD, 15));
        bt_9.setFont(new Font("Arial", Font.BOLD, 15));
        bt_mult.setFont(new Font("Arial", Font.BOLD, 15));
        bt_frac.setFont(new Font("Arial", Font.BOLD, 15));
        bt_elev.setFont(new Font("Arial", Font.BOLD, 15));
        bt_raiz.setFont(new Font("Arial", Font.BOLD, 15));
        bt_div.setFont(new Font("Arial", Font.BOLD, 15));
        bt_perc.setFont(new Font("Arial", Font.BOLD, 15));
        bt_ce.setFont(new Font("Arial", Font.BOLD, 15));
        bt_c.setFont(new Font("Arial", Font.BOLD, 15));
        bt_apag.setFont(new Font("Arial", Font.BOLD, 15));
        
        // Criando uma função para mudar a cor do botão quando passar o mouse
        
        efeitoHover(new JButton[]{bt_dif,bt_0,bt_vir,bt_igu,bt_1,bt_2,bt_3,bt_mais,bt_4,
            bt_5,bt_6,bt_men,bt_7,bt_8,bt_9,bt_mult,bt_frac,bt_elev,bt_raiz,bt_div,bt_perc,bt_ce,bt_c,bt_apag},Color.white,Color.decode("#DBDBDB"));

        
       // ====== Configurando a visualização =======
       tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       tela.setLayout(null);
       tela.setVisible(true);
    }
    
    public static void efeitoHover(JButton[] botoes, Color corNormal, Color corHover){
        for (JButton botao:botoes){
            
            
            botao.addMouseListener(new MouseAdapter(){
                
                public void mouseEntered(MouseEvent e){
                    botao.setBackground(corHover);
                    botao.setForeground(Color.black);
                }
                
                public void mouseExited(MouseEvent e){
                    botao.setBackground(corNormal);
                    botao.setForeground(Color.black);
                }
            });
        }
    }
}