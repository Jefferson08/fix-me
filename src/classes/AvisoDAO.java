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
public class AvisoDAO {
    
    public static ResultSet rsAvisos;
    public static Statement stAvisos; 
    
    public static void cadastraAviso(Aviso tmpAviso)throws Exception{
        
        
        
        try {
            ConexaoDAO.abreConexao();
            stAvisos = ConexaoDAO.conSistema.createStatement();
           
            String sqlCadastra = "insert into avisos(";
            sqlCadastra+= "assunto, descricao, data, hora) values (";
            sqlCadastra += "'" +tmpAviso.getAssunto()+"',";
            sqlCadastra += "'" +tmpAviso.getDescricao()+"',";
            sqlCadastra += "'" +tmpAviso.getData()+"',";
            sqlCadastra += "'" +tmpAviso.getHora()+"')";
            
            stAvisos.executeUpdate(sqlCadastra);
            
            JOptionPane.showMessageDialog(null, "Aviso registrado com sucesso!!!");
            
            ConexaoDAO.fechaConexao();
            
        } catch (Exception erro) {
            String msg = "Erro, verifique a sintaxe do comando insert, nome dos campos !!!" + erro.getMessage();
            JOptionPane.showInputDialog(null, msg);
        }
    }
    
    public static List<Aviso> listaAvisos()throws Exception{
        
        try {
            List<Aviso> vetorAvisos = new ArrayList<Aviso>();
            
            ConexaoDAO.abreConexao();
            stAvisos = ConexaoDAO.conSistema.createStatement();
            String sqlAvisos = "select * from avisos";
            
            rsAvisos = stAvisos.executeQuery(sqlAvisos);
            
            while(rsAvisos.next()){ //executa os códigos abaixo enquanto houver registros
                Aviso avisoAtual = new Aviso();
                
                avisoAtual.setId(rsAvisos.getInt("id_aviso"));
                avisoAtual.setAssunto(rsAvisos.getString("assunto"));
                avisoAtual.setDescricao(rsAvisos.getString("descricao"));
                avisoAtual.setData(rsAvisos.getString("data"));
                avisoAtual.setHora(rsAvisos.getString("hora"));
                
                vetorAvisos.add(avisoAtual); //Adicionando objeto Cliente no vetor
                
                
            }
            
            ConexaoDAO.fechaConexao();
            return vetorAvisos;
            
        } catch (Exception erro) {
            String msg = "Erro no carregamento da lista" + erro.getMessage();
            throw new Exception(msg);
        }
        
    }
    
    public static Aviso consultaAviso(String tmpBusca)throws Exception{
        
        try {
            ConexaoDAO.abreConexao();
            stAvisos = ConexaoDAO.conSistema.createStatement();
            
            String sqlBusca = "";
            
            
            sqlBusca = "select * from avisos where id_aviso = "+ tmpBusca +"";
              
            
            
            rsAvisos = stAvisos.executeQuery(sqlBusca);
            
            if(rsAvisos.next()){ // se houver registros
                Aviso tmpAviso =  new Aviso();
                
                tmpAviso.setId(rsAvisos.getInt("id_aviso"));
                tmpAviso.setAssunto(rsAvisos.getString("assunto"));
                tmpAviso.setDescricao(rsAvisos.getString("descricao"));
                tmpAviso.setData(rsAvisos.getString("data"));
                tmpAviso.setHora(rsAvisos.getString("hora"));
               
                
                return tmpAviso;
                
            
                
            }else{ //se não houver resultados
                return null;
            }
            
            
            
        } catch (Exception erro) {
            String msg = "Falha na consulta !!! Verifique a sintaxe, campos e tabelas da instrução SELECT. ERRO ORIGINAL: " +erro.getMessage();
            throw new Exception(msg);
        }
        
        
        
        
    }
    
    
}
