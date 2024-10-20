<aside>
📝

## Enunciado

Cria uma tela que calcule a idade da pessoa com o ano atual do sistema

</aside>

Bom, no vídeo Exercícios Java #6 o Guanabara pediu para fazer uma interface mais ou menos assim:

![image](https://github.com/user-attachments/assets/6e1fee7a-d827-4bdb-adab-4e037f926290)


Ele é composto por algumas coisas, além do Jframe que fica no fundo, nós temos os seguintes componentes:

![image](https://github.com/user-attachments/assets/b69c91d8-a82c-4008-8b2d-9ca8dd552eef)


Nas propriedades dos elementos podemos colocar icons o que coloca uma imagem adaptada e para que seja do tamanho ideal, é melhor usarmos algum editor de imagem para ja ter o tamanho certo, por exemplo os ícones do calendário e do usuário eu peguei do [freepik.co](http://freepik.co)m e redimensionei usando o gimp.

## O que o programa faz?

Simples, o usuário pode usar o slider ou digitar o ano e clicar em calcular e no back-end o programa deverá pegar o ano atual e subtrair pelo valor digitado.

Inicialmente coloquei da seguinte forma, mas vamos alterar.

```java
private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {                                        
        int an = Integer.parseInt(txtAn.getValue().toString());
        int id = 2024 - an;
        lblIdade.setText(Integer.toString(id));      
    }   
```

Claro que o programa é bem maior que esse pois tem toda a parte de criar a tela e configurar mas vou abstrair pois usei o low-code neste caso, vamos nos atender no que ele está fazendo passo a passo:

1 ) Crio uma função que será um evento quando o botão for clicado

```java
private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {                                        
```

2 ) Crio uma variável chamada `an` e ela vai ser a conversão para inteiro do valor que eu peguei no `slider`, mas se você reparar, eu estou convertendo 2 vezes. Por que?

Para entender isso, precisamos lembrar que se fosse um `textfield` o valor resgatado seria `character` então somente uma conversão resolveria, mas o `slider` é um objeto, então precisamos:

- inicialmente pegar o valor dele, mas ele retorna um objeto e não um valor com tipo primitivo, então precisamos em seguida;
- Converter para String;
- Finalmente converter para inteiro

```java
int an = Integer.parseInt(txtAn.getValue().toString());
```

3 ) Aqui eu estou fazendo de forma bem manual, mas e se for outro ano? Vamos resolver já já

```java
int id = 2024 - an;
```

4 ) Aqui chamamos aquele `label` que está em vermelho para trocar ou `setar` o valor para a variável id

```java
lblIdade.setText(Integer.toString(id));
```

## Vamos melhorar o programa

No exercício anterior que mexemos com datas, usamos uma biblioteca do `java.util` chamada de `Date` , mas termos várias formas de resolver pois a biblioteca `Date` e `Calendar` foram melhoradas e criado um pacote chamado `Java.Time`.

### 1 ) Usando o `Date`

Usando o `Date` percebi que existe algo muito esquisito com esta classe, pois por algum motivo quando usamos o método `getYear()` ele retorna o ano -1900 então eu tive que somar manualmente para dar o ano correto.

```java
import java.util.Date;

private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {                                        
    int an = Integer.parseInt(txtAn.getValue().toString());
    Date data = new Date();
    int ano_atual = data.getYear()+1900;
    int idade = ano_atual - an;
    lblIdade.setText(String.valueOf(idade));
        
```

### 2 ) Usando o `Calendar`

O `Calendar` é um pouco diferente pois nós não instanciamos um novo objeto mas pegamos as propriedades do sistema atual para utilizar, então logo de cara a forma como declaramos a criação de um calendário é diferente pois não usamos o `new`.

Além disso para pegarmos o ano precisamos chamar o método get e dentro dele indicamos o valor que queremos pegar.

```java
import java.util.Calendar;

private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {                                        
    int an = Integer.parseInt(txtAn.getValue().toString());
    Calendar calendario = Calendar.getInstance();
    int ano_atual = calendario.get(Calendar.YEAR);
    int idade = ano_atual - an;
    lblIdade.setText(String.valueOf(idade));
}                                       
```

### 3 ) Usando o Time

Temos algumas formas de resolver com o time, a principal é que não precisamos necessariamente criar um objeto para fazer as manipulações, no exemplo abaixo eu usei um método direto para pegar somente o ano atual do sistema.

```java
import java.time.*;

private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {                                        
    int an = Integer.parseInt(txtAn.getValue().toString());
    int ano_atual = LocalDate.now().getYear();
    int idade = ano_atual - an;
    lblIdade.setText(String.valueOf(idade));
}            
```

Com este exercício podemos ver que temos inúmeras formas de resolver a mesma coisa, basta claro pesquisar e ter a força de vontade para resolver. 

Se quiser ver este exercício completo, pode ir no meu github em: https://github.com/silviocastro006/Estudos-Java/tree/main/Interfaces_Complexas/src

![image](https://github.com/user-attachments/assets/99ced837-acd2-485c-b4d5-abe95c0530df)
