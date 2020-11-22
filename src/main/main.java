package main;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	List<Cliente> clientes = new ArrayList<>();
	List<Atendente> atendentes = new ArrayList<>();
	List<Tecnico> tecnicos = new ArrayList<>();	
	List<Servicos> servicos = new ArrayList<>();
	List<SolicitaServico> solicitaServicos = new ArrayList<>();
	
	int idSolicitacao = 0;

	public void exibirMenu() {
		System.out.println("+--------------------------------------------+");	
		System.out.println("|---------------TECH ASSISTANCE--------------|");	
		System.out.println("+--------------------------------------------+");
		System.out.println("1 - Atendente\n2 - T�cnico (a)\n3 - Cadastrar atendente\n4 - Cadastrar t�cnico\n5 - Exibir informa��es\n0 - Sair\n");
	}
	
	public void processa() {
		String opcao;
		Scanner input = new Scanner(System.in);
		Main main = new Main();
		
		cadastraAtendente();
		cadastraTecnico();
		
		do {
			exibirMenu();
			
			System.out.print("Digite sua escolha:");
			opcao = input.nextLine();
			
			switch(opcao) {
				case "1":
					processaAtendente();
					break;
				case "2":
					processaTecnico();
					break;
				case "3":
					cadastraAtendente();
					break;
				case "4":
					cadastraTecnico();
					break;
				case "5":
					processaExibeInfo();
					break;
				case "0":
					System.exit(0);
				default:
					System.out.println("+--------------------------------------------+");	
					System.out.println("|----------------OP��O INV�LIDA--------------|");	
					System.out.println("+--------------------------------------------+\n");
			}
		}while(opcao != "0"); 		
	}
	
	public void cadastraAtendente() {
		Atendente atendente = new Atendente();
		Scanner input = new Scanner(System.in);		
		String continuar;
		
		do {
			System.out.println("\n------------Cadastro de atendentes---------");
			System.out.print("Nome: ");
			atendente.setNome(input.nextLine());
			System.out.print("CPF: ");
			atendente.setCPF(input.nextLine());
			
			atendentes.add(atendente);
			
			do {
				System.out.print("\nDeseja cadastrar mais atendentes? (1 - Sim / 2 - N�o)");
				continuar = input.nextLine();
				
				if (!continuar.equals("1") && !continuar.equals("2"))
					System.out.println("Op��o inv�lida");
			}while(!continuar.equals("1") && !continuar.equals("2"));			
		}while(!continuar.equals("2"));		
	}
	
	public void cadastraTecnico() {
		Scanner input = new Scanner(System.in);
		Tecnico tecnico = new Tecnico();
		String continuar;
		
		do {
			System.out.println("\n---------Cadastro de t�cnicos---------");			
			System.out.print("Nome: ");
			tecnico.setNome(input.nextLine());			
			System.out.print("CPF: ");
			tecnico.setCPF(input.nextLine());			
			System.out.print("Telefone: ");
			tecnico.setTelefone(input.nextLine());
			
			tecnicos.add(tecnico);
			
			do {
				System.out.print("\nDeseja cadastrar mais t�cnicos? (1 - Sim / 2 - N�o)");
				continuar = input.nextLine();
				
				if (!continuar.equals("1") && !continuar.equals("2"))
					System.out.println("Op��o inv�lida");
			}while(!continuar.equals("1") && !continuar.equals("2"));		
		}while(!continuar.equals("2"));
	}
	
	public void processaAtendente() {
		Scanner input = new Scanner(System.in);
		SolicitaServico solicita = new SolicitaServico();
		String nome, cpf, opcao = null;
		
		do {
			idSolicitacao++;
			System.out.println("|----------------Solicita��o de servi�os--------------|");			
			System.out.println("Digite o CPF do Cliente: ");
			cpf = input.nextLine();
			
			if (buscaCliente(cpf) == "0")
				cadastraCliente();	
			
			solicita.setCliente(buscaCliente(cpf));
			
			solicita.setId(idSolicitacao);
			System.out.println("Data da solicita��o: ");
			solicita.setDataDeSolicitacao(input.nextLine());
			imprimirAtendente();
			System.out.println("Nome do atendente respons�vel: ");
			solicita.setAtendente(input.nextLine());
			imprimirTecnico();
			System.out.println("Nome do t�cnico respons�vel: ");
			solicita.setTecnico(input.nextLine());
			
			
			solicitaServicos.add(solicita);					
			
		}while(!opcao.equals("0"));
	}
	
	public String buscaCliente(String cpf) {
		String dados = "0";
		for (Cliente cliente: clientes) {
			if (cliente.cpf.equals(cpf))
				dados = cliente.nome;
				return dados;			
		}		
		return dados;		
	}
	
	public void cadastraCliente() {
		Cliente cliente = new Cliente();
		Scanner input = new Scanner (System.in);
		
		System.out.println("\n------------Cadastro de Cliente---------");
		System.out.print("Nome: ");
		cliente.setNome(input.nextLine());
		System.out.print("CPF: ");
		cliente.setCPF(input.nextLine());
		System.out.print("Telefone: ");
		cliente.setTelefone(input.nextLine());
		System.out.print("Endere�o: ");
		cliente.setEndereco(input.nextLine());
		
		clientes.add(cliente);
	}
	
	public void processaTecnico() {
		
	}
	
	public void processaExibeInfo() {
		String opcao;
		Main main = new Main();
		Scanner input = new Scanner(System.in);		
		do {
			System.out.println("+--------------------------------------------+");	
			System.out.println("|--------------Exibir informa��es------------|");	
			System.out.println("+--------------------------------------------+");
			System.out.println("1 - Atendente\n2 - T�cnico (a)\n3 - Cliente\n4 - Seri�os\n0 - Voltar\n");
			System.out.println("Digite sua escolha:");
			opcao = input.nextLine();
			
			switch(opcao) {
				case "1":
					imprimirAtendente();
					break;
				case "2":
					imprimirTecnico();
					break;
				case "3":
					imprimirCliente();
					break;
				case "4":
					break;
				case "0":
					System.out.println();
				default:
					System.out.println("+--------------------------------------------+");	
					System.out.println("|----------------OP��O INV�LIDA--------------|");	
					System.out.println("+--------------------------------------------+\n");
			}
		}while(!opcao.equals("0")); 
	}
	
	public void imprimirAtendente() {
		System.out.println("|----------------ATENDENTES--------------|");
		for(Atendente atendente : atendentes) {			
			System.out.println("\n Nome: " + atendente.getNome());
			System.out.println(" CPF: " + atendente.getCPF());
		}
		System.out.println("|--------------------------------------|\n");
	}
	public void imprimirTecnico() {
		System.out.println("|----------------TECNICOS--------------|");
		for(Tecnico tecnico : tecnicos) {			
			System.out.println("\n Nome: " + tecnico.getNome());
			System.out.println(" CPF: " + tecnico.getCPF());
			System.out.println(" Telefone: "+ tecnico.getTelefone());
		}
		System.out.println("|--------------------------------------|\n");
	}
	public void imprimirCliente() {
		System.out.println("|----------------CLIENTES--------------|");
		for(Cliente cliente : clientes) {			
			System.out.println("\n Nome: " + cliente.getNome());
			System.out.println("CPF: " + cliente.getCPF());
			System.out.println("Telefone: "+ cliente.getTelefone());
			System.out.println("Endere�o: " + cliente.getEndereco());			
		}
		System.out.println("|--------------------------------------|\n");
	}		
}
