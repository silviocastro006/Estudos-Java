<aside>
📝

## Enunciado

Crie uma interface que recebe via slider os valores do início, fim e passo e ao clicar no botão, ele mostre os valores um a um

</aside>

Como o enunciado pediu, bora lá fazer, isto é basicamente uma estrutura for de forma visual.

![image](https://github.com/user-attachments/assets/8d6b96ef-259a-4f3e-ae68-4cbf5f947916)

## Montando a interface

Usando o low-code do swing, criei a interface de forma bem rápida, coloquei os nomes das variáveis dos labels, botões e a lista que iria usar.

![image](https://github.com/user-attachments/assets/83c70887-5dfd-4826-9725-00bc7a56e15c)

Feito isso especifiquei algumas informações em cada `slider`, sendo:

- Inicio seria de 0 a 5
- Fim seria de 6 a 20
- Passo seria de 1 a 4

## Inserindo as ações em cada `slider` par atualizar o `label` lateral

Basta criar um `change event` para cada um e indicar que o `label` receberá o `get` do valor do `slider`.

```java
    private void spin_inicioStateChanged(javax.swing.event.ChangeEvent evt) {                                         
        int num_ini = spin_inicio.getValue();
        lbl_inicio.setText(Integer.toString(num_ini));
    }                                        

    private void spin_fimStateChanged(javax.swing.event.ChangeEvent evt) {                                      
        int num_fim = spin_fim.getValue();
        lbl_fim.setText(Integer.toString(num_fim));
    }                                     

    private void spin_passoStateChanged(javax.swing.event.ChangeEvent evt) {                                        
        int num_passo = spin_passo.getValue();
        lbl_passo.setText(Integer.toString(num_passo));
```

<aside>
💡

Note que eu chamei a variável de `spin` e não de `sli` por razões momentaneamente psicológicas (brincadeira, eu só não prestei atenção), mas como não quis voltar e trocar, só deixei 👍🏼

</aside>

## Adicionando a função no botão

O botão basicamente vai fazer o for com os valores de cada `slider` (início, fim, passo) e inserir na lista como um item, mas para isso precisamos fazer um layout novo para ela:

```java
private void btn_anActionPerformed(java.awt.event.ActionEvent evt) {                                       
        int num_ini = spin_inicio.getValue();
        int num_fim = spin_fim.getValue();
        int num_passo = spin_passo.getValue();
        
        DefaultListModel lista = new DefaultListModel();
        
        for(int c = num_ini;c<=num_fim;c+=num_passo){
            lista.addElement(c);
        }
        
        lista_item.setModel(lista);
    }       
```

Então definimos um modelo para a lista como um novo, nesse objeto modelo inserimos um elemento novo a cada iteração do for e no final `setamos` o modelo para o atualizado.

Resultado final:

![image](https://github.com/user-attachments/assets/94fcc383-de37-4421-b5fc-15e923d5e419)

## Quer ver o código completo?

Acessa o meu `github` em: https://github.com/silviocastro006/Estudos-Java/tree/main/Interfaces_Complexas/src
