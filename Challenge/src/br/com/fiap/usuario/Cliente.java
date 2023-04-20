package br.com.fiap.usuario;

public class Cliente {
	
	private String nome, cpf, email;
	private int id;
	private Celular celular;
	private Login login;
	private EnderecoCliente enderecoCliente;

	public void chamarGuincho() {
	}
	
	public Cliente(String nome, String cpf, String email, int id, Celular celular, Login login, EnderecoCliente enderecoCliente) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.id = id;
		this.celular = celular;
		this.login = login;
		this.enderecoCliente = enderecoCliente;
	}
	
	public String retornarCliente() {
		return "NomeCliente: " + nome + " Cpf: " + cpf + " Email: " + email + 
				" Id: " + id + " Celular: " + celular + " Login: " + login +
				" Endereço do Cliente: " + enderecoCliente;
		}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Celular getCelular() {
		return celular;
	}

	public void setCelular(Celular celular) {
		this.celular = celular;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public EnderecoCliente getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(EnderecoCliente enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	
}
