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

public class UsuarioDAO {
    
    public static ResultSet rsUsuario;
    public static Statement stUsuario; 
    
    public static void cadastraUsuario(Usuario tmpUsuario)throws Exception{
        
        
        
        try {
            ConexaoDAO.abreConexao();
            stUsuario = ConexaoDAO.conSistema.createStatement();
           
            String sqlCadastra = "insert into usuarios(";
            sqlCadastra+= "nome, email, setor, usuario, senha) values (";
            sqlCadastra += "'" +tmpUsuario.getNome()+"',";
            sqlCadastra += "'" +tmpUsuario.getEmail()+"',";
            sqlCadastra += "'" +tmpUsuario.getSetor()+"',";
            sqlCadastra += "'" +tmpUsuario.getUsuario()+"',";
            sqlCadastra += "'" +tmpUsuario.getSenha()+"')";
            
            
            stUsuario.executeUpdate(sqlCadastra);
            
            JOptionPane.showMessageDialog(null, "Usuario registrado com sucesso!!!");
            
            ConexaoDAO.fechaConexao();
            
        } catch (Exception erro) {
            String msg = "Erro, verifique a sintaxe do comando insert, nome dos campos !!!" + erro.getMessage();
            JOptionPane.showInputDialog(null, msg);
        }
    }
    
}