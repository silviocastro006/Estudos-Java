<aside>
📝

## Enunciado

Crie a seguinte interface abaixo seguindo as seguintes regras:

- a medida que o `spinner` muda, o calculo de delta abaixo muda também.
- Se delta ≥ 0 a equação terá raízes real
- Se delta < 0 a equação não terá raízes reais
</aside>

![image](https://github.com/user-attachments/assets/f61fd6d3-7957-4619-9084-a8a534f4fb38)

![image](https://github.com/user-attachments/assets/d4308d44-70a4-491c-8f6f-5bf2c7528239)

Este eu já fiz igual a interface acima, sendo o resultado final:

![image](https://github.com/user-attachments/assets/a3b643dc-fb9c-44be-bdab-15b679822622)

## Criando a interface

```java
// Mudar o tema
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        
        // tela inicial
        JFrame tela = new JFrame("Exercício calculo de raizes");
        tela.setSize(500, 500);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);
```

### Criando os spinners

```java
// adicionando spinners
        JSpinner spinA = new JSpinner(new SpinnerNumberModel(0, 0, 99, 1));
        JSpinner spinB = new JSpinner(new SpinnerNumberModel(0, 0, 99, 1));
        JSpinner spinC = new JSpinner(new SpinnerNumberModel(0, 0, 99, 1));
        
        spinA.setSize(80, 60);
        spinB.setSize(80, 60);
        spinC.setSize(80, 60);

        spinA.setLocation(20, 32);
        spinB.setLocation(180, 32);
        spinC.setLocation(325, 32);

        tela.add(spinA);
        tela.add(spinB);
        tela.add(spinC);
        
        spinA.setFont(new Font("Calibri",Font.BOLD,40));
        spinB.setFont(new Font("Calibri",Font.BOLD,40));
        spinC.setFont(new Font("Calibri",Font.BOLD,40));
        
```

### Organizando o conteúdo em cada spinner

```java
// Organizando o conteúdo dentro de cada spinner
        JComponent editorA = spinA.getEditor();
        JFormattedTextField txtspinnerA = ((JSpinner.DefaultEditor) editorA).getTextField();
        txtspinnerA.setHorizontalAlignment(JFormattedTextField.CENTER);
        txtspinnerA.setMargin(new Insets(10,0,0,0));
        
        JComponent editorB= spinB.getEditor();
        JFormattedTextField txtspinnerB = ((JSpinner.DefaultEditor) editorB).getTextField();
        txtspinnerB.setHorizontalAlignment(JFormattedTextField.CENTER);
        txtspinnerB.setMargin(new Insets(10,0,0,0));
        
        JComponent editorC = spinC.getEditor();
        JFormattedTextField txtspinnerC = ((JSpinner.DefaultEditor) editorC).getTextField();
        txtspinnerC.setHorizontalAlignment(JFormattedTextField.CENTER);
        txtspinnerC.setMargin(new Insets(10,0,0,0));
```

### Adicionando texto entre os spinners

```java
// adicionando texto entre cada
        JLabel entre1 = new JLabel("<html>X<sup>2</sup>+</html>");
        entre1.setSize(80, 50);
        entre1.setLocation(110, 24);
        tela.add(entre1);
        entre1.setFont(new Font("Calibri",Font.BOLD,40));
        entre1.setForeground(Color.black);
        
        JLabel entre2 = new JLabel("<html>X +</html>");
        entre2.setSize(80, 50);
        entre2.setLocation(270, 32);
        tela.add(entre2);
        entre2.setFont(new Font("Calibri",Font.BOLD,40));
        entre2.setForeground(Color.black);
        
        JLabel entre3 = new JLabel("<html>= 0</html>");
        entre3.setSize(80, 50);
        entre3.setLocation(415, 32);
        tela.add(entre3);
        entre3.setFont(new Font("Calibri",Font.BOLD,40));
        entre3.setForeground(Color.black);
```

## Criando o local para mostrar o cálculo de delta

```java
// Mostrando o calculo de raizes abaixo:
        JLabel delta = new JLabel("<html>&Delta; = </html>");
        delta.setSize(80, 50);
        delta.setLocation(40, 135);
        delta.setFont(new Font("Calibri",Font.PLAIN,50));
        tela.add(delta);
        
        
        JLabel lbl_b = new JLabel("B");
        lbl_b.setSize(80, 50);
        lbl_b.setLocation(110, 145);
        lbl_b.setFont(new Font("Calibri",Font.PLAIN,50));
        tela.add(lbl_b);
        lbl_b.setForeground(Color.red);
        
        
        JLabel lbl_2 = new JLabel("<html><sup>2</sup></html>");
        lbl_2.setSize(80, 80);
        lbl_2.setLocation(160, 115);
        lbl_2.setFont(new Font("Calibri",Font.PLAIN,45));
        tela.add(lbl_2);
        
        JLabel lbl_4 = new JLabel("<html>- 4 .</html>");
        lbl_4.setSize(80, 50);
        lbl_4.setLocation(190, 135);
        lbl_4.setFont(new Font("Calibri",Font.PLAIN,45));
        tela.add(lbl_4);
        
        JLabel lbl_a = new JLabel("A");
        lbl_a.setSize(80, 50);
        lbl_a.setLocation(270, 145);
        lbl_a.setFont(new Font("Calibri",Font.PLAIN,50));
        tela.add(lbl_a);
        lbl_a.setForeground(Color.red);
        
        JLabel lbl_ponto = new JLabel("<html>.</html>");
        lbl_ponto.setSize(80, 50);
        lbl_ponto.setLocation(320, 135);
        lbl_ponto.setFont(new Font("Calibri",Font.PLAIN,45));
        tela.add(lbl_ponto);
        
        JLabel lbl_c = new JLabel("C");
        lbl_c.setSize(80, 50);
        lbl_c.setLocation(350, 145);
        lbl_c.setFont(new Font("Calibri",Font.PLAIN,50));
        tela.add(lbl_c);
        lbl_c.setForeground(Color.red);
```

### Criando interação entre as labels e os spinners

```java
// Adicionando ações
        spinA.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent ce) {
                
                lbl_b.setText(String.valueOf(spinA.getValue()));
                
            }
            
        
        });
        
        spinB.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent ce) {
                
                lbl_a.setText(String.valueOf(spinB.getValue()));
                
            }
            
        
        });
        
        spinC.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent ce) {
                
                lbl_c.setText(String.valueOf(spinC.getValue()));
                
            }
            
        
        });
```

### Adicionando um botão para calcular

```java
// Adicionando um botão para calcular
        JButton bot_calc = new JButton("<html>&Delta; Calcular</html>");
        bot_calc.setSize(100, 50);
        bot_calc.setLocation(200, 220);
        tela.add(bot_calc);
        
        // mostrando a tela
        tela.setVisible(true);
```

## Criando um painel para mostrar o resultado

```java
 // Criando um painel para mostrar os resultados
        JPanel pan_resultados = new JPanel();
        pan_resultados.setSize(450, 170);
        pan_resultados.setLocation(15, 280);
        tela.add(pan_resultados);
        pan_resultados.setLayout(null);
        
        // Adicionar componenentes no pan_resultados
        pan_resultados.setVisible(false);
        
        JLabel Desc1 = new JLabel("<html>&Delta; =");
        Desc1.setSize(100,50);
        Desc1.setLocation(20, 15);
        pan_resultados.add(Desc1);
        Desc1.setFont(new Font("Calibri",Font.PLAIN,30));
        
        JLabel Desc2 = new JLabel("Tipo = ");
        Desc2.setSize(150,50);
        Desc2.setLocation(20, 100);
        pan_resultados.add(Desc2);
        Desc2.setFont(new Font("Calibri",Font.PLAIN,30));
        
        
        JLabel frase1 = new JLabel("");
        frase1.setSize(300,50);
        frase1.setLocation(140, 20);
        pan_resultados.add(frase1);
        frase1.setFont(new Font("Calibri",Font.PLAIN,30));
        frase1.setForeground(Color.blue);
        
        JLabel frase2 = new JLabel("");
        frase2.setSize(300,50);
        frase2.setLocation(140, 105);
        pan_resultados.add(frase2);
        frase2.setFont(new Font("Calibri",Font.PLAIN,30));
        frase2.setForeground(Color.blue);
```

### Criando uma ação para o botão

```java
bot_calc.addActionListener(new ActionListener(){
            

            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                pan_resultados.setVisible(true);
                                
                int val_a = Integer.parseInt(String.valueOf(spinA.getValue()));
                int val_b = Integer.parseInt(String.valueOf(spinB.getValue()));
                int val_c = Integer.parseInt(String.valueOf(spinC.getValue()));
                
                double delta = (Math.pow(val_b, 2)) - (4 * val_a * val_c);
                int delta_int = (int) delta;
                
                if(delta>=0){
                    frase1.setText(String.format("%d",delta_int));
                    frase2.setText("Existem raizes reais");
                } else {
                    frase1.setText(String.format("%d",delta_int));
                    frase2.setText("Não existem raizes reais");
                }
                

            }
            });
    }
}
```

## Quer ver o código completo?

Acesse a página do meu `github` em: https://github.com/silviocastro006/Estudos-Java/tree/main/Interfaces_Complexas/src/Equacao2Grau
