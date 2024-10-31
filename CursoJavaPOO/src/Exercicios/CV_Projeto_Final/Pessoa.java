package Exercicios.CV_Projeto_Final;

public abstract class Pessoa {
    
    // Atributos da Classe pessoa
    protected String nome;
    protected int idade;
    protected char sexo;
    protected int experiencia;
    
    // Método Construtor

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }
    
    
    // Métodos especiais
    protected void ganharExp(){
        this.experiencia+=1;
    }
    
    // Métodos getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
}
