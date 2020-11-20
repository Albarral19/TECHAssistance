package main;
import java.util.Scanner;

public class Servico {
	Scanner input = new Scanner(System.in);
	int id = 0;
	public String descricao;
	public String valor;
	public String dataSolicitacao;
	public String dataInicio;
	public String dataConclusao;
	public String clienteServico;
	public String cpf;
	public String tecnico;
	public String atendente;
	String[] materiais;
	String[][] servico = new String[50][9];	
	
	public void registraServico() {
		Cliente cliente = new Cliente();
		
		System.out.println("*********************************Novo servi�o*********************************");
		
		System.out.println("CPF do cliente: ");
		cpf = input.nextLine();
		clienteServico = cliente.verificaCliente(cpf);		
		System.out.println("Data da solicita��o: ");
		dataSolicitacao = input.nextLine();
		System.out.println("Data de in�cio: ");
		dataInicio = input.nextLine();
		System.out.println("Descri��o: ");
		descricao = input.nextLine();
		System.out.println("T�cnico: ");
		tecnico = input.nextLine();
		
		servico[id][0] = Integer.toString(id++); 
		servico[id][1] = clienteServico;
		servico[id][2] = dataSolicitacao;
		servico[id][3] = dataInicio;
		servico[id][4] = descricao;
		servico[id][5] = tecnico;		
		id++;
		System.out.println("*********************************Registrado*********************************\n");		
	}	
}
