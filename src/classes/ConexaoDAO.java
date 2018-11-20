package classes;

import java.sql.*;

/**
 *
 * @author 
 * 
 * Jefferson Carvalho
 * jeffersoncarvalho60@outlook.com
 * 
 */

public class ConexaoDAO {
    public static Connection conSistema;
    
    
    public static void abreConexao() throws Exception{
        try {
            Class.forName("com.mysql.jdbc.Driver"); //acessando biblioteca do mysql
            String conexao = "jdbc:mysql://localhost/sistema?autoReconnect=true&useSSL=false";
            conSistema = DriverManager.getConnection(conexao, "root", ""); //acessando base de dados
            System.out.println("Conexão estabelecida !!!");
            
        } catch (Exception erro) {
            throw new Exception("Falha na Conexão. Verifique as strings de abertura do BD\nERRO ORIGINAL:" + erro.getMessage());
        }
    }
    
    public static void fechaConexao() throws Exception{
        try {
            conSistema.close();
            System.out.println("Conexão encerrada !!!");
        } catch (Exception erro) {
            throw new Exception("Não existem conexões de Banco de Dados ativas");
        }
    }
}
