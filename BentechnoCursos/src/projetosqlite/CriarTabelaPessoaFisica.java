package projetosqlite;

import org.sqlite.SQLiteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoaFisica {
    
    public void criarTabela() throws SQLException{
        
        // url de conexão
        String url = "jdbc:sqlite:E:/Repositorios/Estudos-Java/BentechnoCursos/src/banco_de_dados/banco_sqlite.db";
        
        // Sql Statement para criar uma nova tabela
        String sql = "CREATE TABLE IF NOT EXISTS tabela_pessoa_fisica(\n"
                + "id_pessoa_fisica integer PRIMARY KEY,\n" // um campo de id para a pessoa física
                + "nome text NOT NULL,\n"
                + "sobrenome text NOT NULL,\n"
                + "CPF text NOT NULL\n"
                + ");";
        
        try{
            Connection conn = DriverManager.getConnection(url);
            
            // intanciar o statement e criar um
            Statement stmt = conn.createStatement();
            
            // criar a nova tabeça
            stmt.execute(sql);
        }
        catch(SQLiteException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Tabela Criada!\n");
    }
}
