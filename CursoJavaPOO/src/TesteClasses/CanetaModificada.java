package TesteClasses;

public class CanetaModificada {
    
    // Atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    // Métodos
    
    // Métodos de uma caneta
    public void status(){
        System.out.println("========= Informações da Caneta =========");
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: "+this.cor);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: "+this.carga);
        System.out.println("Está tampada? "+this.tampada);
    }
    
    private void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO! Não é possível rabiscar com caneta tampada.");
        } else{
            System.out.println("Rabiscando....");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
}
