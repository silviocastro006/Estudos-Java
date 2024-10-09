## Criando o programa

Bom, eu tenho uma forma bem peculiar de fazer as coisas, principalmente pelo meu humor quebrado, então não leve tanto a sério as coisas que desenvolvo.

Como qualquer outro exercício que realizamos, vou primeiro criar a arte para o fundo e ela ficou da seguinte forma:

![tela_militar](https://github.com/user-attachments/assets/26496a10-e8b6-403e-b4a0-288a4e5d6cd3)


Agora que temos a base vamos criar um exercício, importar as bibliotecas padrões para o Swing e começar a programar.

## Criando a tela principal

Algo que eu comecei a ver foram os temas diferentes que temos para os componentes em Java, neste caso usei uma que já existe no pacote swing que é o `Nimbus`.

Fora isso é tudo muito padrão, criar a tela principal, tamanho, localização, bla bla bla. 

<aside>
💡

Se parar para pensar é por isso que existem as plataformas `low code`, pois toda esta parte de criação da base é sempre igual, então não teria a necessidade de fazermos na mão toda vez, mas no meu caso estou fazendo para me familiarizar com o que estou usando.

</aside>

```java
// Definindo um tema para o progama
 UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
  
  
 // Configurando a tela inicial
 JFrame tela = new JFrame("Exercício 2 aula 09 - Alistamento Militar");
 tela.setSize(515, 639);
 tela.setLocationRelativeTo(null);
 tela.setLayout(null);
```

### Configurando o fundo de tela

Nada de diferente também, só um `label` que segura uma imagem e serve para receber os outros componentes que vamos criar

```java
// Criando uns labels para indicar informações
JLabel idade = new JLabel("Idade");
idade.setSize(150,30);
idade.setLocation(60, 370);
idade.setForeground(Color.black);
idade.setFont(new Font("Arial",Font.BOLD,40));
fundo.add(idade);
```

### Configurando um `JSlider`

Aqui já é um elemento que ainda não usei sendo um `JSlider` ele é um seletor deslizante onde definimos valores mínimos e máximos e podemos usar como uma forma de input para o usuário, então conforme o bloco abaixo eu segui o seguinte caminho:

- Instanciei o objeto
- Defini sua localização
- Defini seu tamanho
- Adicionei o `slider` ao objeto fundo
- Com o `.setOpaque(false)` o `background` do slider fica transparente
- `setBackground(Color.red)` aqui na verdade não tinha necessidade pois ele não tem background
- `setMajorTickSpacing` são os traços que marcam os maiores valores ou seja se eu defini o limite de 100, ele vai dividindo de 20 em 20
- `setMinorTickSpacing(5)` aqui já são os traços menores ele vai dividindo 5 em 5 entre cada 20
- As 3 linhas abaixo é para permitir mostrar as linhas de grade do slider

```java
// Adicionando um slider para informar a idade
JSlider slider = new JSlider(JSlider.HORIZONTAL,0,100,0);
slider.setLocation(170, 375);
slider.setSize(200, 50);
fundo.add(slider);
slider.setOpaque(false);
slider.setBackground(Color.red);
slider.setMajorTickSpacing(20);
slider.setMinorTickSpacing(5);
slider.setPaintLabels(true);
slider.setPaintTicks(true);
slider.setPaintLabels(true);
```

### Adicionando um `JLabel` para atualizar conforme `JSlider`

Ter um `slider` as vezes pode não ser o suficiente ou ficar difícil ver o quanto selecionamos, sendo assim coloquei um número ao lado para atualizar conforme mexemos no `slider`.

```java
// Adicionando um label para mostra a idade atual
JLabel idade_atual = new JLabel("0");
idade_atual.setLocation(395, 365);
idade_atual.setSize(100,40);
fundo.add(idade_atual);
idade_atual.setFont(new Font("Arial",Font.PLAIN,40));
```

### Adicionando um botão na tela

Aqui é um botão simples com uma imagem dentro dele e um nome, o resto são só algumas configurações de aparência.

```java
// Adicionando botões na tela
ImageIcon img_analisar = new ImageIcon("src\\AlistamentoMilitar\\imagens\\img_ver.png");
JButton bot_analisar = new JButton("Analisar", img_analisar);
bot_analisar.setSize(160,80);
bot_analisar.setLocation(170, 450);
bot_analisar.setFont(new Font("Arial",Font.BOLD,17));
bot_analisar.setBackground(Color.decode("#467f3f"));
bot_analisar.setForeground(Color.white);
bot_analisar.setFocusPainted(false);
fundo.add(bot_analisar);
```

## Criando ações para o botão

Um botão sem o função não ser para nada né? Então dependendo do valor que o usuário deixa na tela eu peço para criar um JOptionPane e mostrar uma imagem e um texto. 

## Qual imagem e texto?

Bom, para isso vai ter que entrar no meu github, pegar o código e ver o que acontece 😉, segue o link: https://github.com/silviocastro006/Estudos-Java/tree/main/Interfaces_Complexas/src/AlistamentoMilitar

```java
// Adicionando uma ação para o botão analisar
bot_analisar.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent ae) {
int idade_slider = Integer.parseInt(String.valueOf(slider.getValue()));

if(idade_slider==69){
String status = "Escolheu esta idade por que ein?";
ImageIcon icon = new ImageIcon("src\\AlistamentoMilitar\\imagens\\imagem_al.png");
JOptionPane.showMessageDialog(null, status, "Verificando informações", JOptionPane.INFORMATION_MESSAGE, icon); 
} else if(idade_slider>18){
int ano_alist = idade_slider - 18;
String status = String.format("Você deveria ter se alistado há %d anos",ano_alist);
ImageIcon icon = new ImageIcon("src\\AlistamentoMilitar\\imagens\\alistamento1.png");
JOptionPane.showMessageDialog(null, status, "Verificando informações", JOptionPane.INFORMATION_MESSAGE, icon);
} else if(idade_slider==18){
String status = "Seu alistamento é este ano, boa sorte....";
ImageIcon icon = new ImageIcon("src\\AlistamentoMilitar\\imagens\\alistamento2.png");
JOptionPane.showMessageDialog(null, status, "Verificando informações", JOptionPane.INFORMATION_MESSAGE, icon);
} else{
int ano_alist = 18 - idade_slider;
ImageIcon icon = new ImageIcon("src\\AlistamentoMilitar\\imagens\\alistamento3.png");
String status = String.format("Te espero daqui a %d anos.....", ano_alist);
JOptionPane.showMessageDialog(null, status, "Verificando informações", JOptionPane.INFORMATION_MESSAGE, icon);

}
}
```
##Resultado Final
![image](https://github.com/user-attachments/assets/25439c4d-7a1e-415f-ae5e-1f59a927c9f5)


});
```
