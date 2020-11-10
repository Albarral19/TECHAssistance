package main;
import java.util.Date;

public class Servico {
	public int id;
	public String descricao;
	public String valor;
	Date dataSolicitacao = new Date();
	Date dataInicio = new Date();
	Date dataConclusao = new Date();
	public String cliente;
	public String tecnico;
	public String atendente;
	String[] materiais;
	
}
