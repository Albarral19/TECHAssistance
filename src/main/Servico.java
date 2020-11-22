package main;
import java.util.Scanner;
import java.util.ArrayList;

public class Servico {
	Scanner input = new Scanner(System.in);
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
    ArrayList<String> servico = new ArrayList<String>();	
	
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
		
		addServico();				
		System.out.println("*********************************Registrado*********************************\n");		
	}
	public void addServico() {
		servico.add(nomeAtendente + "|" + nomeCliente + "|" + dataSolicitacao + "|" + dataInicio + "|" + descricao + "|" + tecnico);
	}
	
	public void exibeInformacoes() {
		System.out.println("*********************************Serviços*********************************");
		int tamanho = servico.size();
		String[] splitServicos;
		for (int i = 0; i < tamanho; i++) {
			splitServicos = servico.get(i).split("|");
			System.out.printf("Serviço  -  %d\n", i + 1);
			System.out.printf("Atendente: %s\n", splitServicos[0]);
			System.out.printf("Cliente: %s\n", splitServicos[1]);
			System.out.printf("Data da solicitação: %s\n", splitServicos[2]);
			System.out.printf("Data do Início: %s\n", splitServicos[3]);
			System.out.printf("Descrição: %s\n", splitServicos[4]);
			System.out.printf("Técnico: %s\n", splitServicos[5]);
		}				
	}
}
