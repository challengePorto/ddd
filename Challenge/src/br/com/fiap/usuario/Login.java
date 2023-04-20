package br.com.fiap.usuario;

public class Login {
	
	private String usuario, senha;
	
	public Login(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}
	public String retornarLogin() {
		return "Usuário: " + usuario + " Senha: " + senha;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
