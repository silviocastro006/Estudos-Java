package primeiros_comandos;

import java.util.*;

public class Calculo_media {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("====== Recolha de informações ======");
        System.out.print("Digite o nome do aluno: ");String nome = teclado.nextLine();
        System.out.print("Digite a primeira nota do aluno: ");Float nota1 = teclado.nextFloat();
        System.out.print("Digite a segunda nota do aluno: ");Float nota2 = teclado.nextFloat();
        float media = (nota1+nota2)/2;
        System.out.println("====== Resultado ======");
        System.out.format("O(A) aluno(a) %s teve uma média de %.2f%n",nome, media);
    }
    
}
