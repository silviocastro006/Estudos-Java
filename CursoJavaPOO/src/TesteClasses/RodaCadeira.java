
package TesteClasses;

public class RodaCadeira {
    public static void main(String[] args) {
        // Contruindo o objeto
        Cadeira c1 = new Cadeira();
        
        // Alterando os valores por métodos especiais
        c1.setTipo("madeira");
        c1.setMarca("Tok Stok");
        c1.SetValor(600.50);
        c1.setDefeito(true);
        c1.setEAN13(12346456);
        
        // Chamando os dados da cadeira
        c1.status();
        
    }
   
}
