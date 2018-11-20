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

public class ChamadoDAO {
    
    public static ResultSet rsChamados;
    public static Statement stChamados; 
    
    public static void cadastraChamado(Chamado tmpChamado, int tmpId)throws Exception{
        
        
        
        try {
            ConexaoDAO.abreConexao();
            stChamados = ConexaoDAO.conSistema.createStatement();
           
            String sqlCadastra = "insert into chamados(";
            sqlCadastra+= "id_usuario, categoria,"
                        + "subcategoria, setor, descricao, data, hora, status) values (";
            sqlCadastra += "'" +tmpId+"',";
            sqlCadastra += "'" +tmpChamado.getCategoria()+"',";
            sqlCadastra += "'" +tmpChamado.getSubCategoria()+"',";
            sqlCadastra += "'" +tmpChamado.getSetor()+"',";
            sqlCadastra += "'" +tmpChamado.getDescricao()+"',";
            sqlCadastra += "'" +tmpChamado.getData()+"',";
            sqlCadastra += "'" +tmpChamado.getHora()+"', 1)";
            
            stChamados.executeUpdate(sqlCadastra);
            
            JOptionPane.showMessageDialog(null, "Chamado registrado com sucesso!!!");
            
            ConexaoDAO.fechaConexao();
            
        } catch (Exception erro) {
            String msg = "Erro, verifique a sintaxe do comando insert, nome dos campos !!!" + erro.getMessage();
            JOptionPane.showInputDialog(null, msg);
        }
    }
    
    public static void alteraChamado(Chamado tmpChamado)throws Exception{
        
        
        
        try {
            ConexaoDAO.abreConexao();
            stChamados = ConexaoDAO.conSistema.createStatement();
           
            String sqlCadastra = "update chamados "
                    + "set status = '"+tmpChamado.getStatus()+"',"
                    + "urgencia = '"+tmpChamado.getUrgencia()+"',"
                    + "impacto = '"+tmpChamado.getImpacto()+"',"
                    + "prioridade = '"+tmpChamado.getPrioridade()+"'"
                    + "where id_chamado = '"+tmpChamado.getID()+"'";
                    
          
            
            stChamados.executeUpdate(sqlCadastra);
            
            JOptionPane.showMessageDialog(null, "Chamado alterado com sucesso!!!");
            
            ConexaoDAO.fechaConexao();
            
        } catch (Exception erro) {
            String msg = "Erro, verifique a sintaxe do comando insert, nome dos campos !!!" + erro.getMessage();
            JOptionPane.showInputDialog(null, msg);
        }
    }
    
    public static List<Chamado> listaChamadosConcluidos()throws Exception{
        
        try {
            List<Chamado> vetorChamados = new ArrayList<Chamado>();
            
            String sqlChamados = "";
            
            ConexaoDAO.abreConexao();
            stChamados = ConexaoDAO.conSistema.createStatement();
            
            sqlChamados = "select a.id_chamado, a.subcategoria, b.data_conclusao, b.hora, status.descricao, b.resolvido_por "
                    + "from chamados as a\n" 
                    + "inner join status, chamados_concluidos as b\n" 
                    + "where a.id_chamado = b.id_chamado and a.status = 3 and status.id_status = 3";
            
            rsChamados = stChamados.executeQuery(sqlChamados);
            
            while(rsChamados.next()){ //executa os códigos abaixo enquanto houver registros
                Chamado chamadoAtual = new Chamado();
                
                chamadoAtual.setID(rsChamados.getString("id_chamado"));
                chamadoAtual.setSubCategoria(rsChamados.getString("subcategoria"));
                chamadoAtual.setData(rsChamados.getString("data_conclusao"));
                chamadoAtual.setHora(rsChamados.getString("hora"));
                chamadoAtual.setStatus(rsChamados.getString("descricao"));
                chamadoAtual.setPrioridade(rsChamados.getString("resolvido_por"));
                
                vetorChamados.add(chamadoAtual); //Adicionando objeto Cliente no vetor
                
                
            }
            
            ConexaoDAO.fechaConexao();
            return vetorChamados;
            
        } catch (Exception erro) {
            String msg = "Erro no carregamento da lista" + erro.getMessage();
            throw new Exception(msg);
        }
        
    }
    
