package primeiros_comandos;

public class Conversao_Valores {

    public static void main(String[] args) {
        
        // ----------------------------- Exemplo 1 ---------------------
        int idade = 30;
        // String valor = idade ( não funciona pois não converte )
        // String valor = ( String ) idade ( não funciona pois não existe esse typecast )
        // String valor = (int) idade ( também não funciona )
        String valor = Integer.toString(idade);
        System.out.format("A variável idade é do tipo %d (Integer) e a valor é do tipo %s (String)%n", idade, valor);
        // ============== Briga de inteiro para String ===========
        //Os valores inteiros para String têm uma briga, então para podermos converter
        //vamos precisar usar métodos da classe para conversão de valores.
        String valor2 = "30";
        int idade2 = Integer.parseInt(valor2);
        System.out.println("Idade 2 = "+idade2);
        
        
        // ----------------------------- Exemplo 2 ---------------------
        
        // para conversão de valores podermos usar dois métodos diferentes para a mesma coisa
        
        int idade3 = 40;
        String valor3 = String.valueOf(idade3);
        String valor4 = Integer.toString(idade3);
        System.out.println("valor3 = "+valor3+" valo4 = "+valor4);
        
        
        
    }
}
