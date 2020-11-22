package main;

public class Cliente extends Pessoa{
	private String telefone;
	private String endereco;
	
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
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEndereco() {
		return endereco;
	}
	
}
