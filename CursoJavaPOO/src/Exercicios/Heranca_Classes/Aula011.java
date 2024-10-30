package Exercicios.Heranca_Classes;

public class Aula011 {
    public static void main(String[] args) {
        /*Visitante v1 = new Visitante();
        v1.setNome("Richard Axe");
        v1.setIdade(27);
        v1.setSexo("M");
        System.out.println(v1.toString());
        }*/
        
        /*Aluno a1 = new Aluno();
        a1.setNome("Rodrigo");
        a1.setIdade(22);
        a1.setSexo("M");
        a1.setMatricula(123456);
        a1.setCurso("Informática");
        a1.PagarMensalidade();*/
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(123456);
        b1.setNome("Faro");
        b1.setBolsa(99999);
        b1.setSexo("M");
        b1.PagarMensalidade();
        
    }    

}
