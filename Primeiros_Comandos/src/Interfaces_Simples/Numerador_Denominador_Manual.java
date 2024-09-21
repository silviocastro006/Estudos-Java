package Interfaces_Simples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Numerador_Denominador_Manual {
    
    public static void main(String[] args) { 

        // Criando a tela
        JFrame tela = new JFrame("Numerador e Denominador");
        tela.setBounds(500,200,350,320);
        
        
        // Criando os elementos de texto simples
        JLabel nome_num = new JLabel("Numerador");
        JLabel nome_den = new JLabel("Denominador");
        JLabel nome_div = new JLabel("Divisão");
        JLabel nome_res = new JLabel("Resto");
                
       
        // Formatando a fonte dos labels
        nome_num.setFont(new Font("Arial",Font.BOLD,15));
        nome_den.setFont(new Font("Arial",Font.BOLD,15));
        nome_div.setFont(new Font("Arial",Font.BOLD,15));
        nome_res.setFont(new Font("Arial",Font.BOLD,15));
       
      
        // Colocando os labels na tela
        nome_num.setBounds(50,20,100,30);
        nome_den.setBounds(50,80,100,30);
        nome_div.setBounds(50,200,100,30);
        nome_res.setBounds(50,240,100,30);

        
        // Adicionando os labels na tela
        tela.add(nome_num);
        tela.add(nome_den);
        tela.add(nome_div);
        tela.add(nome_res);
        
        
        // Criando os labels de resposta
        JLabel resp_div = new JLabel("0");
        JLabel resp_resto = new JLabel("0");
        
        resp_div.setBounds(130,200,200,30);
        resp_resto.setBounds(130,240,200,30);
        
        resp_div.setFont(new Font("Arial",Font.PLAIN,30));
        resp_resto.setFont(new Font("Arial",Font.PLAIN,30));
        
        tela.add(resp_div);
        tela.add(resp_resto);
        
        
        // Adicionar os inputs ( text fields ) e colocando na tela
        JTextField txt_numerador = new JTextField();
        JTextField txt_denominador = new JTextField();
        
        txt_numerador.setBounds(180,20,80,30);
        txt_denominador.setBounds(180,80,80,30);
        
        tela.add(txt_numerador);
        tela.add(txt_denominador);
        
        
        // Criando um botão e colocando na tela
        JButton dividir = new JButton("Dividir");
        dividir.setBounds(120,140,100,30);
        tela.add(dividir);
        dividir.setBackground(Color.decode("#FAD6A7"));
        dividir.setForeground(Color.black);
        dividir.setFont(new Font("Arial",Font.PLAIN,20));
        
        
        // Criando uma ação para o botão
        dividir.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
               divisao(txt_numerador,txt_denominador,resp_div,resp_resto);
            }
            
        });
        
        
        // Configurando a visibilidade da tela
        tela.setLayout(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
        
    }
  
    
    public static void divisao(JTextField txt_numerador, JTextField txt_denominador, JLabel resp_div, JLabel resp_resto){
        
        // Pegando os valores dos inputs
        float numerador = Float.parseFloat(txt_numerador.getText());
        float denominador = Float.parseFloat(txt_denominador.getText());
        
        // Tratando via calculo
        float resultado = numerador/denominador;
        float resto = numerador % denominador;
        
        // Alterando os valores na tela
        resp_div.setText(String.valueOf(resultado));
        resp_resto.setText(String.valueOf(resto));
        
                
        
    }
    
    
    
}
