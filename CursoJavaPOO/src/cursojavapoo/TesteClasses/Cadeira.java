package cursojavapoo.TesteClasses;

public class Cadeira {
    // Atributos de uma cadeira
    public String Tipo;
    public String marca;
    protected double valor;
    private int ean13;
    protected boolean defeito;
    
    
    // Métodos de uma cadeira
    public void status(){
        System.out.format("Tipo: %s%n",this.Tipo);
        System.out.format("Marca: %s%n",this.marca);
        System.out.format("Valor: R$%.2f%n",this.valor);
        System.out.format("EAN13: %d%n",this.ean13);
        System.out.format("Defeito?: %b%n",this.defeito);
    }
    
    public void setTipo(String t){
        this.Tipo = t;
    }
    
    public String getTipo(){
        return this.Tipo;
    }
    
    public void setMarca(String m){
        this.marca = m;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void SetValor(double v){
        this.valor=v;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public void setEAN13(int e){
        this.ean13 = e;
    }
    
    public int getEAN13(){
        return this.ean13;
    }
    
    public void setDefeito(boolean d){
        this.defeito = d;
    }
    
    public boolean getDefeito(){
        return this.defeito;
    }
}
