package classes;

/**
 *
 * @author 
 * 
 * Jefferson Carvalho
 * jeffersoncarvalho60@outlook.com
 * 
 */

public class Login {
    public int Id;
    public String login;
    public String senha;
    public int acesso;
    public Login loginUsuario;
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getAcesso() {
        return acesso;
    }

    public void setAcesso(int acesso) {
        this.acesso = acesso;
    }
}