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
import java.math.*;

public class main {
    public static void main(String[] args) {

            // Criando uma tela principal com o JFrame
            JFrame tela = new JFrame();
            tela.setSize(515,639); // Alterar o tamanho da tela principal
            tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            tela.setLocationRelativeTo(null); // Ao invés de usar o setbounds posso apenas indicar que a tela fica relativa, então como null, a mesma fica no mesmo
            tela.setTitle("Exercício Curso em Vídeo aula 07");

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
            informe.setBounds(20, 150, 200, 50);
            informe.setForeground(Color.WHITE);


            // Criando um seletor de valor
            SpinnerNumberModel modelo = new SpinnerNumberModel(0,0,100,1);
            JSpinner spinner = new JSpinner();
            spinner.setFont(new Font("Arial", Font.BOLD, 20));
            fundo.add(spinner);
            spinner.setBounds(220, 158, 125, 30);
            
            
            // Alterando a aparencia do tool tip
            UIManager.put("ToolTip.background", Color.decode("#ffff8f"));
            UIManager.put("ToolTip.foreground", Color.black);
            UIManager.put("ToolTip.font", new Font("Artial", Font.BOLD, 20));
            
            // Labels para mostrar as informações do resultado
            
            // ------- Título
            // Criação
            JLabel div2 = new JLabel("Resto da divisão por 2");
            JLabel ele_cubo = new JLabel("Elevado ao Cubo");
            JLabel raiz_quad = new JLabel("Raiz Quadrada");
            JLabel raiz_cub = new JLabel("Raiz Cúbica");
            JLabel abs = new JLabel("Valor Absoluto");
            
            // Inserir no frame fundo
            fundo.add(div2);
            fundo.add(ele_cubo);
            fundo.add(raiz_quad);
            fundo.add(raiz_cub);
            fundo.add(abs);
            
            // Alterar tamanho da fonte
            div2.setFont(new Font("Arial", Font.BOLD, 15));
            ele_cubo.setFont(new Font("Arial", Font.BOLD, 15));
            raiz_quad.setFont(new Font("Arial", Font.BOLD, 15));
            raiz_cub.setFont(new Font("Arial", Font.BOLD, 15));
            abs.setFont(new Font("Arial", Font.BOLD, 15));
            
            // Organização da tela
            div2.setBounds(30, 280, 160, 50);
            ele_cubo.setBounds(30, 340, 160, 50);
            raiz_quad.setBounds(30, 400, 160, 50);
            raiz_cub.setBounds(30, 460, 160, 50);
            abs.setBounds(30, 520, 160, 50);
            
            
            // ------- Resultad
            // Criação
            JLabel res_div2 = new JLabel("0");
            JLabel res_ele_cubo = new JLabel("0");
            JLabel res_raiz_quad = new JLabel("0");
            JLabel res_raiz_cub = new JLabel("0");
            JLabel res_abs = new JLabel("0");
            
            // Inserir no frame fundo
            fundo.add(res_div2);
            fundo.add(res_ele_cubo);
            fundo.add(res_raiz_quad);
            fundo.add(res_raiz_cub);
            fundo.add(res_abs);
            
            // Alterar tamanho da fonte
            res_div2.setFont(new Font("Arial", Font.BOLD, 18));
            res_ele_cubo.setFont(new Font("Arial", Font.BOLD, 18));
            res_raiz_quad.setFont(new Font("Arial", Font.BOLD, 18));
            res_raiz_cub.setFont(new Font("Arial", Font.BOLD, 18));
            res_abs.setFont(new Font("Arial", Font.BOLD, 18));
            
            // Alterar cor da fonte
            res_div2.setForeground(Color.decode("#51a30a"));
            res_ele_cubo.setForeground(Color.decode("#51a30a"));
            res_raiz_quad.setForeground(Color.decode("#51a30a"));
            res_raiz_cub.setForeground(Color.decode("#51a30a"));
            res_abs.setForeground(Color.decode("#51a30a"));
            
            // Organização da tela
            res_div2.setBounds(215, 280, 160, 50);
            res_ele_cubo.setBounds(170, 340, 160, 50);
            res_raiz_quad.setBounds(170 , 400, 160, 50);
            res_raiz_cub.setBounds(170 , 460, 160, 50);
            res_abs.setBounds(170, 520, 160, 50);


            // Criar um botão
            ImageIcon botao = new ImageIcon("src\\SuperCalculadora\\Imagens\\botao.png");
            JButton calcular = new JButton(botao);
            calcular.setBorderPainted(false);
            calcular.setContentAreaFilled(true);
            fundo.add(calcular);
            calcular.setBounds(370, 120, 100, 100);
            calcular.setToolTipText("Clique para calcular!");
            
            // Adicionar um MouseListener para a animação
            calcular.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // Diminuir o tamanho do botão para simular uma animação de clique
                calcular.setBounds(368, 118, 100, 100);                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // Reverter o tamanho do botão após um curto período
                calcular.setBounds(370, 120, 100, 100);
            }
        });
            
            calcular.addActionListener(new ActionListener(){
           
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    int num = Integer.parseInt(spinner.getValue().toString());
                    if (num>100){
                        JOptionPane.showMessageDialog(null, "Favor inserir um valor até 100!");
                        spinner.setValue(0);
                        res_div2.setText("0");
                        res_ele_cubo.setText("0");
                        res_raiz_quad.setText("0");
                        res_raiz_cub.setText("0");
                        res_abs.setText("0");      
                        return;
                        }
                            

                    // Resto da divisão
                    int r = (int)num % 2;
                    res_div2.setText(String.valueOf(r));

                    // Elevado ao cubo
                    float cub = (float) Math.pow(num, 3);
                    res_ele_cubo.setText(String.format("%.2f",cub));

                    // Raiz Quadrada
                    float raiz = (float) Math.sqrt(num);
                    res_raiz_quad.setText(String.format("%.2f",raiz));

                    // Rais Cúbica
                    float raiz_c = (float) Math.cbrt(num);
                    res_raiz_cub.setText(String.format("%.2f",raiz_c));

                    // Valor absoluto
                    int abs = (int) Math.abs(num);
                    res_abs.setText(String.valueOf(abs));
                }
            });
            
            
            // Definir a visualização das telas
            tela.setResizable(false);
            tela.setVisible(true);
    }
}