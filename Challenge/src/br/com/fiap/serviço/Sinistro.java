package br.com.fiap.serviço;

public class Sinistro {
	
	private int dataOcorrido;
	String horarioOcorrido;
	private EnderecoSinistro enderecoSinistro;
	private InfoVeiculoCliente infoVeiculoCliente;
	
	public Sinistro(int dataOcorrido, String horarioOcorrido, EnderecoSinistro enderecoSinistro,
			InfoVeiculoCliente infoVeiculoCliente) {
		this.dataOcorrido = dataOcorrido;
		this.horarioOcorrido = horarioOcorrido;
		this.enderecoSinistro = enderecoSinistro;
		this.infoVeiculoCliente = infoVeiculoCliente;
	}
	public String retornarSinistro() {
		return "Data: " + dataOcorrido + " Horario: " + horarioOcorrido + " EnderecoSinistro: " + enderecoSinistro + " InfoVeiculo: " + infoVeiculoCliente;
		
	}
		
	public int getDataOcorrido() {
		return dataOcorrido;
	}
	public void setDataOcorrido(int dataOcorrido) {
		this.dataOcorrido = dataOcorrido;
	}
	public String getHorarioOcorrido() {
		return horarioOcorrido;
	}
	public void setHorarioOcorrido(String horarioOcorrido) {
		this.horarioOcorrido = horarioOcorrido;
	}
	public EnderecoSinistro getEnderecoSinistro() {
		return enderecoSinistro;
	}
	public void setEnderecoSinistro(EnderecoSinistro enderecoSinistro) {
		this.enderecoSinistro = enderecoSinistro;
	}
	public InfoVeiculoCliente getInfoVeiculoCliente() {
		return infoVeiculoCliente;
	}
	public void setInfoVeiculoCliente(InfoVeiculoCliente infoVeiculoCliente) {
		this.infoVeiculoCliente = infoVeiculoCliente;
	}
	
	
}