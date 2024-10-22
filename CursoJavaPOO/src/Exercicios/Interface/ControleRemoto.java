package Exercicios.Interface;
public class ControleRemoto implements Controlador {
    
    // Criação de atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    // Criação do construtor da classe

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    // Criação dos métodos especiais

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    // Criação dos métodos abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("==== Abrindo Menu ====");
        System.out.println("Ligado: "+this.getLigado());
        System.out.print("volume: "+this.getVolume());
        for(int c = 0;c <= this.getVolume();c+=5){
            System.out.print("|");
        }
        System.out.println("");
        System.out.println("Tocando: "+this.getTocando());
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu....");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()+5);
        }else{
            System.out.println("Impossível aumentar o volume com a tv desligada");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()-5);
        }else{
            System.out.println("Impossível diminuir o volume com a tv desligada");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume()>0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume()==0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !this.getTocando()){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
    
    
}
