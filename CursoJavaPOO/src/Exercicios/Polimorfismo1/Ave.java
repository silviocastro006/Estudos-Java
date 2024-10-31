package Exercicios.Polimorfismo1;

public class Ave extends Animal{
    // Atributos especiais de ave
    private String CorPena;
    
    // Métodos sobrescritos
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
    
    public void fazerNinho(){
        System.out.println("Construiu um ninho.");
    }
    
    // Métodos getters e setters

    public String getCorPena() {
        return CorPena;
    }

    public void setCorPena(String CorPena) {
        this.CorPena = CorPena;
    }
    
    
}
