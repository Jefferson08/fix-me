package classes;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 * 
 * Jefferson Carvalho
 * jeffersoncarvalho60@outlook.com
 * 
 */

public class LoginDAO {
    
    public static ResultSet rsUsuario;// objeto utilizado para armazenar uma consulta no banco de dados
    public static Statement stUsuario; //permite a execuçaõ de comandos sql no banco
    
    public static boolean verificaLogin(Login tmpLogin) throws Exception{
        
        boolean checaLogin = false;
        
        try {
            
            ConexaoDAO.abreConexao();
            stUsuario = ConexaoDAO.conSistema.createStatement();
            String sqlUsuario = "select * from login where usuario = ";
            sqlUsuario += "'"+tmpLogin.getLogin()+"' and senha = '"+tmpLogin.getSenha()+"'";
            System.out.println(tmpLogin.getLogin());
            System.out.println(tmpLogin.getSenha());
            
            rsUsuario = stUsuario.executeQuery(sqlUsuario);
            
            while(rsUsuario.next()){ //executa os códigos abaixo enquanto houver registros
                
               checaLogin = true;
                
            }
            
            System.out.println(checaLogin);
            
            ConexaoDAO.fechaConexao();
            return checaLogin;
            
        } catch (Exception erro) {
            String msg = "Erro no Login" + erro.getMessage();
            throw new Exception(msg);
        }
        
    }
    
    
    public static Login autenticaLogin(Login tmpLogin) throws Exception{
       
        try {
  
            ConexaoDAO.abreConexao();
            stUsuario = ConexaoDAO.conSistema.createStatement();
            String sqlUsuario = "select * from login where usuario = ";
            sqlUsuario += "'"+tmpLogin.getLogin()+"' and senha = '"+tmpLogin.getSenha()+"'";
            
            rsUsuario = stUsuario.executeQuery(sqlUsuario);
            
            while(rsUsuario.next()){ //executa os códigos abaixo enquanto houver registros
                
                tmpLogin.setId(rsUsuario.getInt("id"));
                tmpLogin.setLogin(rsUsuario.getString("usuario"));
                tmpLogin.setSenha(rsUsuario.getString("senha"));
                tmpLogin.setAcesso(rsUsuario.getInt("acesso"));
                      
            }
            
            ConexaoDAO.fechaConexao();
            return tmpLogin;
            
        } catch (Exception erro) {
            String msg = "Erro no Identificação do Usuário" + erro.getMessage();
            throw new Exception(msg);
        }
        
    }
   
    public static Usuario consultaUsuario(int tmpBusca)throws Exception{
        
        try {
            ConexaoDAO.abreConexao();
            stUsuario = ConexaoDAO.conSistema.createStatement();
            
            String sqlBusca = "";
            
            sqlBusca = "select * from usuarios where id_usuario = '"+ tmpBusca +"'";
             
            rsUsuario = stUsuario.executeQuery(sqlBusca);
            
            if(rsUsuario.next()){ // se houver registros
                Usuario tmpUsuario =  new Usuario();
                
                tmpUsuario.setId(rsUsuario.getInt("id_usuario"));
                tmpUsuario.setNome(rsUsuario.getString("nome"));
                tmpUsuario.setEmail(rsUsuario.getString("email"));
                tmpUsuario.setSetor(rsUsuario.getString("setor"));
                tmpUsuario.setUsuario(rsUsuario.getString("usuario"));
                tmpUsuario.setSenha(rsUsuario.getString("senha"));
                      
                return tmpUsuario;
                  
            }else{ //se não houver resultados
                return null;
            }         
        } catch (Exception erro) {
            String msg = "Falha na consulta usuario !!! Verifique a sintaxe, campos e tabelas da instrução SELECT. ERRO ORIGINAL: " +erro.getMessage();
            throw new Exception(msg);
        }    
    }
}

