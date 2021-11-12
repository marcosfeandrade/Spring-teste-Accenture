package accenture.jpa.conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAConexao {
	private static EntityManager em = null;
	
	static {
		conectar();
	}
	private static void conectar() {
		try {

			if(em == null) {
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("PU_AULA");  
		        em=emf.createEntityManager();  
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Erro ao conectar com o banco de dados");
		}
		
	}

	public static EntityManager getEm() {
		return em;
	}
}
