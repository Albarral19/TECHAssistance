package main;
import java.util.Scanner;

public class Atendente extends Pessoa {
	public String atendentes[][] = {{"Maria", "44504296801"}, {"Julia", "42123496501"}};	
	Scanner input = new Scanner(System.in);
	main main = new main();
	Servico servico = new Servico();
	
	public int menuAtendente() {
		boolean validacao = false;
		int opcaoParse = 0;
		do {
			String opcao;
			System.out.println("\n*********************************Menu - Atendente*********************************");
			System.out.println("1 - Registrar solicitação\n2 - Exibir informações\n0 - Voltar");
			opcao = input.nextLine();
			
			try {
				opcaoParse = Integer.parseInt(opcao);
				
				if (opcaoParse >= 0 && opcaoParse < 3) {
					validacao = true;
				}				
				else {
					System.out.println("\n******************************OPÇÃO INVÁLIDA************************************\n");
				}				
			}
			catch(Exception e){
				System.out.println("\n******************************OPÇÃO INVÁLIDA************************************\n");
			}
			
		}while(!validacao);
		return opcaoParse;		
	}
	
	@SuppressWarnings("static-access")
	public void processoAtendente() {
		int option = menuAtendente();
		
		do {
			switch(option) {
			case 1: //registra
				servico.registraServico();
				break;
			case 2: //exibeInfo
				exibeInformacoes();				
				break;		
			}
			option = menuAtendente();
		}while(option != 0);
		
		main.menuPrincipal();
	}		
	
	public void exibeInformacoes() {
		System.out.println("*********************************Atendentes*********************************");
		for (int linha = 0; linha < atendentes.length; linha++) {			
				System.out.printf("Nome: %s\n", atendentes[linha][0]);
				System.out.printf("CPF: %s\n", atendentes[linha][1]);			
		}		
	}	
}
