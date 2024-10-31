package Exercicios.Polimorfismo2;

public class Mamifero extends Animal{

    // Atributos do mamífero
    protected String corPelo;
    
    // Métodos sobrescritos
    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero!");
    }
    
    // Métodos getters e setters

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
}
