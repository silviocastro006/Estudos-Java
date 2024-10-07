/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Equacao2Grau;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Aluno
 */
public class tela {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        
        // Mudar o tema
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        
        // tela inicial
        JFrame tela = new JFrame("Exercício calculo de raizes");
        tela.setSize(500, 300);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);
        
        
        
        
        // adicionando spinners
        JSpinner spinA = new JSpinner(new SpinnerNumberModel(0, 0, 99, 1));
        JSpinner spinB = new JSpinner(new SpinnerNumberModel(0, 0, 99, 1));
        JSpinner spinC = new JSpinner(new SpinnerNumberModel(0, 0, 99, 1));
        
        spinA.setSize(80, 50);
        spinB.setSize(80, 50);
        spinC.setSize(80, 50);

        spinA.setLocation(20, 32);
        spinB.setLocation(180, 32);
        spinC.setLocation(325, 32);

        tela.add(spinA);
        tela.add(spinB);
        tela.add(spinC);
        
        spinA.setFont(new Font("Calibri",Font.BOLD,40));
        spinB.setFont(new Font("Calibri",Font.BOLD,40));
        spinC.setFont(new Font("Calibri",Font.BOLD,40));

        
        // adicionando texto entre cada
        JLabel entre1 = new JLabel("<html>X<sup>2</sup>+</html>");
        entre1.setSize(80, 50);
        entre1.setLocation(110, 24);
        tela.add(entre1);
        entre1.setFont(new Font("Calibri",Font.BOLD,40));
        entre1.setForeground(Color.black);
        
        JLabel entre2 = new JLabel("<html>X +</html>");
        entre2.setSize(80, 50);
        entre2.setLocation(270, 30);
        tela.add(entre2);
        entre2.setFont(new Font("Calibri",Font.BOLD,40));
        entre2.setForeground(Color.black);
        
        JLabel entre3 = new JLabel("<html>= 0</html>");
        entre3.setSize(80, 50);
        entre3.setLocation(415, 27);
        tela.add(entre3);
        entre3.setFont(new Font("Calibri",Font.BOLD,40));
        entre3.setForeground(Color.black);
        
        
        // Mostrando o calculo de razies abaixo:
        JLabel delta = new JLabel("<html>&Delta; = </html>");
        delta.setSize(80, 50);
        delta.setLocation(50, 130);
        delta.setFont(new Font("Calibri",Font.PLAIN,50));
        tela.add(delta);
        
        
        JLabel lbl_b = new JLabel("<html>B</html>");
        lbl_b.setSize(80, 50);
        lbl_b.setLocation(50, 130);
        lbl_b.setFont(new Font("Calibri",Font.PLAIN,50));
        tela.add(lbl_b);
        
        JLabel lbl_2 = new JLabel("<html><sup>2</sup></html>");
        lbl_2.setSize(80, 50);
        lbl_2.setLocation(130, 130);
        lbl_2.setFont(new Font("Calibri",Font.PLAIN,50));
        tela.add(lbl_2);
        
        
        
        // mostrando a tela
        tela.setVisible(true);
    }
}
