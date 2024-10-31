package Exercicios.Polimorfismo1;

public class Aula12 {
    public static void main(String[] args) {
        // Instanciar os objetos
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        /*/ Manipulando o mamífero
        m.setPeso(35.4f);
        m.setCorPelo("Marrrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        // Testando outros métodos
        a.locomover();
        r.locomover();
        p.locomover();/*/
        
        // Testando as outras classes
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra co = new Cobra();
        Goldfish g = new Goldfish();
        Arara ar = new Arara();
        
        // Brincando com as classes
        c.locomover();
        c.usarBolsa();
        k.abanarRabo();
        co.emitirSom();
        g.locomover();
        g.emitirSom();
        ar.locomover();
        
    }
}
