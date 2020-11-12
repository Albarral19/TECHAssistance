package main;
import java.util.Scanner;

public class main {
	public static void asterisco() {
		 System.out.println("*********************************************************************************");
	}

	public static void main(String[] args) {		
		String option;
		Scanner input = new Scanner(System.in);
		
		while(true) {			
			System.out.println("*********************************TECH ASSISTANCE*********************************");	
			asterisco();
			System.out.println("****************Você é um(a) atendente ou um(a) técnico(a)?**********************");
			asterisco();
			System.out.println("1 - Atendente\n2 - Técnico (a)");
			option = input.nextLine();
			
			if (option == "1" || option == "2")
				break;
			else {
				asterisco();
				System.out.println("******************************OPÇÃO INVÁLIDA************************************");		
				asterisco();		
			}
		}
	}
}
	
