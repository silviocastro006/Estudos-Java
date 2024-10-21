package TesteClasses;

public class Caneta {
    
    // Atributos de uma caneta
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    // Métodos de uma caneta
    void status(){
        System.out.println("========= Informações da Caneta =========");
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: "+this.cor);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: "+this.carga);
        System.out.println("Está tampada? "+this.tampada);
    }
    
    void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO! Não é possível rabiscar com caneta tampada.");
        } else{
            System.out.println("Rabiscando....");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
