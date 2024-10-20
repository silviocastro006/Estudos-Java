<aside>
📝

## Enunciado

Crie a interface abaixo com operadores ternários para verificar a idade conforme a data inserida:

- O ano atual deverá ser o retirado do sistema operacional ( não inserir manualmente )
- Se idade >= 18 será Maior idade
- Se idade < 18 será Menor idade
- Se idade >= 100 <=115 será Ancião
- Se idade > 115 será Possivelmente morto
</aside>

![image](https://github.com/user-attachments/assets/7f57a208-87ed-4cbd-b606-b7063b7ddcd0)

![image](https://github.com/user-attachments/assets/90550c3f-f3a2-469e-a8af-798cf0923b79)

# Criando a interface

Bom vamos fazer um pouquinho mais bonito né? E por enquanto não vou usar o `Swing low code`, vou fazer na mão, mas com outros elementos

## Tela de fundo

Continuei o mesmo padrão que usei no exercício anterior de 500x600, então criei a seguinte tela de fundo: 

![image](https://github.com/user-attachments/assets/07ff9217-ac9d-4d69-94a4-fd0dc48cd649)

### Vamos então criar o programa base no Java, começando com o JFrame:

```java
// Criando a tela principal
JFrame tela = new JFrame("Exercício aula 8 - Verificador de Idade");
tela.setSize(515, 630);
tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
tela.setLocationRelativeTo(null);
```

Aqui é bem padrão, instanciamos um objeto, definimos o seu tamanho, seu comportamento ao fechar e onde ele vai ficar na tela.

### Inserindo a imagem no fundo da tela

Como o `JFrame` não tem uma propriedade embutida para receber imagem, criamos um `JLabel` indicando uma imagem pra ele, definindo um valor exato e colocamos na tela principal.

```java
 // Criar um label para por uma imagem de fundo
        
ImageIcon image = new ImageIcon("src\\Verificador_Idade\\imagens\\tela_idade.png");
JLabel fundo = new JLabel(image);
tela.add(fundo);
fundo.setBounds(0,0,500,600);
```

Note que o caminho precisa estar relativo, senão ele não vai achar a imagem, como todo o projeto Java tem a pasta `src`, então basta deixar desta forma.

## Criando os componentes principais

### Botão

Para criar um botão, também é algo simples, mas desta vez eu não fiz o seu gráfico, apenas criei de forma padrão no Java.

```java
// Criar um botão em algum lugar
JButton botao = new JButton("Calcular");
botao.setSize(150, 30);
fundo.add(botao);
botao.setLocation(175, 352);
botao.setForeground(Color.black);
botao.setBackground(Color.decode("#d0f0f4"));
botao.setFont(new Font("Arial",Font.BOLD,20));
botao.setFocusPainted(false);
```

Repare que o `setFocusPainted` é para tirar o retângulo do texto de dentro do botão quando passamos o mouse para ficar um pouco mais limpo.

### Input para o nome

É comum confundir o nome dos widgets ainda mais quando usa duas linguagens diferentes, como no `Python` é `Entry`, no `Java` é `JTextField`, seu input padrão de texto.

```java
// Criando o input para o nome
 JTextField input_nome = new JTextField();
 input_nome.setSize(263,36);
 input_nome.setLocation(170, 223);
 input_nome.setFont(new Font("Arial",Font.PLAIN,20));
 input_nome.setForeground(Color.decode("#d0d0cf"));
 input_nome.setText("Clique para digitar nome...");
 input_nome.setMargin(new Insets(0,10,0,0));
 fundo.add(input_nome);
```

Um método diferente que usei foi o `setMargin`, ele serve para indicar as margens internas do texto dentro do widget, eu usei para criar uma indentação um pouco para a direita, para não ficar colado com a borda do input.

### `Spinner` para o ano de nascimento

`Spinner` é um componente que pode ter várias formas de tratamento, como eu estava fazendo um exercício simples, não quis me aprofundar tanto, apenas deixei como modelo numérico, adicionei mínimo e máximo.

```java
// Criando o spinner para a o ano
SpinnerModel model = new SpinnerNumberModel(1980, 1900, 999999999, 1);
JSpinner input_ano = new JSpinner(model);
input_ano.setSize(163, 36);
input_ano.setLocation(270, 280);
       
// Acessando o componente de texto dentro do spinner para editar
JComponent editor = input_ano.getEditor();
JFormattedTextField txtspinner = ((JSpinner.DefaultEditor) editor).getTextField();
 txtspinner.setFont(new Font("Arial",Font.PLAIN,25));
 txtspinner.setHorizontalAlignment(JFormattedTextField.CENTER);
```

Algo diferente também que aprendi foi acessar os componentes internos de casa widget, como o `JComponent`, podemos acessar o editor do widget que quisermos e a partir dele acessar como o texto será formatado, de forma mais específica, no meu caso acessei, mudei a sua fonte e o seu alinhamento.

### `JLabel` para o resultado final

Uma das últimas partes é adicionar o resultado da operação que formos fazer, então criei um `JLabel` para poder mostrar a manipulação dos dados que for resgatar.

```java
// Adicionando label para resultado
       
JLabel resultado = new JLabel();
resultado.setText("Clique em calcular para ver o resultado");
resultado.setForeground(Color.decode("#d0d0cf"));
resultado.setSize(360, 36);
resultado.setLocation(75, 491);       
resultado.setFont(new Font("Arial",Font.PLAIN,20));
fundo.add(resultado);
```

## Preparando o script

### Resgatando o ano atual do sistema

Uma prática bem padrão é utilizar os dados vindos do sistema operacional, para que não seja necessário alterar manualmente, sendo assim importei a biblioteca `Java.Time` para utilizar alguns métodos específicos.

```java
import java.time.*;
LocalDate tempo = LocalDate.now();
int ano_atual = tempo.getYear();
```

Desta forma a variável `ano_atual` terá o valor inteiro do ano vindo do SO.

### Adicionando eventos no `input_nome`

Meu intuito inicial é quando clicado no `input_nome` ele apague a “máscara” e coloque o texto para preto.

```java
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
```

Além disso se for clicado mas não for digitado nada, ou seja perder o foco, ele volta ao que estava no início

```java
input_nome.addFocusListener(new FocusAdapter() {
       
 @Override
 public void focusLost(java.awt.event.FocusEvent e){
     if(input_nome.getText().isEmpty()){
         input_nome.setForeground(Color.decode("#d0d0cf"));
         input_nome.setText("Clique para digitar nome...");
     }
}});
       
```

### Adicionando eventos para o botão

O botão que comanda toda a parte de manipulação dos dados, além disso é onde a maior parte dos comandos ficam (pelo menos em um evento), então nesta primeira parte nós definimos uma `variável String chamada tipo global` para ser enxergada em todas as funções, a primeira parte é restado o valor que está dentro do `input_nome` e enquanto for padrão ou vazio ele dará uma mensagem de erro.

```java
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
```

Feito isso vamos calcular a idade com outra tratativa de erro onde o ano não poderá ser menor que 1940 nem maior que 2023, fora isso é bem básico.

```java
// Calcular idade
                int ano_nasc = Integer.parseInt(String.valueOf(input_ano.getValue()));
                while(ano_nasc<1900 || ano_nasc >2023){
                    JOptionPane.showMessageDialog(null, "Insira um ano maior que 1940 e menor que 2023", "Erro", JOptionPane.ERROR_MESSAGE);
                    input_ano.setValue(1980);
                    return;
                }
                int idade = (ano_atual-ano_nasc);
```

Fora isso definimos algumas condições para os possíveis resultados para definir o que será mostrado na `label` resposta.

```java
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
```

## Finalizando o programa

```java
// Adicionando na tela
       fundo.add(input_ano);
       
        
        
        
  // Criando o posicionamento e setar a tela para mostrar
  tela.setResizable(false);
  tela.setVisible(true);
  
  
  
}
}
```

# Quer ver o código completo?

<aside>
💡

Acesse o meu repositório de **`github`** para ver todos os meus códigos: https://github.com/silviocastro006/Estudos-Java

</aside>
