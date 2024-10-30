package Exercicios.Heranca_Classes;

public class Aluno extends Pessoa{
    // Atributos do aluno
    private int matricula;
    private String curso;
    
    // Métodos especiais
    public void PagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno "+this.getNome());
    }
    
    // Métodos setters e getters

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
