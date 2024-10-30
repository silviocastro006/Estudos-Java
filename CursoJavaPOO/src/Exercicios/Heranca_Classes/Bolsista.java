package Exercicios.Heranca_Classes;

public class Bolsista extends Aluno{
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando a bolsa de "+this.getNome());
    }
    
    @Override
    public void PagarMensalidade(){
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
