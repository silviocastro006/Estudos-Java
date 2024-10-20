<aside>
📝

## Enunciado

Da mesma forma que fez o fatorial, crie o mesmo exercício mas mostrando o calculo completo

</aside>

![image](https://github.com/user-attachments/assets/36f8f0de-2de8-4be1-a0c8-cf345c41e494)

Fiz o mesmo esquema do calculo de fatorial, mas desta vez detalhando o calculo passo por passo, primeiro criei a interface:

![image](https://github.com/user-attachments/assets/ec494a9a-3691-4754-baff-af27c5bed930)

Feito isso e renomeando os nomes das variáveis dos componentes criei um evento change no spinner e criei o seguinte código:

```java
 private void spinStateChanged(javax.swing.event.ChangeEvent evt) {                                  
        
        int n = Integer.parseInt(String.valueOf(spin.getValue()));
        int fat = 1;
        String texto = "";
        if(n==0){
            lbl_fat.setText(texto);
        } else if(n==1){
            lbl_fat.setText("1");
        } else{
            for(int c = n;c>=1;c--){
              fat *= c;
              if(c>1){
                texto += c+" x ";
              } else{
                texto += c;
              }
            lbl_fat.setText(texto);
            lbl_tot.setText(Integer.toString(fat));
          }  
        }
        
    }                     
```

Ele faz a mesma coisa que o outro código do fatorial (acaba sendo o mesmo) mas a diferença que a cada loop que eu passo eu concateno o valor de c e mais um “ x ” se for maior que 1, se for menor, entende-se que é o último número então coloco apenas o valor de c.

Feito todos os ajustes, o resultado final é:

![image](https://github.com/user-attachments/assets/220e0584-9e11-47e0-882f-7c68a7f99f9a)

## Quer ver o código completo?

Acessa o meu `github` em: https://github.com/silviocastro006/Estudos-Java/tree/main/Interfaces_Complexas/src/Fatorial15Detalhes
