package projetosqlite;

import java.sql.Connection;
import org.sqlite.SQLiteException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class InserirPessoaFisica {
    
    // Método para conectar no banco de dados
    private Connection conectar() throws SQLException{
        
        // URL de conexão
        String url = "jdbc:sqlite:E:/Repositorios/Estudos-Java/BentechnoCursos/src/banco_de_dados/banco_sqlite.db";
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url);
        }
        catch(SQLiteException e){
            System.out.println(e.getMessage());
            
        }
        return conn;
    }
    
    
    public void inserirDados(String nome, String sobrenome, String CPF){
        
        String nomeMaiusculo = nome.toUpperCase();
        String sobrenomeMaiusculo = sobrenome.toUpperCase();
        
        String sql = "INSERT INTO tabela_pessoa_fisica(nome, sobrenome, cpf) VALUES(?, ?, ?)";
        
        try{
            Connection conn = this.conectar(); // método privado criado acima de conexão
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nomeMaiusculo);
            pstmt.setString(2, sobrenomeMaiusculo);
            pstmt.setString(3, CPF);
            pstmt.executeUpdate();
            System.out.println("Registros Inseridos!\n");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
