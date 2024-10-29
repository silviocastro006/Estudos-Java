package Exercicios.Heranca_Pessoa;

public class Main {
    public static void main(String[] args) {
        
        // Instanciando os objetos
        Pessoa p1 = new Pessoa("Jorge", 23, 'M');
        Aluno p2 = new Aluno(1234543,"Informática","Matheus", 25, 'M');
        Professor p3 = new Professor("História",20123.34f,"Gerturdres", 43, 'F');
        Funcionario p4 = new Funcionario("Metalurgica",true,"Rodolfa",53,'F');
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
