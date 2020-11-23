package main;

public class SolicitaServico {
	private int id;
	private String dataDeSolicitacao;
	private String cliente;
	private String atendente;
	private String tecnico;
	private String descricaoCliente;	
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setDataDeSolicitacao(String dataDeSolicitacao) {
		this.dataDeSolicitacao = dataDeSolicitacao;
	}
	public String getDataDeSolicitacao() {
		return dataDeSolicitacao;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getCliente() {
		return cliente;
	}
	
	public void setAtendente(String atendente) {
		this.atendente = atendente;
	}
	public String getAtendente() {
		return atendente;
	}
	
	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}
	public String getTecnico() {
		return tecnico;
	}
	
	public void setDescricaoCliente(String descricaoCliente) {
		this.descricaoCliente = descricaoCliente;
	}
	public String getDescricaoCliente() {
		return descricaoCliente;
	}	
}