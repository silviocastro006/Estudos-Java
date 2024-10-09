<aside>
📝

## Enunciado

Crie uma interface da forma abaixo como se fosse um jogo de adivinhação.

</aside>

![image](https://github.com/user-attachments/assets/61685571-176e-4f17-8053-ef40dfbe5a54)

Da mesma forma que não segui a aparência dos exercícios anteriores, eu fiz a mesma coisa e o resultado final ficou da seguinte forma:

![image](https://github.com/user-attachments/assets/17f5db71-4d36-4878-9cf3-9bac6af7ba6f)

## Criando o programa

### Tela inicial

```java
// Mudar o tema
UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

//Criar tela principal
JFrame tela = new JFrame("Exercício Gênio da Lâmpada");
tela.setSize(515, 639);
tela.setLocationRelativeTo(null);
tela.setLayout(null);
```

### Label para imagem de fundo

```java
// Criar imagem de fundo
ImageIcon imagem_fundo = new ImageIcon("src\\GenioDaLampada\\imagens\\tela_genio.png");
JLabel fundo = new JLabel(imagem_fundo);
fundo.setSize(500, 600);
tela.add(fundo);
```

### Componentes básicos para a interface

```java
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
```

### Trocando a cor do botão quando passar o cursor por cima

```java
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
```

# Função principal do progama

```java
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
```

### Visualizar a tela

```java
// Visualizar tela
        tela.setVisible(true);
```

# Quer o código inteiro?

Basta acessar o meu `github` em:  https://github.com/silviocastro006/Estudos-Java/tree/main/Interfaces_Complexas/src/GenioDaLampada
