package projetosqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.sqlite.SQLiteException;
import java.sql.ResultSet;

public class BuscarDadosPessoaFisica {
    
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
     * Método para buscar os dados da tabela pessoa física
     */
    public void selecionarDados(){
        
        String sql = "SELECT id_pessoa_fisica, nome, sobrenome, cpf FROM tabela_pessoa_fisica;";
        
        try{
            Connection conn = this.conectar();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            // loop para trazer os resultados da query
            while(rs.next()){
                System.out.println(rs.getInt("id_pessoa_fisica")+"|"
                                + rs.getString("nome")+ " "
                                + rs.getString("sobrenome")+ "|"
                                + rs.getString("cpf"));
            }
            
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

}