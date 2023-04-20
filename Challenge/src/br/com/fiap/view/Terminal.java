package br.com.fiap.view;

import br.com.fiap.usuario.Celular;
import br.com.fiap.usuario.Login;
import br.com.fiap.usuario.EnderecoCliente;
import br.com.fiap.usuario.Cliente;
import br.com.fiap.serviço.EnderecoSinistro;
import br.com.fiap.serviço.Guincho;
import br.com.fiap.serviço.InfoVeiculoCliente;
import br.com.fiap.serviço.PrestadorServico;
import br.com.fiap.serviço.Sinistro;

public class Terminal {

	public static void main(String[] args) {
		
	Celular cel = new Celular(55, 11, 998887246);	
	String dadosCel = cel.retornarCelular();
	System.out.println(dadosCel);
	
	Login log = new Login("Usuario123", "Senha321");	
	String dadosLog = log.retornarLogin();
	System.out.println(dadosLog);
	
	EnderecoCliente endCli = new EnderecoCliente("Praça", "Apto 15", "12345678", 358);
	String dadosEndCli = endCli.retornarEndereco();
	System.out.println(dadosEndCli);
	
	Cliente cli = new Cliente("Paulo", "12345678910", "PauloCliente@gmail.com", 1234, cel, log, endCli);
	cli.setCelular(cel);
	cli.setEnderecoCliente(endCli);
	cli.setLogin(log);
    String dadosCli = cli.retornarCliente();
    System.out.println(dadosCli);
    System.out.println(cli.getCelular().getNumero());
    System.out.println(cli.getLogin().getUsuario());
    System.out.println(cli.getEnderecoCliente().getCep());
    
    EnderecoSinistro endSin = new EnderecoSinistro("Viadulto", 166, "Aclimação" , "12345678");
    String dadosEndSin = endSin.retornarEnderecoSinistro();
    System.out.println(dadosEndSin);
     
    Guincho gui = new Guincho("BRA2E23", "Scania", "Engetruck", 2005, 939.5); 
    String dadosGui = gui.retornarGuincho();
    System.out.println(dadosGui);
    
    InfoVeiculoCliente infoVC = new InfoVeiculoCliente("ARB3E22", "Fiat Palio", "FIAT", "123456789", 2016, 930.5, 1550.6, 1256.3 );
    String dadosInfoVC = infoVC.retornarInfoVeiculoCliente();
    System.out.println(dadosInfoVC);
    
    Sinistro sin = new Sinistro(24/05, "12:45", endSin, infoVC);
    sin.setEnderecoSinistro(endSin);
    sin.setInfoVeiculoCliente(infoVC);
    String dadosSin = sin.retornarSinistro();
    
    PrestadorServico pres = new PrestadorServico("Alexandre", "12345678910", "C", gui, sin);
    pres.setGuincho(gui);
    pres.setSinistro(sin);
    String dadosPres = pres.retornarPrestadorServico();
    System.out.println(dadosPres);
	}
}
