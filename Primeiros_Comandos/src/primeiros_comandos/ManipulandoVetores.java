/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeiros_comandos;

/**
 *
 * @author acer
 */
public class ManipulandoVetores {
    public static void main(String[] args) {
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int tot[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        // For - normal
        System.out.println("-------- Usando o for tradicional ---------");
        for(int c=0; c<mes.length;c++){
            System.out.println("O mês de "+c+" tem "+tot[c]+" dias");
        }
        System.out.println("");
       System.out.println("-------- Usando o for each ---------");
        // For - Each
        for( String valor:mes){
            System.out.println(valor);
        }
    }
}
