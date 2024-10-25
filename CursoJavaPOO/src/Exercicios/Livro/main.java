package Exercicios.Livro;

public class main {
    public static void main(String[] args) {
        
        // Instanciando os objetos
        Pessoa p[] = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        // criando as pessoas para o vetor de pessoas
        p[0] = new Pessoa("Pedro",22,'M');
        p[1] = new Pessoa("Maria", 25, 'F');
        
        // criando os livros para o vetor de livros
        l[0] = new Livro("O conto contado","Contarato",40,p[0]);
        l[1] = new Livro("Fábulas Fabulosas", "Fabiano", 50, p[1]);
        l[2] = new Livro("Grandes Grandezas", " Graciane", 2, p[0]);
        
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
        
    }
}
