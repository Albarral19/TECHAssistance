package main;
import java.util.Scanner;

public class Cliente extends Pessoa {
	Scanner input = new Scanner(System.in);	
	String[][] clientes = new String[50][5];	
	int id = 0;
	
	public String verificaCliente(String cpf) {
		boolean clienteCadastrado = false;
		String clienteNome = "";
		
		for(int i = 0; i < clientes[i][2].length(); i++) {
			if (cpf == clientes[i][2]) {
				clienteCadastrado = true;
				clienteNome = clientes[i][1];
			}
		}
		if (!clienteCadastrado) {
			cadastrarCliente();
			clienteNome = clientes[id][1];
		}
		return clienteNome;
	}	
	
	public void cadastrarCliente() {
		String endereco;
		System.out.println("*********************************Cadastrar cliente*********************************");
		System.out.println("Nome: ");
		this.nome = input.nextLine();
		System.out.println("CPF: ");
		this.cpf = input.nextLine();
		System.out.println("Telefone: ");
		this.telefone = input.nextLine();
		System.out.println("Endereço: ");
		endereco = input.nextLine();
		
		clientes[id][0] = Integer.toString(id++);
		clientes[id][1] = this.nome.toUpperCase();
		clientes[id][2] = this.cpf.replaceAll("[^0-9]", "");
		clientes[id][3] = this.telefone.replaceAll("[^0-9]", "");
		clientes[id][4] = endereco;
		id ++;
	}
}
