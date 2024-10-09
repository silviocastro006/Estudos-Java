<aside>
📝

## Enunciado

Cria uma calculadora que mostre resto da divisão, elevado ao cubo, raiz quadrada, raiz cúbica, valor absoluto 

</aside>

![image](https://github.com/user-attachments/assets/bec963f6-1f1c-4eee-8a7f-cb3260f82cf9)

# Montando o exercício

Bom, eu não consegui achar a imagem exata da calculadora e como eu achei o modelo bem feio, decidi fazer algo pelo canva, criando todos os componentes e fazendo da minha forma, ficando assim:

![image](https://github.com/user-attachments/assets/bc9cf3d7-6461-4b2e-92e7-fc3cc67eb564)

## Entendendo como o código funciona

### Pastas

A organização do projeto é bem simples, ficando um pacote para o código e outro para as imagens.

![image](https://github.com/user-attachments/assets/89b3513a-0328-4b67-90b6-a3a60af10251)

A parte importante de organizar desta forma é saber de onde as imagens são por isso que a pasta se chama  `SuperCalculadora.Imagens`.

### Importações iniciais

Basicamente usamos a lista abaixo que seria para a criação da interface, os eventos e “escutadores” de eventos para os componentes e a math para cálculo

```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.*;
```

### Criação da tela inicial

Dentro do `main` do programa, criamos a tela principal sendo o `JFrame`, com seu tamanho, localização no monitor, forma de fechamento e título

```java
// Criando uma tela principal com o JFrame
JFrame tela = new JFrame();
tela.setSize(515,639); // Alterar o tamanho da tela principal
tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// Ao invés de usar o setbounds posso apenas indicar que a tela fica relativa, 
//então como null, a mesma fica no meio
tela.setLocationRelativeTo(null); 

tela.setTitle("Exercício Curso em Vídeo aula 07");
```

### Criação da imagem de fundo

Como o `JFrame` não um parâmetro para inserir uma imagem de fundo, podemos criar um frame, inserir uma imagem nele e adicioná-lo na tela.

```java
// Criação de uma imagem para inserir no label e colocar no fundo o
ImageIcon label_fundo = new ImageIcon("src\\SuperCalculadora\\Imagens\\fundo_tela.png");
JLabel fundo = new JLabel(label_fundo);
tela.add(fundo);
fundo.setBounds(0, 0, 500, 600); 
// a imagem é 500 x 600 mas a tela principal ocupa um pouco do espaço, então
// coloquei um acréscimo de 15px de width e 39px de height
```

<aside>
💡

Uma coisa importante é se criarmos uma tela de por exemplo 500x600 e um frame com o mesmo tamanho pensando que a imagem ocupará a tela cheia, na verdade por causa do menu superior e as bordas, ele ocupa um pouco do espaço total, então no exemplo abaixo, como o meu `label` era 500 x 600, adicionei 15 no `width` e 30 no `height` para o `JFrame` ficando 515 x 639

</aside>

### Criando os `labels` para a informação superior

Aqui ficará a parte de informe o seu valor, mas seria apenas um `label` com configuração de fonte, cor, e especificação do local.

```java
// Criar os labels de informação
JLabel informe = new JLabel("Informe um valor:");
informe.setFont(new Font("Calibri",Font.BOLD, 25));
fundo.add(informe);
informe.setBounds(20, 150, 200, 50);
informe.setForeground(Color.WHITE);
```

### Criando um spinner para seleção de valor

Um spinner é úm campo de texto com uma parte de setas para aumentar e diminuir o valor, além disso o usuário poderá mudar de forma direta.

```java
// Criando um seletor de valor
SpinnerNumberModel modelo = new SpinnerNumberModel(0,0,100,1);
JSpinner spinner = new JSpinner();
spinner.setFont(new Font("Arial", Font.BOLD, 20));
fundo.add(spinner);
spinner.setBounds(220, 158, 125, 30);
```

### Alterando a aparência do ToolTip

O `UiManager` auxilia a mudar a cor dos elementos do swing, sendo assim mudei a cor de fundo do `tooltip` para amarelo, a cor da letra para preto e a fonte para Arial 20 com negrito.

```java
// Alterando a aparencia do tool tip
UIManager.put("ToolTip.background", Color.decode("#ffff8f"));
UIManager.put("ToolTip.foreground", Color.black);
UIManager.put("ToolTip.font", new Font("Artial", Font.BOLD, 20));
```

### Criando os `labels` para a área de resultado ( título )

A partir de agora estou criando os títulos das coisas que vamos mostrar na parte de resultados, seguindo os seguintes passos:

- Criando os objetos
- Inserindo no widget pai
- Alterando o tamanho da fonte
- Organizando na tela

```java
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
```

### Criando os `labels` para a área de resultado ( valores )

Agora fazemos a mesma coisa, porém para o resultado de cada um, a única diferente é que trocamos a cor da letra para verde `#51a30a`

```java
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
```

### Criando um botão para executar uma função

Primeiramente criamos um botão normal, carregando uma imagem, depois disso:

- Tiramos a borda pintada
- Adicionamos no widget pai
- Organizamos na tela
- Adicionamos uma `tooltip` para aparecer quando o mouse passar por cima

```java
// Criar um botão
ImageIcon botao = new ImageIcon("src\\SuperCalculadora\\Imagens\\botao.png");
JButton calcular = new JButton(botao);
calcular.setBorderPainted(false);
calcular.setContentAreaFilled(true);
fundo.add(calcular);
calcular.setBounds(370, 120, 100, 100);
calcular.setToolTipText("Clique para calcular!");
```

### Criar uma animação para o clique do mouse

Criar uma animação é algo até simples porque somente mudamos as coordenadas do elemento, então vamos explicar passo a passo como funciona esta parte abaixo:

```java
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
```

`Listeners`, `adapters` e `events` fazem parte do sistema de tratamento de eventos em Java, muito utilizado em interfaces gráficas para capturar ações do usuário, como cliques, movimentos do mouse ou pressionamento de teclas.

### 1. **`Events` (Eventos)**

Um evento é qualquer ação que ocorre durante a execução de uma aplicação, como um clique do mouse, movimentação do cursor ou digitação no teclado. O `MouseEvent` é o tipo de evento que representa uma ação do mouse (como pressionar ou liberar o botão do mouse).

### 2. **`Listeners` (Ouvintes)**

Um `listener` é um objeto que "ouve" um determinado tipo de evento e responde a ele. Ou seja, é uma interface ou classe que espera por um evento específico e, quando esse evento ocorre, o `listener` é notificado para executar uma ação. No código, o `MouseListener` é o ouvinte que está "ouvindo" os eventos de mouse no botão `calcular`.

### 3. **`Adapters` (Adaptadores)**

Um `adapter` é uma classe especial que implementa uma interface de `listener`, mas com implementações vazias para todos os métodos. Isso facilita o desenvolvimento, já que só precisa sobrescrever os métodos que realmente importam para a sua aplicação. No caso, está sendo usado um `MouseAdapter`, que implementa o `MouseListener` com implementações vazias, e você só precisa sobrescrever os métodos que deseja, como `mousePressed` e `mouseReleased`.

### Explicação do código:

- **`addMouseListener(new MouseAdapter() {...})`**: Você está adicionando um ouvinte do tipo `MouseListener` ao botão `calcular`, mas em vez de implementar todos os métodos do `MouseListener`, você está usando um `MouseAdapter` para sobrescrever apenas os métodos que importam (neste caso, `mousePressed` e `mouseReleased`).
- **`mousePressed(MouseEvent e)`**: Este método é chamado quando o botão do mouse é pressionado. Aqui, você altera o tamanho do botão `calcular` para simular uma animação de clique.
- **`mouseReleased(MouseEvent e)`**: Este método é chamado quando o botão do mouse é liberado. Ele reverte o tamanho do botão de volta ao original após a simulação do clique.

### Criar uma função para o clique do botão

```java
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
```

O código utiliza um **ActionListener** para executar uma ação em resposta a um evento, especificamente quando o botão `calcular` é clicado.

### Funcionamento:

1. **ActionListener**:
    - Um **ActionListener** está sendo adicionado ao botão `calcular`. Esse listener é uma interface responsável por "ouvir" ações, como cliques de botões. Quando o botão é acionado, o método `actionPerformed` é chamado automaticamente, onde a lógica de processamento do evento é implementada.
2. **Conversão do valor do spinner**:
    - O valor selecionado no componente `spinner` está sendo convertido para um número inteiro utilizando `Integer.parseInt(spinner.getValue().toString())`. O componente `spinner` permite selecionar ou digitar valores, e este valor está sendo manipulado como uma string que é convertida para um número.
3. **Verificação do valor**:
    - Antes de qualquer cálculo, uma condição está sendo verificada para garantir que o número não seja maior que 100. Caso seja, uma caixa de diálogo com uma mensagem de erro é exibida através de `JOptionPane.showMessageDialog`. O valor do `spinner` é então redefinido para 0, assim como todos os campos de resultado (`res_div2`, `res_ele_cubo`, etc.). A execução do método é interrompida com `return`, impedindo que os cálculos seguintes sejam feitos.
4. **Cálculos matemáticos**:
    - Se o valor do `spinner` for válido (menor ou igual a 100), diferentes operações matemáticas são realizadas e exibidas em campos de saída:
    - **Resto da divisão por 2**: O valor do número mod 2 está sendo calculado com `num % 2`, representando o resto da divisão. O resultado é exibido no campo `res_div2`.
    - **Elevação ao cubo**: A operação de elevação ao cubo está sendo feita com `Math.pow(num, 3)`. O resultado é formatado para duas casas decimais e exibido no campo `res_ele_cubo`.
    - **Raiz quadrada**: A raiz quadrada do número está sendo calculada com `Math.sqrt(num)`, e o resultado também é formatado e exibido em `res_raiz_quad`.
    - **Raiz cúbica**: A raiz cúbica está sendo obtida por meio de `Math.cbrt(num)` e o valor é mostrado no campo `res_raiz_cub`.
    - **Valor absoluto**: A função `Math.abs(num)` está sendo utilizada para calcular o valor absoluto (sem sinal) do número, e o resultado é exibido em `res_abs`.

### Finalizando

Definimos a visualização da interface

```java
// Definir a visualização das telas
tela.setResizable(false);
tela.setVisible(true);
```
