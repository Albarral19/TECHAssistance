package main;
import java.util.Scanner;
import java.util.ArrayList;

public class Servico {
	Scanner input = new Scanner(System.in);
	GServico servico = new GServico();
	public String descricao;
	public String valor;
	public String dataSolicitacao;
	public String dataInicio;
	public String dataConclusao;
	public String clienteServico;
	public String nomeCliente;
	public String tecnico;
	public String nomeAtendente;
	String[] materiais;
    
	
	public void registraServico() {
		Atendente atendente = new Atendente();
		System.out.println("*********************************Novo serviço*********************************");	
		atendente.exibeInformacoes();
		System.out.println("Atendente: ");
		nomeAtendente = input.nextLine();	
		System.out.println("Nome do cliente: ");
		nomeCliente = input.nextLine();	
		System.out.println("Data da solicitação: ");
		dataSolicitacao = input.nextLine();
		System.out.println("Data de início: ");
		dataInicio = input.nextLine();
		System.out.println("Descrição: ");
		descricao = input.nextLine();
		System.out.println("Técnico: ");
		tecnico = input.nextLine();
		
		servico.addServico(nomeAtendente, nomeCliente, dataSolicitacao, dataInicio, descricao, tecnico);				
		System.out.println("*********************************Registrado*********************************\n");		
	}	
}
