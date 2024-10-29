package Exercicios.Heranca_Pessoa;

public class Professor extends Pessoa{
    
    // Atributos do professor
    private String especialidade;
    private float salario;
    
    // Método construtor
    public Professor(String especialidade, float salario, String nome, int idade, char sexo) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }
    
    // Métodos Getters e Setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    // Mètodos Especiais
    public void ReceberAum(float val){
        this.setSalario(this.getSalario()+val);
    }
}
