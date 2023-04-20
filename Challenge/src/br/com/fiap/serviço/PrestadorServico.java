package br.com.fiap.serviço;

public class PrestadorServico {
	
	private String nome, cpf, categoriaHabilitacao;
	private Guincho guincho;
	private Sinistro sinistro;
	
	public PrestadorServico(String nome, String cpf, String categoriaHabilitacao, Guincho guincho, Sinistro sinistro) {;
		this.nome = nome;
		this.cpf = cpf;
		this.categoriaHabilitacao = categoriaHabilitacao;
		this.guincho = guincho;
		this.sinistro = sinistro;
	}
	
	public String retornarPrestadorServico() {
		return "NomePrestador: " + nome + " CpfPrestador: " + cpf + " Habilitacao: " + " Guincho: " + guincho + " Sinistro: " + sinistro;
	}

	public void atenderChamado() {
		
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

	public String getCategoriaHabilitacao() {
		return categoriaHabilitacao;
	}

	public void setCategoriaHabilitacao(String categoriaHabilitacao) {
		this.categoriaHabilitacao = categoriaHabilitacao;
	}

	public Guincho getGuincho() {
		return guincho;
	}

	public void setGuincho(Guincho guincho) {
		this.guincho = guincho;
	}

	public Sinistro getSinistro() {
		return sinistro;
	}

	public void setSinistro(Sinistro sinistro) {
		this.sinistro = sinistro;
	}
	
}
