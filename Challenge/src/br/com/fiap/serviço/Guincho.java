package br.com.fiap.serviço;

public class Guincho {
	
	String placaVeiculo, modelo, marca;
	int ano;
	double peso;
		
	public Guincho(String placaVeiculo, String modelo, String marca, int ano, double peso) {
		super();
		this.placaVeiculo = placaVeiculo;
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.peso = peso;
	}
	
	public String retornarGuincho() {
		return "PlacaGuincho: " + placaVeiculo + " Modelo: " + modelo + " Marca: " + marca + " Ano: " + ano + " Peso: " + peso;
	}
	
	
	public String getPlacaVeiculo() {
		return placaVeiculo;
	}
	
	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
