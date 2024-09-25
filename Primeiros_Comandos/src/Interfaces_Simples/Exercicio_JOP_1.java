/*
1 - Faça um programa que leia 10 números e informe:
a) A soma destes números;
b) A média destes números;
c) O maior número; e
d) O menor número
*/

package Interfaces_Simples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import java.util.ArrayList;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Exercicio_JOP_1 {
    
        // Criação de lista publica para armazenar os números digitados
        public static int[] numeros = new int[10];
        public static int index = 0;
        
    public static void main(String[] args) {

        // Criação da tela
        JFrame tela = new JFrame("Exercício 1");
        tela.setBounds(500,200,300,330);
        tela.setLayout(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.getContentPane().setBackground(Color.decode("#AD95AB"));
        tela.setResizable(false);
        
        
        // Painel para o título
        JPanel titulo_f = new JPanel();
        titulo_f.setBackground(Color.white);
        titulo_f.setBounds(16,10,250,50);
        Border borda_titulo_f = BorderFactory.createLineBorder(Color.decode("#D6D6D6"), 2, true);
        titulo_f.setBorder(borda_titulo_f);
        titulo_f.setLayout(null);
        
        
        // Título do programa
        JLabel titulo = new JLabel("Analisador de Números");
        titulo.setFont(new Font("Arial",Font.PLAIN,18));
        titulo_f.add(titulo);
        titulo.setBounds(30, 10, 200, 30);
        tela.add(titulo_f);
        
        
        // Descrição do programa
        
        //===== Painel
        JPanel descricao = new JPanel();
        descricao.setLayout(null);
        descricao.setBounds(8,80,270,100);
        descricao.setBackground(Color.white);
        Border borda_desc = BorderFactory.createLineBorder(Color.decode("#D6D6D6"), 1, true);
        descricao.setBorder(borda_desc);
        tela.add(descricao);
        
        //===== Texto
        JTextArea txt_desc = new JTextArea(
                "Este progama lê 10 números, analisa e informa a soma, média, maior e menor."+
                "\n\nPara isso favor clicar em adicionar número!");
        
        txt_desc.setBounds(5,5,260,100);
        txt_desc.setFont(new Font("Arial", Font.PLAIN,15));
        txt_desc.setEditable(false);
        txt_desc.setLineWrap(true);
        txt_desc.setWrapStyleWord(true);
        txt_desc.setOpaque(true);
        txt_desc.setFocusable(false);
        descricao.add(txt_desc);
        
        
        // Criando botões para fazer alguma coisa
        
            // ===== Adicionar Número
            JButton adicionar_num = new JButton("Adicionar Número");
            adicionar_num.setLayout(null);
            adicionar_num.setBounds(70,200,150,30);
            adicionar_num.setBackground(Color.darkGray);
            adicionar_num.setForeground(Color.white);
            Border borda_adic = BorderFactory.createLineBorder(Color.white);
            adicionar_num.setBorder(borda_adic);
            adicionar_num.setFocusable(false);
            tela.add(adicionar_num);
        
            // ======= Ver resultados
            JButton resultados = new JButton("Ver Resultados");
            resultados.setLayout(null);
            resultados.setBounds(70,250,150,30);
            resultados.setBackground(Color.darkGray);
            resultados.setForeground(Color.white);
            Border borda_res = BorderFactory.createLineBorder(Color.white);
            resultados.setBorder(borda_res);
            resultados.setFocusable(false);
            tela.add(resultados);
                
        
        // Criando lista de botões para passar à função
        ArrayList<JButton> botoes = new ArrayList<>();
        botoes.add(adicionar_num);
        botoes.add(resultados);
        
        // Efeito Hover
        Hover(botoes);
        
        // ação do botão adicionar
        adicionar_num.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (index<10){
                    for(int c = 0;c < 10; c++){
                        String input = JOptionPane.showInputDialog(null,"Insira o "+(index+1)+"º número");
                        if(input!=null){
                            try{
                                numeros[index] = Integer.parseInt(input);
                                index++;
                            } catch(NumberFormatException ex){
                                JOptionPane.showMessageDialog(null,"Por favor insira um número válido");
                            }
                        } else{
                            JOptionPane.showMessageDialog(null,"Você já adicionou 10 números");
                        }
                    }    
                }
                
                if (index==10){
                   JOptionPane.showMessageDialog(null,"Você já adicionou 10 números, clique em ver resultados");
                }
            }
        });
        

        // ação botão ver resultados
        resultados.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                
                if(index==0){
                    JOptionPane.showMessageDialog(null,"Nenhum número adicionado");
                }
                
                // Calculos realizados
                
                int soma = 0;
                int maior = numeros[0];
                int menor = numeros[0];
                
                
                for(int i = 0; i < index; i++){
                    soma += numeros[i];
                    
                    if (numeros[i] > maior) {
                        maior = numeros[i];
                    }
                    
                    if (numeros[i] < menor) {
                        menor = numeros[i];
                    }
                }
                
                float media = soma/10;
                
                String resultado = String.format("Soma total: %d%nMédia: %.2f%nMaior: %d%nMenor: %d",soma, media,maior, menor);
                JOptionPane.showMessageDialog(null,resultado,"Resultados",JOptionPane.INFORMATION_MESSAGE);
                
            }
            
            
        });
        

        // Visibilidade da tela
        tela.setVisible(true);         
    }
    
    
    public static void Hover(ArrayList<JButton> botoes){
        
        for (JButton botao : botoes){
            botao.addMouseListener(new MouseAdapter(){
                    
                    @Override
                    public void mouseEntered(MouseEvent e){
                        botao.setBackground(Color.decode("#EBEBEB"));
                        botao.setForeground(Color.black);
                    }
                    
                    @Override
                    public void mouseExited(MouseEvent e){
                        botao.setBackground(Color.darkGray);
                        botao.setForeground(Color.white);
                    }
            
            });
        }
        
    }
}
