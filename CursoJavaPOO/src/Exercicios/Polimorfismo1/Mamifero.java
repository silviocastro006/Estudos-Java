package Exercicios.Polimorfismo1;

public class Mamifero extends Animal{
    // Atributos especiaisi do mamífero
    private String corPelo;
    
    // Métodos sobrescritos
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
    
    // Métodos getters e setters

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
}
