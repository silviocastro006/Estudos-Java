package cursojavapoo.TesteClasses;

public class RodaCaneta {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // Instanciando uma caneta
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.carga = 50;
        c1.cor = "Roxo";
        c1.ponta = 0.5f;
        c1.tampada = false;
        
        // Fazendo a caneta fazer algo
        c1.tampar();
        c1.status();
        c1.destampar();
        c1.rabiscar();
        
        // Instanciando outra caneta
        Caneta c2 = new Caneta();
        c2.modelo = "Maped";
        c2.carga = 100;
        c2.cor = "Azul";
        c2.ponta = 0.7f;
        c2.tampada = false;
        
        // Fazendo a caneta fazer algo
        c2.tampar();
        c2.status();
        c2.rabiscar();
        
    }
}
