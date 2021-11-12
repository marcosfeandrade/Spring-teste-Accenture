package accenture.jpa.repository;

import javax.persistence.EntityManager;

import accenture.jpa.conexao.JPAConexao;
import accenture.jpa.model.Cor;

public class CorRepository {
	private EntityManager em;
	
	public CorRepository() {
		em = JPAConexao.getEm();
	}
	
	public void incluir(Cor cor) {
		em.getTransaction().begin();
		em.persist(cor);
		em.getTransaction().commit();
	}
}
