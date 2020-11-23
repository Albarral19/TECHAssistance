package main;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	List<Cliente> clientes = new ArrayList<>();
	List<Atendente> atendentes = new ArrayList<>();
	List<Tecnico> tecnicos = new ArrayList<>();	
	List<Servico> servicos = new ArrayList<>();
	List<SolicitaServico> solicitaServicos = new ArrayList<>();
	List<Material> materiais = new ArrayList<>();
	
	int idSolicitacao = 0;
	int idMaterial = 0;

	public void exibirMenu() {
		System.out.println("+--------------------------------------------+");	
		System.out.println("|---------------TECH ASSISTANCE--------------|");	
		System.out.println("+--------------------------------------------+");
		System.out.println("1 - Atendente\n2 - T�cnico (a)\n3 - Cadastrar atendente\n4 - Cadastrar t�cnico\n5 - Exibir informa��es\n0 - Sair\n");
	}
	public void processa() {
		String opcao;
		Scanner input = new Scanner(System.in);
		
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
					break;
			}
		}while(opcao != "0"); 		
	}
	public void processaExibeInfo() {
		String opcao;
		Scanner input = new Scanner(System.in);		
		do {
			System.out.println("+--------------------------------------------+");	
			System.out.println("|--------------Exibir informa��es------------|");	
			System.out.println("+--------------------------------------------+");
			System.out.println("1 - Atendente\n2 - T�cnico (a)\n3 - Cliente\n4 - Servi�os\n0 - Voltar\n");
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
					System.out.println("|---------------SERVI�OS-------------|");
					imprimirSolicitacoes();
					imprimirServicos();
					break;
				case "0":
					System.out.println();
				default:
					break;
			}
		}while(!opcao.equals("0")); 
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
	public void processaAtendente() {
		Scanner input = new Scanner(System.in);
		SolicitaServico solicita = new SolicitaServico();
		String cpf, opcao = null;
		
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
			System.out.println("Breve descri��o do problema: ");
			solicita.setDescricaoCliente(input.nextLine());		
			
			solicitaServicos.add(solicita);
			
			do {
				System.out.print("\nDeseja cadastrar mais solicita��es? (1 - Sim / 2 - N�o)");
				opcao = input.nextLine();
				
				if (!opcao.equals("1") && !opcao.equals("2"))
					System.out.println("Op��o inv�lida");
			}while(!opcao.equals("1") && !opcao.equals("2"));
			
		}while(!opcao.equals("2"));
	}
	public void imprimirAtendente() {
		System.out.println("|---------------ATENDENTES-------------|");
		for(Atendente atendente : atendentes) {			
			System.out.println("\n Nome: " + atendente.getNome());
			System.out.println(" CPF: " + atendente.getCPF());
		}
		System.out.println("|--------------------------------------|\n");
	}
		
	public void cadastraTecnico() {
		Scanner input = new Scanner(System.in);
		Tecnico tecnico = new Tecnico();
		String continuar;
		
		do {
			System.out.println("\n-----------Cadastro de t�cnicos-----------");			
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
	public void processaTecnico() {
		Servico servico = new Servico();
		Scanner input = new Scanner(System.in);
		String descricao, descricaoC = "", continuar, continuar2;
		int index;
		double valor = -1;
		
		if (solicitaServicos.size() > 0) {
			do {
				System.out.println("\n-----------Realiza��o do servi�o-----------");	
				imprimirSolicitacoes();
				
				try {
					System.out.println("Digite o ID da solicita��o que deseja realizar: ");
					index = Integer.parseInt(input.nextLine());
					index = buscaIndex(index);
				}
				catch(Exception e) {
					index = -1;
				}				
				
				if (index >= 0) {
					System.out.println("Data de in�cio do servi�o: ");
					servico.setDataDeInicio(input.nextLine());
					
					System.out.println("Data de conclus�o do servi�o: ");
					servico.setDataDeConclusao(input.nextLine());
					
					System.out.println("Descri��o do problema: ");
					servico.setDescricaoTecnica(input.nextLine());
					
					do {
						System.out.println("Digite UM dos materiais utilizados: ");
						descricao = input.nextLine();
						if (verificaMateriais(descricao) > 0) {
							descricaoC += " | " + descricao;
						}
						else {
							cadastrarMaterial();
							descricaoC += " | " + descricao;
						}
						
						do {
							System.out.print("\nDeseja cadastrar mais materiais? (1 - Sim / 2 - N�o)");
							continuar = input.nextLine();
							
							if (!continuar.equals("1") && !continuar.equals("2"))
								System.out.println("Op��o inv�lida");
							
						}while(!continuar.equals("1") && !continuar.equals("2"));							
						
					}while(!continuar.equals("2"));
					
					servico.setMateriais(descricaoC);
					do {
						try {
							System.out.println("Valor do servi�o: ");
							valor = Double.parseDouble(input.nextLine());
							servico.setValor(valor);
						}
						catch(Exception e) {
							valor = -1;
							System.out.println("Insira um valor v�lido!\n");		
						}					
					}while(valor < 0);
					
					servico.setId(solicitaServicos.get(index).getId());
					servico.setDataDeSolicitacao(solicitaServicos.get(index).getDataDeSolicitacao());
					servico.setCliente(solicitaServicos.get(index).getCliente());
					servico.setAtendente(solicitaServicos.get(index).getAtendente());
					servico.setTecnico(solicitaServicos.get(index).getTecnico());
					servico.setDescricaoCliente(solicitaServicos.get(index).getDescricaoCliente());
					solicitaServicos.remove(index);					
					servicos.add(servico);
				}
				else {
					System.out.println("ID Inv�lido");
				}
				do {
					System.out.print("\nDeseja realizar mais servi�os? (1 - Sim / 2 - N�o)");
					continuar2 = input.nextLine();
					
					if (!continuar2.equals("1") && !continuar2.equals("2"))
						System.out.println("Op��o inv�lida");
					
				}while(!continuar2.equals("1") && !continuar2.equals("2"));	
				
			}while(!continuar2.equals("2"));
		}
		else {
			System.out.println("N�o h� solicita��es para serem feitas!");
		}		
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
		System.out.println("----------------------------------------\n");
		
		clientes.add(cliente);
	}
	public void imprimirCliente() {
		System.out.println("|----------------CLIENTES--------------|");
		for(Cliente cliente : clientes) {			
			System.out.println("\n Nome: " + cliente.getNome());
			System.out.println(" CPF: " + cliente.getCPF());
			System.out.println(" Telefone: "+ cliente.getTelefone());
			System.out.println(" Endere�o: " + cliente.getEndereco());			
		}
		System.out.println("|--------------------------------------|\n");
	}		
		
	public void imprimirSolicitacoes() {
		for (SolicitaServico solicita: solicitaServicos) {
			System.out.println("\nID: " + solicita.getId());
			System.out.println("Cliente: " + solicita.getCliente());
			System.out.println("Atendente: " + solicita.getAtendente());
			System.out.println("T�cnico: " + solicita.getTecnico());
			System.out.println("Data da solicita��o: " + solicita.getDataDeSolicitacao());
			System.out.println("Descri��o breve: " + solicita.getDescricaoCliente());
		}
		System.out.println("|------------------------------------|");
	}
	public void imprimirServicos() {
		for (Servico servico : servicos) {
			System.out.println("\nID: " + servico.getId());
			System.out.println("Cliente: " + servico.getCliente());
			System.out.println("Atendente: " + servico.getAtendente());
			System.out.println("T�cnico: " + servico.getTecnico());
			System.out.println("Data da solicita��o: " + servico.getDataDeSolicitacao());
			System.out.println("Descri��o da solicita��o: " + servico.getDescricaoCliente());
			System.out.println("Data de in�cio: " + servico.getDataDeInicio());
			System.out.println("Data de conclus�o: " + servico.getDataDeConclusao());
			System.out.println("Materiais utilizados: " + servico.getMateriais());
			System.out.println("Descri��o do servi�o: " + servico.getDescricaoTecnica());
			System.out.println("Valor do servi�o: " + servico.getValor());
		}
		System.out.println("|------------------------------------|\n");
	}
	
	public int buscaIndex(int id) {
		for (SolicitaServico solicita: solicitaServicos) {
			if(solicita.getId() == id) {
				return solicitaServicos.indexOf(solicita);
			}				
		}
		return -1;
	}

	public void imprimirMateriais() {
		for (Material material: materiais) {
			System.out.println("\nID: " + material.getID());
			System.out.println("Descri��o: " + material.getDescricao());
			System.out.println("Valor unit�rio: " + material.getValor());
		}
		System.out.println("|------------------------------------|");
	}
	public void cadastrarMaterial() {
		Material material = new Material();
		Scanner input = new Scanner (System.in);
		String opcao;
		
		idMaterial ++;
		System.out.println("|----------------Cadastrar Material--------------|");
		material.setID(idMaterial);
		System.out.println("Descri��o do material: ");
		material.setDescricao(input.nextLine());
		System.out.println("Valor do material: ");
		material.setValor(input.nextDouble());
		
		materiais.add(material);		
	}
	public int verificaMateriais(String descricao) {
		for (Material material: materiais) {
			if (material.getDescricao() == descricao) {
				return 1;
			}
		}
		return -1;
	}
}