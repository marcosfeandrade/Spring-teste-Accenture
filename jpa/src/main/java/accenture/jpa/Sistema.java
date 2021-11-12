package accenture.jpa;

import accenture.jpa.conexao.JPAConexao;
import accenture.jpa.model.Cor;
import accenture.jpa.repository.CorRepository;

public class Sistema {
	public static void main(String[] args) {
		JPAConexao.getEm();
		
		Cor cor = new Cor();
		cor.setNome("AZUL");
		CorRepository cr = new CorRepository();
		cr.incluir(cor);
	}
}
