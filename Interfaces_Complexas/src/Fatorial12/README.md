<aside>
📝

## Enunciado

Crie uma interface para mostrar o calculo de fatorial de 1 até 12

</aside>

## E lá vamos nós para fatorial novamente ( é isso ou fibonnacci…)

![image](https://github.com/user-attachments/assets/16996b15-fc53-464e-8fcd-88d82f7ed7da)

Se olharmos para a interface a ser montada, ela é basicamente 5 componentes:

- `JFrame` para a tela principal
- `JSpinner` para indicar um número
- `JLabel` para mostrar o ! =
- `JLabel` para mostrar o resultado do fatorial
- Imagem bem `windows 95`

Bora fazer então…

## Construindo a interface

Ela é bem simples são realmente 5 componentes.

![image](https://github.com/user-attachments/assets/1c23494c-86de-4315-89d8-7f5c157972bb)

### Adicionando um evento de mudança no `spinner`

A chave está neste código para cálculo de fatorial, basicamente:

- Pegamos o valor atual do `spinner`
- Definimos uma variável sendo fatorial valendo 1
- Se o valor inicial for 0, o `label` vai continuar aparecendo 0
- Senão, ele vai inicial no `valor_atual` até que seja 1 diminuindo 1 em 1
    - armazena em fatorial ele vezes o valor em c
- No final já mostra no `label` o valor atualizado

```java
private void spinStateChanged(javax.swing.event.ChangeEvent evt) {                                  
        
        int valor_atual = Integer.parseInt(String.valueOf(spin.getValue()));
        int fat = 1;
        if (valor_atual==0){
            lbl_fat.setText("0");
        } else{
            for(int c=valor_atual; c>=1;c--){
            fat *=c;
            }
            lbl_fat.setText(Integer.toString(fat));
        }
        
    }          
```

## Quer o código inteiro?

Basta cessar o meu `github` em: https://github.com/silviocastro006/Estudos-Java/tree/main/Interfaces_Complexas/src/Fatorial12
