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
			System.out.println("****************Voc� � um(a) atendente ou um(a) t�cnico(a)?**********************");
			asterisco();
			System.out.println("1 - Atendente\n2 - T�cnico (a)");
			option = input.nextLine();
			
			if (option == "1" || option == "2")
				break;
			else {
				asterisco();
				System.out.println("******************************OP��O INV�LIDA************************************");		
				asterisco();		
			}
		}
	}
}
	
