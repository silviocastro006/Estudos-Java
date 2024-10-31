package Exercicios.CV_Projeto_Final;

public class Gafanhoto extends Pessoa{
    
    // Atributos do Gafanhoto
    private String login;
    private int totAssistido;
    
    // Métodos especiais
    public void viuMaisUm(){
        this.totAssistido+=1;
    }
    
    // Método construtor
    public Gafanhoto(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
   
    // Métodos getters e setters

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
}
