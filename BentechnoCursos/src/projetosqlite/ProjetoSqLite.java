package projetosqlite;

import conexoes.Conexao;
import java.sql.SQLException;

public class ProjetoSqLite {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        // instanciar a classe conexão e criar tabela pessoa física
        CriarTabelaPessoaFisica criartpf = new CriarTabelaPessoaFisica();
        Conexao conn = new Conexao();
        
        // instanciar a classe inserir pessoa física
        InserirPessoaFisica inserirpf = new InserirPessoaFisica();
        
        // instanciar a classe de busca
        BuscarDadosPessoaFisica buscardpf = new BuscarDadosPessoaFisica();
        
        
        // instanciar a classe que atualiza
        AtualizarDadosPessoaFisica atualizapf = new AtualizarDadosPessoaFisica();
        
        Boolean status = conn.conectar(); // conectar no banco
        //criartpf.criarTabela(); // cria a tabela pessoa física   
        //inserirpf.inserirDados("Carlos", "Silva", "123412341324");
        //inserirpf.inserirDados("Fabiano", "Schincariol", "2345634563");
        atualizapf.atualizarDados("Ricardo", 1);
        atualizapf.atualizarDados("Rodrigo Faro", 2);
        System.out.println(status);
        
        
        
        buscardpf.selecionarDados();
        status = conn.desconectar(); // desconectar
        
        System.out.println(status);
        
        
        
        
    }
}
