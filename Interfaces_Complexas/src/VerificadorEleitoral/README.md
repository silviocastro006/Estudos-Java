Da mesma forma que o exercício anterior, crie uma interface para mostrar se o usuário é obrigado ou não a votar, levando em consideração:

- Não verificar sexo
- Se idade for maior ou igual a 18 é obrigatório
- Se idade for menor que 16 não é permitido
- Se idade for >= 16 e < 18 é ou maior que 70 é opcional

## Criando a interface

Desta vez eu tentei fazer uma interface mais bonitinha, estilo GOV.br, então o resultado ficou da seguinte forma: 

![image](https://github.com/user-attachments/assets/3e9a2314-1a34-45c5-8e71-a96730101345)


```java
 // Criação da tela principal
JFrame tela = new JFrame("Exercício eleitor - Curso em Video");
tela.setSize(515,639);
tela.setLocationRelativeTo(null);
tela.setLayout(null);
tela.setResizable(false);
```

### Criando imagem de fundo

```java
// Criar imagem para fundo da tela
ImageIcon imagem_fundo = new ImageIcon("src\\VerificadorEleitoral\\imagens\\Img_fundo.png");
JLabel fundo = new JLabel(imagem_fundo);
fundo.setSize(500,600);
tela.add(fundo);
```

### Criando os botões de seleção

```java
// Criar JRadioButton
JRadioButton op1 = new JRadioButton("Idade maior que 18 e menor que 70");
JRadioButton op2 = new JRadioButton("Idade entre 16, 17 ou maior que 70");
JRadioButton op3 = new JRadioButton("Idade menor que 16");
```

### Agrupando os botões

```java
// Criar um grupo de botões
ButtonGroup grupo = new ButtonGroup();
grupo.add(op1);
grupo.add(op2);
grupo.add(op3);

// Inserir na tela
fundo.add(op1);
fundo.add(op2);
fundo.add(op3);

op1.setSize(250,50);
op2.setSize(250,50);
op3.setSize(250,50);

op1.setLocation(25, 430);
op2.setLocation(25, 470);
op3.setLocation(25, 510);
```

### Formatando as seleções

```java
// Formatando as seleções
op1.setOpaque(false);
op2.setOpaque(false);
op3.setOpaque(false);

op1.setFont(new Font("Arial",Font.PLAIN,13));
op2.setFont(new Font("Arial",Font.PLAIN,13));
op3.setFont(new Font("Arial",Font.PLAIN,13));

op1.setFocusPainted(false);
op2.setFocusPainted(false);
op3.setFocusPainted(false);

```

## Criando um botão para função principal

```java
// Criando um botão para fazer alguma coisa
JButton botao = new JButton("Verificar");
botao.setSize(150,50);
botao.setLocation(310, 500);
fundo.add(botao);
botao.setFont(new Font("Calibri",Font.ITALIC,28));
botao.setVerticalAlignment(JButton.CENTER);
botao.setFocusPainted(false);
botao.setForeground(Color.black);
botao.setBackground(Color.decode("#9ec2ac"));
botao.setOpaque(true);
```

# Criando uma ação para o programa

O botão mostrará 3 imagens diferentes que montei no canva e para poder ver as imagens, basta acessar o meu repositório em: https://github.com/silviocastro006/Estudos-Java/tree/main/Interfaces_Complexas/src/VerificadorEleitoral

```java
 // Criar uma ação
        botao.addActionListener(new ActionListener() {
  @Override
  public void actionPerformed(ActionEvent ae) {
     if(grupo.getSelection()==null){
JOptionPane.showMessageDialog(null, "Favor escolher uma opção!", "Erro", JOptionPane.ERROR_MESSAGE);
} else if(op1.isSelected()){
ImageIcon imagem_op = new ImageIcon("src\\VerificadorEleitoral\\Imagens\\obrigatorio.png");
JOptionPane.showMessageDialog(null, null,"Voto Obrigatorio", 0, imagem_op);
} else if(op2.isSelected()){
ImageIcon imagem_op = new ImageIcon("src\\VerificadorEleitoral\\Imagens\\opcional.png");
JOptionPane.showMessageDialog(null, null,"Voto Opcional", 0, imagem_op);
} else if(op3.isSelected()){
ImageIcon imagem_op = new ImageIcon("src\\VerificadorEleitoral\\Imagens\\proibido.png");
JOptionPane.showMessageDialog(null, null,"Voto Proibido", 0, imagem_op);
         }
}

});

// Motrar a tela
tela.setVisible(true);
```
