package managedbeans;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import fatec.poo.model.APrazo;



@ManagedBean
@SessionScoped
public class APrazoMB {
	private APrazo aprazo = new APrazo();
	private EntityManagerFactory emf;
			
	public APrazoMB() {
		emf = Persistence.createEntityManagerFactory("PrjAluno");
	}
	
	public void save() {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(aprazo);
		em.getTransaction().commit();
		em.close();
		aprazo = new APrazo();
	}
	
	@SuppressWarnings("unchecked")
	public List<APrazo> getAprazos(){
		List <APrazo> lista;
		EntityManager em = emf.createEntityManager();
		lista = em.createQuery("Select a from Aluno a").getResultList();
		em.close();
		return lista;
	}

	public APrazo getAprazo() {
		return aprazo;
	}

	public void setAPrazo(APrazo aprazo) {
		this.aprazo = aprazo;
	}
	
}

