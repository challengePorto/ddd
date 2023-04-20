package br.com.fiap.serviço;

public class InfoVeiculoCliente {

	private String placaVeiculo, modelo, marca, renavam;
	private int ano;
	private double tara, lotacao, pesoBrutoTotal;
	
	public InfoVeiculoCliente(String placaVeiculo, String modelo, String marca, String renavam, int ano, double tara, double lotacao, double pesoBrutoTotal) {
		this.placaVeiculo = placaVeiculo;
		this.modelo = modelo;
		this.marca = marca;
		this.renavam = renavam;
		this.ano = ano;
		this.tara = tara;
		this.lotacao = lotacao;
		this.pesoBrutoTotal = pesoBrutoTotal;
	}
	
	public String retornarInfoVeiculoCliente() {
		return "PlacaVeiculo: " + placaVeiculo + " Modelo: " + modelo + " Marca: " + marca + " Renavam: " + renavam + " Ano: " + ano + 
				" Tara: " + tara + " Lotacao: " + lotacao + " PesoTotal: " + pesoBrutoTotal;
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

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getTara() {
		return tara;
	}

	public void setTara(double tara) {
		this.tara = tara;
	}

	public double getLotacao() {
		return lotacao;
	}

	public void setLotacao(double lotacao) {
		this.lotacao = lotacao;
	}

	public double getPesoBrutoTotal() {
		return pesoBrutoTotal;
	}

	public void setPesoBrutoTotal(double pesoBrutoTotal) {
		this.pesoBrutoTotal = pesoBrutoTotal;
	}
	
}
