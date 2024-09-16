package Atividades;

/*
No exercício que estava na apostila o autor utilizou a biblioteca sun.audio, porém 
a mesma foi descontinuada por questões técnicas.
Para resolvermos o exercíco, vou usar a biblioteca Javax.Sound.Sampled
Vou também criar uma interface divertida para isso.


*/

import java.awt.*;
import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;


public class Pesquisa {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
    
        tela();
   
    }
    
    public static void tela() {
        
        // ======== Configurações do Jframe =========
        
        //Criação do JFrame que é o root da tela
        JFrame tela = new JFrame("Hora do Faro");
        
        // Determinar o tamanho da tela e onde ela vai ficar no monitor
        tela.setBounds(200,200,299,300);
        
        // bloquear o redimensionamento
        tela.setResizable(false);
        
        // Vou alterar a cor de fundo para hexadecimal
        tela.getContentPane().setBackground(Color.decode("#860be0"));
        
        
        // ======== Configurações do Título do programa =========
        JLabel titulo = new JLabel();
        Icon imagem = new ImageIcon("src\\Imagens\\horadofaro.png");
        titulo.setIcon(imagem);
        tela.add(titulo);
        titulo.setBounds(0,0 , 299, 168);
        
        
        // ======== Configurações do botão 1 para uma surpresa =========
        
        JButton botao = new JButton();
        botao.setText("Clique para tocar Som 1");
        tela.add(botao);
        botao.setBounds(50,160,190, 30);
        
        botao.addActionListener( e -> {
            try{
                tela2();
                som1();
            } catch ( Exception ex){
                ex.printStackTrace();
            }
        });

        
        // ======== Configurações do botão 2 para outra surpresa =========
        
        JButton botao2 = new JButton();
        botao2.setText("Clique para tocar Som 2");
        tela.add(botao2);
        botao2.setBounds(50,210,190, 30);
        
        botao2.addActionListener(e -> {
                try{
                    tela3();
                    som2();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
        });
        
        
        
        // Determinamos que qualquer tela que clicarmos em fechar vai fechar tudo
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Informamos que não vamos usar nenhum tipo de layout
        tela.setLayout(null);
        
        /* Parecido com o mainloop do tkinter do python, é para mostrar o programa
         até que seja fechado*/
        tela.setVisible(true);
        
        
    }
    
    
        public static void tela2(){
            
            // ======== Configurações da segunda tela =========

            //Criação do JFrame que é o root da tela
            JFrame tela2 = new JFrame("UI");
        
            // Determinar o tamanho da tela e onde ela vai ficar no monitor
            tela2.setBounds(200,200,299,300);
            
            tela2.setResizable(false);
            
            // ======== Configurando a surpresa =========   
       
            JLabel ui = new JLabel();
            ui.setBounds(0,0,299,300);
            Icon sanji = new ImageIcon("src\\Imagens\\SanjiFaro.png");
            ui.setIcon(sanji);
            tela2.add(ui);
            
            
            // ======== Configurações da segunda tela =========
            
            // Determinamos que qualquer tela que clicarmos em fechar vai fechar tudo
            tela2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            // Informamos que não vamos usar nenhum tipo de layout
            tela2.setLayout(null);

            /* Parecido com o mainloop do tkinter do python, é para mostrar o programa
             até que seja fechado*/
            tela2.setVisible(true);
        }
        
        
        public static void som1() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException{
            
            // Abrir o arquivo de audio
            File ui_som = new File("src\\Sons\\ui.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(ui_som);
            
            // Achar qual o formato do audio
            AudioFormat formato = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, formato);
            
            
            // Criar um objeto Clip
            Clip audioClip = (Clip) AudioSystem.getLine(info);
            
            // Abrir o audio e carregar o clip
            audioClip.open(audioStream);
            
            // tocar o áudio
            audioClip.start();
            
        }
        
        public static void tela3(){
            
            // ======== Configurações da segunda tela =========

            //Criação do JFrame que é o root da tela
            JFrame tela3 = new JFrame("UI");
        
            // Determinar o tamanho da tela e onde ela vai ficar no monitor
            tela3.setBounds(200,200,299,300);
            
            tela3.setResizable(false);
            
            // ======== Configurando a outra surpresa =========   
       
            JLabel breakfree = new JLabel();
            breakfree.setBounds(0,0,299,300);
            Icon sanji = new ImageIcon("src\\Imagens\\FredFaro.png");
            breakfree.setIcon(sanji);
            tela3.add(breakfree);
            
            
            // ======== Configurações da segunda tela =========
            
            // Determinamos que qualquer tela que clicarmos em fechar vai fechar tudo
            tela3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            // Informamos que não vamos usar nenhum tipo de layout
            tela3.setLayout(null);

            /* Parecido com o mainloop do tkinter do python, é para mostrar o programa
             até que seja fechado*/
            tela3.setVisible(true);
        }
        
        public static void som2() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException{
            
            // Abrir o arquivo de audio
            File ui_som = new File("src\\Sons\\ele_gosta.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(ui_som);
            
            // Achar qual o formato do audio
            AudioFormat formato = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, formato);
            
            
            // Criar um objeto Clip
            Clip audioClip = (Clip) AudioSystem.getLine(info);
            
            // Abrir o audio e carregar o clip
            audioClip.open(audioStream);
            
            // tocar o áudio
            audioClip.start();
            
        }
        
    
}
