package main;

public class Servicos extends SolicitaServico{
	private String dataDeInicio;
	private String dataDeConclusao;
	private String materiais;
	private String descricaoTecnica;
	private double valor;
	
	public void setDataDeInicio(String dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}
	public String getDataDeInicio() {
		return dataDeInicio;
	}
	
	public void setDataDeConclusao(String dataDeConclusao) {
		this.dataDeConclusao = dataDeConclusao;
	}
	public String getDataDeConclusao() {
		return dataDeConclusao;
	}
	
	public void setMateriais(String materiais) {
		this.materiais = materiais;
	}
	public String getMateriais() {
		return materiais;
	}
	
	public void setDescricaoTecnica(String descricaoTecnica) {
		this.descricaoTecnica = descricaoTecnica;
	}
	public String getDescricaoTecnica() {
		return descricaoTecnica;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValor() {
		return valor;
	}	
}
