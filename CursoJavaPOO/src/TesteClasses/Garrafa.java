package TesteClasses;

public class Garrafa {
    // Atributos
    public String cor;
    public int tamanho;
    public String material;
    private int estoque;
    public String conteudo;
    public int venda;

    public Garrafa(String cor, int tamanho, String material, int estoque, String conteudo, int venda) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.material = material;
        this.estoque = estoque;
        this.conteudo = conteudo;
        this.venda = venda;
    }
    
    
    public void status(){
        System.out.println("===== Informações sobre a garrafa ===");
        System.out.format("Cor: %s%n", this.cor);
        System.out.format("Tamanho: ml %d%n", this.tamanho);
        System.out.format("Material: %s%n", this.material);
        System.out.format("Estoque: %d%n", this.estoque);
        System.out.format("Conteudo: %s%n", this.conteudo);
        System.out.format("Total de Vendas: %d%n", this.venda);
        
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    

    
    public void venda(int v){
        this.venda +=1;
        this.estoque -= v;
    }
    
    
    
}
