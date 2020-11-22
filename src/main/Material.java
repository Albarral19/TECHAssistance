package main;

public class Material {
	private int id;
	private String descricao;
	private double valor;
	
	public void setID(int id) {
		this.id = id;
	}
	public int getID() {
		return id;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValor() {
		return valor;
	}
}
