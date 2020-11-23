package main;

public class Tecnico extends Pessoa{
	private String telefone;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	public String getCPF() {
		return cpf;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTelefone() {
		return telefone;
	}
}