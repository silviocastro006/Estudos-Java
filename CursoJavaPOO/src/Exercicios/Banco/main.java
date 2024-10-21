package Exercicios.Banco;

public class main {
    public static void main(String[] args) {
        System.out.println("===== Criação das Contas =====");
        
        // Criando a primeira conta
        ContaBanco c1 = new ContaBanco();
        c1.abrirConta("CC", "Silvio");
        
        // Criando a segunda conta
        ContaBanco c2 = new ContaBanco();
        c2.abrirConta("CP", "Jeniffer");

        
        // Criando a terceira conta
        ContaBanco c3 = new ContaBanco();
        c3.abrirConta("CC", "Rodrigo");
        System.out.println("");
        
        // -----------------------
        System.out.println("===== Movimentação das Contas =====");

       
        // Movimentação o das contas
        c1.deposito(200);
        System.out.println("");
        c2.deposito(1000);
        System.out.println("");
        c3.deposito(500);
        System.out.println("");

        
        c1.sacar(20);
        System.out.println("");
        c2.sacar(300);
        System.out.println("");
        c3.sacar(400);
        System.out.println("");

        
        c1.pagarMensal();
        System.out.println("");
        c2.pagarMensal();
        System.out.println("");
        c3.pagarMensal();
        System.out.println("");
        
        // --------------------------
        
        // Verificação dos dados
        c1.dadosConta();
        c2.dadosConta();
        c3.dadosConta();
        
        // --------------------------
        
        // Retirada do saldo restante da conta
        c1.sacar(c1.getSaldo());
        c2.sacar(c2.getSaldo());
        c3.sacar(c3.getSaldo());
        
        
        // Finalização de contas
        c1.fecharConta();
        c2.fecharConta();
        c3.fecharConta();
    }
}
