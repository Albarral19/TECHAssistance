package main;
import java.util.ArrayList;

public class GServico {
	ArrayList<String> servico = new ArrayList<String>();

public void addServico(String nomeAtendente, String nomeCliente, String dataSolicitacao, String dataInicio, String descricao, String tecnico) {
	servico.add(nomeAtendente + "|" + nomeCliente + "|" + dataSolicitacao + "|" + dataInicio + "|" + descricao + "|" + tecnico);
}
public void exibeInformacoes() {
	System.out.println("*********************************Serviços*********************************");
	int tamanho = servico.size();
	String[] splitServicos;
	for (int i = 0; i < tamanho; i++) {
		splitServicos = servico.get(i).split("|");
		System.out.printf("Serviço  -  %d\n", i + 1);
		System.out.printf("Atendente: %s\n", splitServicos[0]);
		System.out.printf("Cliente: %s\n", splitServicos[1]);
		System.out.printf("Data da solicitação: %s\n", splitServicos[2]);
		System.out.printf("Data do Início: %s\n", splitServicos[3]);
		System.out.printf("Descrição: %s\n", splitServicos[4]);
		System.out.printf("Técnico: %s\n", splitServicos[5]);
	}		
}
}

