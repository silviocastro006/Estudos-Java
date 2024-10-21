
package Exercicios.Banco;

import java.util.Random;

public class ContaBanco {
    
    // Criando os atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    // criando o método construtor

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    
    // criando getters e setters

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    // Criando métodos específicos
    
    public void gerarConta(){
        Random random = new Random();
        int[] lista = new int[6];
        String numero = "";
        
        for(int c = 0;c<6;c++){
            lista[c] = random.nextInt(9);
        }
        
        for(int c = 0;c<6;c++){
            numero += String.valueOf(lista[c]);
        }
        
        this.setNumConta(Integer.parseInt(numero));
    }
    
    public void abrirConta(String t, String d){
        if(this.isStatus()){
            System.out.format("Este objeto já possui uma %s aberta....%n", this.getTipo());
        }else{
            if(t !="CC" && t != "CP"){
                System.out.println("Tipo de conta inválida, digite apenas CC ou CP!");
            }else{
                this.setTipo(t);
                this.setDono(d);
                this.gerarConta();
                System.out.format("%s nº %d aberta!%n", this.getTipo(), this.getNumConta());
                this.setStatus(true);
                if(t.equals("CC")){
                    this.setSaldo(50);
                }else{
                    this.setSaldo(150);
                }  
            }
        }
    }
    
    public void fecharConta(){
        if(!this.isStatus()){
            System.out.println("Conta já se encontra fechada");
        }else{
            if(this.getSaldo()<0){
                System.out.println("Não é possível fechar uma conta com débito, favor verificar saldo.");
            }else if(this.getSaldo()>0){
                System.out.println("Não é possível fechar uma conta com saldo remanescente, favor sacar.");
            }else{
                this.setStatus(false);
                System.out.format("Conta nº %d fechada com sucesso.", this.getNumConta());
            }
        }
    }
    
    public void deposito(double d){
        if(!this.isStatus()){
            System.out.println("Não é possível depositar em conta fechada");
        }else{
            if(d<0){
                System.out.println("Não é possível depositar um valor negativo");
            }else{
                this.setSaldo(this.getSaldo()+d);
                System.out.println("Depósito de R$ "+d+" na conta nº "+this.getNumConta()+" realizado com sucesso.");
                System.out.println("Seu saldo atual é de R$"+this.getSaldo());
            }
        }
    }
    
    public void sacar(double s){
        if(!this.isStatus()){
            System.out.println("Não é possível sacar em conta fechada");
        }else if(this.getSaldo()<=0){
            System.out.println("Não é possível sacar, seu saldo atual é de R$ "+this.getSaldo());
        }else{
            this.setSaldo(this.getSaldo()-s);
            System.out.println("Saque de R$ "+s+" na conta nº "+this.getNumConta()+" realizado com sucesso");
            System.out.println("Seu saldo atual é de R$"+this.getSaldo());
        }
    }
    
    public void pagarMensal(){
        if(!this.isStatus()){
            System.out.println("Não é possível pagar mensalidade com conta fechada");
        }else if(this.getSaldo()<=0){
            System.out.println("Com o saldo atual de R$ "+this.getSaldo()+" na conta nº "+this.getNumConta()+" não é possível pagar a mensalidade");
        }else if(this.getTipo().equals("CC")){
            this.setSaldo(this.getSaldo()-12);
            System.out.println("Mensalidade de R$12,00 descontada da sua conta nº "+this.getNumConta());
            System.out.println("O seu saldo atual é de R$ "+this.getSaldo());
        }else{
            this.setSaldo(this.getSaldo()-20);
            System.out.println("Mensalidade de R$20,00 descontada da sua conta nº "+this.getNumConta());
            System.out.println("O seu saldo atual é de R$ "+this.getSaldo());
        }
    }
    
    public void dadosConta(){
        System.out.println("======= Dados Conta =====");
        System.out.format("Tipo de Conta: %s%n",this.getTipo());
        System.out.format("Dono da Conta: %s%n", this.getDono());
        System.out.format("Numero da Conta: %d%n", this.getNumConta());
        System.out.format("Saldo da Conta: %.2f%n", this.getSaldo());
        System.out.println("");

    }
    
}
