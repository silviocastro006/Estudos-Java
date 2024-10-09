<aside>
📝

## Enunciado

Crie a seguinte interface abaixo conforme regras de formação de triangulo, sendo:

> Para que os três segmentos formem um triângulo, existe o que conhecemos como condição de existência, que é a seguinte: a soma de dois lados é sempre menor que o terceiro lado
> 
- Triangulo com 3 lados iguais = Equilátero
- Triangulo com 2 lados iguais = Isósceles
- Triangulo com 3 lados diferentes = Escaleno
</aside>

![image](https://github.com/user-attachments/assets/cb150b43-f627-4195-b467-bbd7fc8d3c91)

## Criação da interface

A partir de agora, para montar em menos tempo, estarei usando os componentes do `Swing low code` embutidos no `Netbeans` para fazer de forma mais rápida.

Dito isto as explicações daqui ficarão mais breves, pois o que eu estarei fazendo será low code, menos as ações que terei que programar, mas vamos lá.

### Componentes da interface

Esta forma de desenhar interface é muito favorável pois não precisa ficar inserindo e executando o código várias vezes, além de já dar uma pré-visualização do seu comportamento, então os componentes são esses da lista do `Navigator`.

![image](https://github.com/user-attachments/assets/d98a5d63-93ef-421e-b32f-6cff46738ca6)

### Inserindo ações para os sliders

Os `sliders` precisam alterar os valores dos `labels` inicialmente com 0 ao seu lado, sendo assim adicionamos o seguinte script que é apenas um evento de mudança

```java
private void sliAStateChanged(javax.swing.event.ChangeEvent evt) {                                  
        lbl_a.setText(Integer.toString(sliA.getValue()));
    }                                 

    private void sliBStateChanged(javax.swing.event.ChangeEvent evt) {                                  
        lbl_b.setText(Integer.toString(sliB.getValue()));
    }                                 

    private void sliCStateChanged(javax.swing.event.ChangeEvent evt) {                                  
        lbl_c.setText(Integer.toString(sliC.getValue()));
    }  
```

### Inserindo painel de resposta

Esta confusão abaixo é a forma como o swing trata a organização do layout sendo o `GroupLayout`, onde cria barreiras entre cada componentes definindo sua localização no `JFrame`.

Além disso colocamos duas `labels` dentro do `JPanel`, sendo a `lbl_status` e a `lbl_tipo`.

```java
javax.swing.GroupLayout panRespostaLayout = new javax.swing.GroupLayout(panResposta);
        panResposta.setLayout(panRespostaLayout);
        panRespostaLayout.setHorizontalGroup(
            panRespostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRespostaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panRespostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_tipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panRespostaLayout.setVerticalGroup(
            panRespostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRespostaLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(lbl_status)
                .addGap(27, 27, 27)
                .addComponent(lbl_tipo)
                .addGap(14, 14, 14))
        );

```

### Inserindo um botão e sua ação no código

Aqui criamos um botão e estamos chamando uma função para executar quando ele for clicado.

```java
bot_ver.setText("Verificar");
        bot_ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_verActionPerformed(evt);
            }
        });
```

A função seria pegar o valor de cada `slider` e armazenar em uma variável, após isso verificar de acordo com as regras da formação de triângulo o texto que será mostrado nas duas `labels` dentro do `panResposta`.

```java
private void bot_verActionPerformed(java.awt.event.ActionEvent evt) {                                        
        int a = Integer.parseInt(String.valueOf(sliA.getValue())); // não tem necessidade, já é inteiro
        int b = Integer.parseInt(String.valueOf(sliB.getValue()));
        int c = Integer.parseInt(String.valueOf(sliC.getValue()));
        if (a<b+c && b<a+c && c<a+b){
            lbl_status.setText("Foram um triângulo");
            if(a==b && b==c){
                lbl_tipo.setText("Equilátero");
            } else if(a!=b && b!=c && a!=c){
                lbl_tipo.setText("Escaleno");
            } else{
                lbl_tipo.setText("Isósceles");
            }
            
        } else{
            lbl_status.setText("Não formam um Triângulo");
            lbl_tipo.setText("----");
        }
        panResposta.setVisible(true);
```

## Quer ver o código completo?

Acesse o meu `github` no seguinte caminho: https://github.com/silviocastro006/Estudos-Java/tree/main/Interfaces_Complexas/src/MontadorDeTriangulo
