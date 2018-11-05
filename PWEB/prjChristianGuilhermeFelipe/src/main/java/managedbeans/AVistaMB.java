package managedbeans;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import fatec.poo.model.AVista;



@ManagedBean
@SessionScoped
public class AVistaMB {
	private AVista avista = new AVista();
	private EntityManagerFactory emf;
			
	public AVistaMB() {
		emf = Persistence.createEntityManagerFactory("PrjAluno");
	}
	
	public void save() {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(avista);
		em.getTransaction().commit();
		em.close();
		avista = new AVista();
	}
	
	@SuppressWarnings("unchecked")
	public List<AVista> getAVistas(){
		List <AVista> lista;
		EntityManager em = emf.createEntityManager();
		lista = em.createQuery("Select a from Aluno a").getResultList();
		em.close();
		return lista;
	}

	public AVista getAVista() {
		return avista;
	}

	public void setAVista(AVista avista) {
		this.avista = avista;
	}
}

