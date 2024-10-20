package cursojavapoo.TesteClasses;


public class Main {
    public static void main(String[] args) {
        
        // Criando uma cadeira
        Cadeira cad1 = new Cadeira();
        
        // Alterando os valores por métodos especiais
        cad1.setTipo("madeira");
        cad1.setMarca("Tok Stok");
        cad1.SetValor(600.50);
        cad1.setDefeito(true);
        cad1.setEAN13(12346456);
        
        // Criando uma garrafa
        Garrafa g1 = new Garrafa("Branca",400,"Plastico",3,"Suco",0);
        Garrafa g2 = new Garrafa("Preta",500,"Aluminio",4,"Suco",1);
        Garrafa g3 = new Garrafa("Transparente",700,"Vidro",50,"Cerveja",3);

        // Realizar algumas vendas
        g1.venda(2);
        g2.venda(2);
        g3.venda(20);
        
        // Printando os status
        g1.status();
        g2.status();
        g3.status();
    }
}
