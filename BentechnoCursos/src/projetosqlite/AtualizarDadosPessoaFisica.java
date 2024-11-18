package projetosqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.sqlite.SQLiteException;
import java.sql.PreparedStatement;

public class AtualizarDadosPessoaFisica {
     
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
    
    /**
     * Método para atualizar dados
     */
    public void atualizarDados(String nomenovo, int id){
        
       String sql = "UPDATE tabela_pessoa_fisica SET nome = ? WHERE id_pessoa_fisica IS ?;";
       
       try{
           Connection conn = this.conectar();
           PreparedStatement pstmt = conn.prepareStatement(sql);
           pstmt.setString(1, nomenovo);
           pstmt.setInt(2, id);
           pstmt.executeUpdate();
           System.out.println("Dados atualizados!\n");
       }
       catch(SQLException e){
           System.out.println(e.getMessage());
       }
        
    }
}
