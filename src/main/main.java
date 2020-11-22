package main;
import java.util.Scanner;

public class main {	
	public static void menuPrincipal() {
		Scanner input = new Scanner(System.in);	
		Atendente atendente = new Atendente();
		GServico servico = new GServico();
		String option;
		int optionTest = 0;		
		
		while(true){	
			System.out.println("+--------------------------------------------+");	
			System.out.println("|---------------TECH ASSISTANCE--------------|");	
			System.out.println("+--------------------------------------------+");	
			
			System.out.println("\n*********************************TECH ASSISTANCE*********************************");	
			System.out.println("Escolha uma opção:\n");
			System.out.println("1 - Atendente\n2 - Técnico (a)\n3 - Exibir informações\n0 - Sair");
			option = input.nextLine();
			
			try {
				optionTest = Integer.parseInt(option);
				
				if (optionTest >= 0 && optionTest < 4) {					
					
					switch(optionTest) {
						case 1: //atendente
							atendente.processoAtendente();
							break;
						case 2: //tecnico
							break;
						case 3: //infos
							atendente.exibeInformacoes();
							servico.exibeInformacoes();
							break;
						case 0: // sair
							System.exit(0);
							break;			
					}
				}
				else {
					System.out.println("\n******************************OPÇÃO INVÁLIDA************************************\n");
				}					
			}
			catch (Exception e) {
				System.out.println("\n******************************OPÇÃO INVÁLIDA************************************\n");
			}			
		}
	}
	
	public void exibeInformacoes() {
		Atendente atendente = new Atendente();
		atendente.exibeInformacoes();
	}		
}
	
