package Exercicios.Livro;

public class Livro implements Publicacao{
    // Atributos da classe
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    // Classe construtora

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.leitor = leitor;
        this.aberto = false;
    }
    
    
    // Métodos getters e setters
    private String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    private int getTotPaginas() {
        return totPaginas;
    }

    private void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    private int getPagAtual() {
        return pagAtual;
    }

    private void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    private boolean isAberto() {
        return aberto;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    private Pessoa getLeitor() {
        return leitor;
    }

    private void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    
    // Métodos especiais
    

    public String detalhes() {
        return "=============== detalhes ======================"+
                "\nLivro{" + "titulo=" + titulo + ",\nautor="
                + autor + ", totPaginas=" + totPaginas 
                + ",\npagAtual=" + pagAtual + ", aberto=" 
                + aberto + ",\nleitor=" + this.leitor.getNome()
                + "\nidade = "+this.leitor.getIdade()
                + "\nsexo = "+this.leitor.getSexo()
                +'}';
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int pag) {
        if(pag>this.getTotPaginas()){
            this.setPagAtual(0);
        }else{
            this.setPagAtual(pag);   
        }
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual()+1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual()-1);
    }
    
    
    
}
