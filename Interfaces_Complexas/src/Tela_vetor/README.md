<aside>
📝

## Enunciado

Crie uma tela que seja capaz de mostrar um vetor de 10 espaços, tenha um botão para adicionar, remover e ordenar a lista. Além disso se selecionarmos o índice da lista, podemos indicar o valor e trocar conforme desejarmos.

</aside>

Conforme o exercício final para a aula de vetores, o `guanabara` pediu para criarmos o seguinte:

![image](https://github.com/user-attachments/assets/8177f00f-db0c-4308-8c56-36f5eb5c478d)

## Criando a interface

Como sempre usando o `swing low code` (bem mais rápido) criei os componentes necessários alterando os seus nomes e variáveis.

![image](https://github.com/user-attachments/assets/0045fa53-8725-43ab-8b03-7c7c520af787)

Na lista precisei tirar os elementos padrões que vinham dentro dela para ficar tudo limpo.

## Criando o vetor principal no `main`

Ao acessar a classe principal e antes do `main`, declarei o seguinte para que seja global em qualquer parte do código.

- Um vetor de número inteiro de 5 posições
- Criei um modelo de lista (ele serve para armazenar elementos para mostrar no widget lista do swing)
- criei uma variável chamada selecionado valendo inicialmente como 0

```java
int vetor[] = new int[5];
DefaultListModel lista = new DefaultListModel();
int selecionado = 0;
```

Ao declarar isso, entrei nas propriedades da lista e vinculei o modelo para que possa já atualizar quando inserir os elementos

![image](https://github.com/user-attachments/assets/82d805c9-cbdd-442e-b9b0-3a52f404a115)

## Criando uma função para o botão adicionar

Vamos entender o que ele faz, pois logo de cara fica um pouco confuso, mas vamo lá:

- Temos inicialmente um vetor de 5 posições iniciando com tudo zerado
- Declaramos que o vetor na posição do valor de selecionado (`vetor[selecionado]`) recebe o valor que está no `spinner`, declarado como `txt_num`
- Chamamos o método `removeAllElements()` do modelo lista
- Finalizamos com um for para varrer todo o vetor e adicionar o que tiver dentro do modelo lista como um elemento

### Aqui está a parte que confunde

O vetor ele sempre será atualizado, mas o que não atualiza é a lista mostrada no swing, porque para ela estar sempre atualizada, precisamos remover todos os itens e inseri-los novamente.

```java
private void btn_adicionarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        vetor[selecionado] = Integer.parseInt(txt_num.getValue().toString());
        lista.removeAllElements();
        for(int c = 0; c< vetor.length;c++){
            lista.addElement(vetor[c]);
        }
    }  
```

Além disso o vetor realmente começa tudo com 0, como pode ver eu coloquei um for para varrer o vetor logo quando criado e mostrar na tela:

![image](https://github.com/user-attachments/assets/0219d134-58f6-4b18-8088-18deb0822270)

## Criando uma função para o botão Remover

Segue o mesmo principio que o adicionar, mas neste caso a posição no valor do selecionado no vetor, será zero e teremos apenas que remover todos os elementos e inserir novamente.

```java
private void btn_removerActionPerformed(java.awt.event.ActionEvent evt) {                                            
        vetor[selecionado] = 0;
        lista.removeAllElements();
        for(int c = 0; c< vetor.length;c++){
            lista.addElement(vetor[c]);
        }
        
    }     
```

## Criando uma função para ordenar

Essa é a mais simples pois chamamos apenas o método de `Arrays` para ordenar, removemos e inserimos novamente na lista do swing.

```java
private void btn_ordenarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        Arrays.sort(vetor);
        lista.removeAllElements();
        for(int c = 0; c< vetor.length;c++){
            lista.addElement(vetor[c]);
        }
    }      
```

## Criando uma função para o valor selecionado

De acordo com o código até agora, o valor da variável selecionado não muda, pois não declaramos nada para fazer isso, sendo assim, na lista criamos um evento par o clique do mouse e dependendo da posição que por clicada, pegamos o índice e jogamos no selecionado, a partir daí podemos, adicionar e remover além do índice 0 do vetor.

```java
private void lst_vetorMouseClicked(java.awt.event.MouseEvent evt) {                                       
        selecionado = lst_vetor.getSelectedIndex();
        lbl_selecionado.setText("["+selecionado+"]");
    } 
```

## Quer ver o código completo?

Acesse o meu `github` em: https://github.com/silviocastro006/Estudos-Java/tree/main/Interfaces_Complexas/src/Tela_vetor
