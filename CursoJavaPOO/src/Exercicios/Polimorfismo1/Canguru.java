package Exercicios.Polimorfismo1;

public class Canguru extends Mamifero{
    // Métodos sobrescritos
    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
    
    public void usarBolsa(){
        System.out.println("Usando bolsa...");
    }
}
