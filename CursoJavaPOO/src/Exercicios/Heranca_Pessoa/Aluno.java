package Exercicios.Heranca_Pessoa;

public class Aluno extends Pessoa{
    
    // Atributos da classe
    private int matr;
    private String curso;
    
    // Método construtor
    public Aluno(int matr, String curso, String nome, int idade, char sexo) {
        super(nome, idade, sexo);
        this.matr = matr;
        this.curso = curso;
    }
    
    // Métodos Getters e Setter

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    // Mètodos Especiais
    public void cancelarMatr(){
        System.out.println("Matrícula sera cancelada...");
        this.setMatr(0);
        this.setCurso("Cancelado");
    }
    

    
}
