package conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    
    // Atributo de conexão com o banco de dados
    
    private Connection conexao;
    
    /**
     * Método que conecta com o banco de dados e caso não exista cria um
     * @return true - a conexão foi realizada
     * @throws java.lang.ClassNotFoundException
     */
    public boolean conectar() throws ClassNotFoundException{
        try
        {
            // Comando para abrir o banco com o SQLite
            Class.forName("org.sqlite.JDBC");
            
            // URL de conexão
            String url = "jdbc:sqlite:E:/Repositorios/Estudos-Java/BentechnoCursos/src/banco_de_dados/banco_sqlite.db";
            
            // Conectar com o banco
            this.conexao = DriverManager.getConnection(url);
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            return false; // caso não conecte, retorna false
        }
        System.out.println("Conectou com o Banco!\n");
        return true; // caso conecte, retorna verdadeiro
    }
    
    
    /**
     * Método para desconectar do banco de dados
     * 
     * @return true = caso desconecte
     */
    public boolean desconectar(){
        try{
            if(this.conexao.isClosed() == false){ // se a conexão estiver aberta
                this.conexao.close(); // ele fecha
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            return false; // caso não desconecte do banco, retorna falso
        }
        System.out.println("Desconectou com o banco!\n");
        return true; // caso desconecte com o banco
        
    }
}