    public static List<Chamado> listaChamados(int tmpConsulta, int tmpId)throws Exception{
        
        try {
            List<Chamado> vetorChamados = new ArrayList<Chamado>();
            
            String sqlChamados = "";
            
            ConexaoDAO.abreConexao();
            stChamados = ConexaoDAO.conSistema.createStatement();
            
            if (tmpConsulta == 0) {
                
                //Lista todos os chamados
                
                sqlChamados = "select a.id_chamado, a.subcategoria, a.data, a.hora, a.urgencia, a.impacto, prioridade.prazo,"
                    + "status.descricao from chamados as a\n" 
                    + "inner join status, prioridade \n" 
                    + "where a.status = status.id_status and a.prioridade = prioridade.codigo";
                
            } else if (tmpConsulta == 1) {
                
                //Lista chamados do usuario
                
                sqlChamados = "select a.id_chamado, a.subcategoria, a.data, a.hora, a.urgencia, a.impacto, prioridade.prazo,"
                    + "status.descricao from chamados as a\n" 
                    + "inner join status, prioridade \n" 
                    + "where a.status = status.id_status and a.prioridade = prioridade.codigo and a.id_usuario = "+tmpId;
            }else if (tmpConsulta == 2) {
                
                //Lista os chamados concluídos
                
                sqlChamados = "select a.id_chamado, a.subcategoria, b.data, b.hora, b.resolvido_por "
                    + "from chamados as a\n" 
                    + "inner join chamados_concluidos as b\n" 
                    + "where a.id_chamado = b.id_chamado and a.status = 3";
                
                
            }
            
            
            
            rsChamados = stChamados.executeQuery(sqlChamados);
            
            while(rsChamados.next()){ //executa os códigos abaixo enquanto houver registros
                Chamado chamadoAtual = new Chamado();
                
                chamadoAtual.setID(rsChamados.getString("id_chamado"));
                chamadoAtual.setSubCategoria(rsChamados.getString("subcategoria"));
                chamadoAtual.setData(rsChamados.getString("data"));
                chamadoAtual.setHora(rsChamados.getString("hora"));
                chamadoAtual.setUrgencia(rsChamados.getString("urgencia"));
                chamadoAtual.setImpacto(rsChamados.getString("impacto"));
                chamadoAtual.setPrioridade(rsChamados.getString("prazo"));
                chamadoAtual.setStatus(rsChamados.getString("descricao"));
                
                vetorChamados.add(chamadoAtual); //Adicionando objeto Cliente no vetor
                
                
            }
            
            ConexaoDAO.fechaConexao();
            return vetorChamados;
            
        } catch (Exception erro) {
            String msg = "Erro no carregamento da lista" + erro.getMessage();
            throw new Exception(msg);
        }
        
    }
    
