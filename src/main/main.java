package main;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {				
		Scanner input = new Scanner(System.in);		
		String option;
		int optionTest = 0;
		boolean validacao = false;
		do {			
			System.out.println("*********************************TECH ASSISTANCE*********************************");	
			System.out.println("Escolha uma op��o:\n");
			System.out.println("1 - Atendente\n2 - T�cnico (a)\n3 - Exibir informa��es\n0 - Sair");
			option = input.nextLine();
			
			try {
				optionTest = Integer.parseInt(option);
				
				if (optionTest >= 0 && optionTest < 4) {
					validacao = true;
					
					switch(optionTest) {
					case 1: //atendente
						break;
					case 2: //tecnico
						break;
					case 3: //infos
						break;
					case 0: // sair
						break;			
					}
				}
				else {
					System.out.println("\n******************************OP��O INV�LIDA************************************\n");
				}					
			}
			catch (Exception e) {
				System.out.println("\n******************************OP��O INV�LIDA************************************\n");
			}	
			
		} while(!validacao);
		
			
		
	}
}
	
