package main;

import java.util.Scanner;

public class Atendente extends Pessoa {
	public String atendentes[][] = {{"Maria", "44504296801"}, {"Julia", "42123496501"}};
	public String solicitacao[][];
	boolean validacao = false;
	int opcaoParse = 0;
	Scanner input = new Scanner(System.in);
	
	
	public int menuAtendente(String opcao) {
		do {
			System.out.println("*********************************Menu - Atendente*********************************");
			System.out.println("1 - Registrar solicitação\n2 - Exibir informações\n0 - Sair");
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
	
	public void exibeInformacoes() {
		System.out.println("*********************************Atendentes*********************************");
		for (int linha = 0; linha < atendentes.length; linha++) {			
				System.out.printf("Nome: %s\n", atendentes[linha][0]);
				System.out.printf("CPF: %s\n", atendentes[linha][1]);			
		}		
	}
}
