package br.com.fiap.usuario;

public class EnderecoCliente {
	
	private String logradouro, complemento, cep;
	private int numero;
	
	public EnderecoCliente(String logradouro, String complemento, String cep, int numero)	{
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.cep = cep;
		this.numero = numero;
	}
	
	public String retornarEndereco() {
		return "LogradouroCliente: " + logradouro + " Complemento: " + complemento + 
				" Cep: " + cep + " NúmeroEndereçoCliente: " + numero;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(short numero) {
		this.numero = numero;
	}
	
}
