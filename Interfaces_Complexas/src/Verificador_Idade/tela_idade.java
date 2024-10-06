
package Verificador_Idade;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.text.NumberFormat;
import javax.swing.border.Border;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import java.time.*;

public class tela_idade {
    public static void main(String[] args) {
        
        // Criando a tela principal
        JFrame tela = new JFrame("Exercício aula 8 - Verificador de Idade");
        tela.setSize(515, 630);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        
        
        // Criar um label para por uma imagem de fundo
        
        ImageIcon image = new ImageIcon("src\\Verificador_Idade\\imagens\\tela_idade.png");
        JLabel fundo = new JLabel(image);
        tela.add(fundo);
        fundo.setBounds(0,0,500,600);
        
        
        // Criar um botão em algum lugar
        JButton botao = new JButton("Calcular");
        botao.setSize(150, 30);
        fundo.add(botao);
        botao.setLocation(175, 352);
        botao.setForeground(Color.black);
        botao.setBackground(Color.decode("#d0f0f4"));
        botao.setFont(new Font("Arial",Font.BOLD,20));
        botao.setFocusPainted(false);
        
        
        // Criando o input para o nome
       JTextField input_nome = new JTextField();
       input_nome.setSize(263,36);
       input_nome.setLocation(170, 223);
       input_nome.setFont(new Font("Arial",Font.PLAIN,20));
       input_nome.setForeground(Color.decode("#d0d0cf"));
       input_nome.setText("Clique para digitar nome...");
       input_nome.setMargin(new Insets(0,10,0,0));
       fundo.add(input_nome);
        
       
       // Criando o spinner para a o ano
       SpinnerModel model = new SpinnerNumberModel(1980, 1900, 999999999, 1);
       JSpinner input_ano = new JSpinner(model);
       input_ano.setSize(163, 36);
       input_ano.setLocation(270, 280);
       
       // Acessando o componente de texto dentro do spinner para editqar
       JComponent editor = input_ano.getEditor();
       JFormattedTextField txtspinner = ((JSpinner.DefaultEditor) editor).getTextField();
       txtspinner.setFont(new Font("Arial",Font.PLAIN,25));
       txtspinner.setHorizontalAlignment(JFormattedTextField.CENTER);
      
       
       // Adicionando label para resultado
       
       JLabel resultado = new JLabel();
       resultado.setText("Clique em calcular para ver o resultado");
       resultado.setForeground(Color.decode("#d0d0cf"));
       resultado.setSize(360, 36);
       resultado.setLocation(75, 491);       
       resultado.setFont(new Font("Arial",Font.PLAIN,20));
       fundo.add(resultado);
       
       LocalDate tempo = LocalDate.now();
       int ano_atual = tempo.getYear();
       
       // Adicionando as ações
    
       input_nome.addMouseListener(new MouseAdapter(){
           
           @Override
           public void mousePressed(MouseEvent e){
               input_nome.setForeground(Color.black);
               input_nome.setText("");
           }
           
           @Override
           public void mouseReleased(MouseEvent e){
               
           }
  
    });
       
       input_nome.addFocusListener(new FocusAdapter() {
       
           @Override
           public void focusLost(java.awt.event.FocusEvent e){
               if(input_nome.getText().isEmpty()){
                   input_nome.setForeground(Color.decode("#d0d0cf"));
                   input_nome.setText("Clique para digitar nome...");
               }
       }});
       
    
    
       
 
       botao.addActionListener(new ActionListener(){
            String tipo;
            @Override
            public void actionPerformed(ActionEvent ae) {
                // Pegar valor do nome
                String nome = input_nome.getText();
                while(nome.equals("Clique para digitar nome...")|| nome.equals("")){
                    JOptionPane.showMessageDialog(null, "Por favor insira um nome...", "Erro", JOptionPane.ERROR_MESSAGE);
                    input_ano.setValue(1980);
                    return;
                }
                
                
                // Calcular idade
                int ano_nasc = Integer.parseInt(String.valueOf(input_ano.getValue()));
                while(ano_nasc<1900 || ano_nasc >2023){
                    JOptionPane.showMessageDialog(null, "Insira um ano maior que 1940 e menor que 2023", "Erro", JOptionPane.ERROR_MESSAGE);
                    input_ano.setValue(1980);
                    return;
                }
                int idade = (ano_atual-ano_nasc);
                
                
                // Condições: 
                
                if(idade> 115){
                    tipo = "Possivelmente morto";
                } else if((idade>=100 && idade <= 115)){
                    tipo = "Ancião";
                } else if(idade >= 18){
                    tipo = "Maior de idade";
                } else if(idade < 18){
                    tipo = "Menor de idade";
                }

                
                // Inserir dados no resultado
                resultado.setForeground(Color.black);
                String resposta = String.format("%s com %d anos", tipo,idade);
                resultado.setText(resposta);
                resultado.setHorizontalAlignment(JTextField.CENTER);
                
                // limpar o input nome
                input_nome.setForeground(Color.decode("#d0d0cf"));
                input_nome.setText("Clique para digitar nome...");
                input_ano.setValue(1980);
               
            }
           
       });





       // Adicionando na tela
       fundo.add(input_ano);
       
        
        
        
        // Criando o posicionamento e setar a tela para mostrar
        tela.setResizable(false);
        tela.setVisible(true);
        
        
        
    }
}
