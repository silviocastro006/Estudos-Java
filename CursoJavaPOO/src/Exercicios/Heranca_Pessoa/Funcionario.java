package Exercicios.Heranca_Pessoa;

public class Funcionario extends Pessoa{
    
    // Atributos do funcionário
    private String setor;
    private boolean trabalhando;
    
    // Método construtor
    public Funcionario(String setor, boolean trabalhando, String nome, int idade, char sexo) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }
    
    // Método getter e setter
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    // Método especial
    public void mudarTrabalho(){
        this.setTrabalhando(!this.isTrabalhando());
        this.setSetor("Sem setor - Desempregado");
    }
    
}
