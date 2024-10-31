package Exercicios.Polimorfismo1;

public class Peixe extends Animal{
    // Atributos especiais da classe Peixe
    private String corEscama;
    
    // Métodos sobrescritos
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }
    
    // Métodos getters e setters

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