    public static List<Chamado> listaChamadosAdm()throws Exception{
        
        try {
            List<Chamado> vetorChamados = new ArrayList<Chamado>();
            
            String sqlChamados = "";
            
            ConexaoDAO.abreConexao();
            stChamados = ConexaoDAO.conSistema.createStatement();
            
                //Lista todos os chamados
                
                sqlChamados = "select a.id_chamado, a.categoria, a.data, a.hora, a.urgencia, a.impacto, prioridade.prazo,"
                    + "status.descricao from chamados as a\n" 
                    + "inner join status, prioridade \n" 
                    + "where a.status = status.id_status and a.prioridade = prioridade.codigo";
               
            
            rsChamados = stChamados.executeQuery(sqlChamados);
            
            while(rsChamados.next()){ //executa os códigos abaixo enquanto houver registros
                Chamado chamadoAtual = new Chamado();
                
                chamadoAtual.setID(rsChamados.getString("id_chamado"));
                chamadoAtual.setSubCategoria(rsChamados.getString("categoria"));
                chamadoAtual.setData(rsChamados.getString("data"));
                chamadoAtual.setHora(rsChamados.getString("hora"));
                chamadoAtual.setUrgencia(rsChamados.getString("urgencia"));
                chamadoAtual.setImpacto(rsChamados.getString("impacto"));
                chamadoAtual.setPrioridade(rsChamados.getString("prazo"));
                chamadoAtual.setStatus(rsChamados.getString("descricao"));
                
                vetorChamados.add(chamadoAtual); //Adicionando objeto Cliente no vetor
                
                
            }
            
            ConexaoDAO.fechaConexao();
            return vetorChamados;
            
        } catch (Exception erro) {
            String msg = "Erro no carregamento da lista" + erro.getMessage();
            throw new Exception(msg);
        }
        
    }
    
    public static Chamado consultaChamado(String tmpBusca)throws Exception{
        
        try {
            ConexaoDAO.abreConexao();
            stChamados = ConexaoDAO.conSistema.createStatement();
            
            String sqlBusca = "";
            
            
            sqlBusca = "select * from chamados where id_chamado = "+ tmpBusca +"";
              
            
            
            rsChamados = stChamados.executeQuery(sqlBusca);
            
            if(rsChamados.next()){ // se houver registros
                Chamado tmpChamado =  new Chamado();
                
                tmpChamado.setID(rsChamados.getString("id_chamado"));
                tmpChamado.setCategoria(rsChamados.getString("categoria"));
                tmpChamado.setSubCategoria(rsChamados.getString("subcategoria"));
                tmpChamado.setSetor(rsChamados.getString("setor"));
                tmpChamado.setDescricao(rsChamados.getString("descricao"));
                tmpChamado.setData(rsChamados.getString("data"));
                tmpChamado.setHora(rsChamados.getString("hora"));
                tmpChamado.setStatus(rsChamados.getString("status"));
                tmpChamado.setUrgencia(rsChamados.getString("urgencia"));
                tmpChamado.setImpacto(rsChamados.getString("impacto"));
                tmpChamado.setPrioridade(rsChamados.getString("prioridade"));
                
                
                ConexaoDAO.fechaConexao();
                
                return tmpChamado;
                
                
                
                
            }else{ //se não houver resultados
                return null;
            }
            
        } catch (Exception erro) {
            String msg = "Falha na consulta !!! Verifique a sintaxe, campos e tabelas da instrução SELECT. ERRO ORIGINAL: " +erro.getMessage();
            throw new Exception(msg);
        }
        
        
    }
    
    public static void concluiChamado(String dadosChamado[])throws Exception{
        
       
        try {
            ConexaoDAO.abreConexao();
            stChamados = ConexaoDAO.conSistema.createStatement();
           
            String sqlCadastra = "insert into chamados_concluidos(";
            sqlCadastra+= "id_chamado, data_conclusao, hora, resolvido_por, solucao) values (";
            sqlCadastra += "'" +dadosChamado[0]+"',";
            sqlCadastra += "'" +dadosChamado[1]+"',";
            sqlCadastra += "'" +dadosChamado[2]+"',";
            sqlCadastra += "'" +dadosChamado[3]+"',";
            sqlCadastra += "'" +dadosChamado[4]+"')";
            
            stChamados.executeUpdate(sqlCadastra);
            
            JOptionPane.showMessageDialog(null, "Chamado registrado com sucesso!!!");
            
            ConexaoDAO.fechaConexao();
            
        } catch (Exception erro) {
            String msg = "Erro, verifique a sintaxe do comando insert, nome dos campos !!!" + erro.getMessage();
            JOptionPane.showInputDialog(null, msg);
        }
    }
    
}
