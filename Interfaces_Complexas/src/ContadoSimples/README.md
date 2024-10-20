<aside>
📝

## Enunciado

Crie uma interface que apertando um botão informe uma contagem de 1 até 10 (com uma estrutura de repetição simples)

</aside>

![image](https://github.com/user-attachments/assets/f5c91942-264e-446d-8062-c8b4367069f1)

## Analisando a lógica do programa

Primeiramente precisamos entender que, como estamos lidando com interface gráfica, temos que armazenar o valor em algum lugar e `setar` o texto do elemento após a contagem, então segui os seguintes passo:

### Criei o modelo da interface via `low-code swing`

Não tem muito que ver aqui, porque são literalmente 3 componentes além do `JFrame` inicial

![image](https://github.com/user-attachments/assets/7fbb245a-0ccf-4cd4-8340-f6039002b113)

### Adicionei uma ação ao botão contar para realizar o seguinte

```java
 private void btn_contActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        int c = 1;
        String contagem ="";
        while(c<=10){
            contagem += c + " ";
            c++;
        }
        lbl_cont.setText(contagem);
    }                                        

```

Vamos entender o script:

- `private void btn_contActionPerformed(java.awt.event.ActionEvent evt) {` → aqui eu crio uma função publica e `void` (não retorna nada) chamada `btn_contActionPerformed` que recebe como parâmetro um evento de ação
- `int c = 1;` → declaro uma variável chamada c, ela recebe o valor de 1
- `String contagem ="";` → declaro uma variável chamada contagem que recebe literalmente nada inicialmente
- `while(c<=10){`  → inicio o bloco de repetição incluindo quando o c chegar a 10
- `contagem += c + " ";` → a cada loop a variável contagem vai receber o valor dela mesmo mais a concatenação de c e um espaço
- `c++;` → variável c é incrementada
- `lbl_cont.setText(contagem);` → após fechar o bloco de repetição, eu defino o texto do lbl_cont com o valor da variável contagem.

## Quer ver o código completo?

Acessa o meu `github` em: https://github.com/silviocastro006/Estudos-Java/tree/main/Interfaces_Complexas/src/ContadoSimples
