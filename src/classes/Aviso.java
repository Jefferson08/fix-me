package classes;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 
 * 
 * Jefferson Carvalho
 * jeffersoncarvalho60@outlook.com
 * 
 */

public class Aviso {
    
    public int id;
    public String assunto,descricao, data, hora;

    public Aviso() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    

    public String getDataHora(int tmpOpcao) {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        Date minhaDate = new Date();
        
        String novoFormato = "";
        
        
        if (tmpOpcao == 0) {
            novoFormato = formatoData.format(minhaDate);
        }else if(tmpOpcao == 1){
            novoFormato = formatoHora.format(minhaDate);
        }
        
        return novoFormato;
    }

}