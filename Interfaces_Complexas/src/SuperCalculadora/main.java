/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperCalculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class main {
    public static void main(String[] args) {

            // Criando uma tela principal com o JFrame
            JFrame tela = new JFrame();
            tela.setSize(515,639); // Alterar o tamanho da tela principal
            tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            tela.setLocationRelativeTo(null); // Ao invés de usar o setbounds posso apenas indicar que a tela fica relativa, então como null, a mesma fica no mesmo


            // Criação de uma imagem para inserir no label e colocar no fundo o
            ImageIcon label_fundo = new ImageIcon("src\\SuperCalculadora\\Imagens\\fundo_tela.png");
            JLabel fundo = new JLabel(label_fundo);
            tela.add(fundo);
            fundo.setBounds(0, 0, 500, 600); // a imagem é 500 x 600 mas a tela principal ocupa um pouco do espaço, então
                                             // coloquei um acréscimo de 15px de width e 39px de height



            // Criar os labels de informação
            JLabel informe = new JLabel("Informe um valor:");
            informe.setFont(new Font("Calibri",Font.BOLD, 25));
            fundo.add(informe);
            informe.setBounds(20, 120, 200, 50);
            informe.setForeground(Color.WHITE);


            // Criando um seletor de valor
            SpinnerNumberModel modelo = new SpinnerNumberModel(0,0,100,1);
            JSpinner spinner = new JSpinner();
            spinner.setFont(new Font("Arial", Font.BOLD, 20));
            fundo.add(spinner);
            spinner.setBounds(220, 130, 125, 30);


            // Definir a visualização das telas
            tela.setResizable(false);
            tela.setVisible(true);


            // Criar um botão
            ImageIcon botao = new ImageIcon("src\\SuperCalculadora\\Imagens\\botao.png");
            JButton calcular = new JButton(botao);
            calcular.setBorderPainted(false);
            calcular.setContentAreaFilled(true);
            fundo.add(calcular);
            calcular.setBounds(370, 100, 100, 100);
            
            // Adicionar um MouseListener para a animação
            calcular.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // Diminuir o tamanho do botão para simular uma animação de clique
                calcular.setBounds(371, 112, 100, 100);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // Reverter o tamanho do botão após um curto período
                calcular.setBounds(370, 100, 100, 100);
            }
        });
            
    }
}