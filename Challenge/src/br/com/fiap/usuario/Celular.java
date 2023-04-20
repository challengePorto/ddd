package br.com.fiap.usuario;

public class Celular {
	
	private int codigoPais, ddd, numero;
	
	public Celular(int codigoPais, int ddd, int numero) {
		this.codigoPais = codigoPais;
		this.ddd = ddd;
		this.numero = numero;
	}
	
	public String retornarCelular() {
		return "CodigoPais: " + codigoPais + " DDD: " + ddd + " NumeroCelular: " + numero;
	}
		
		
	public int getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(int codigoPais) {
		this.codigoPais = codigoPais;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	}