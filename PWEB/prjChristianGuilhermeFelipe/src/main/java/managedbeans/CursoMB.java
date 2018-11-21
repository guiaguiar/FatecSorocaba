package managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fatec.poo.model.Curso;
import service.CursoService;

import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class CursoMB {
	private Curso curso = new Curso();
	private CursoService cursoService = new CursoService();
	
	public void salvar() {
		cursoService.save(curso);
		cursoService.closeEntityManager();
		curso = new Curso();
	}

	public List<Curso> getCursos() {
		List <Curso> lista;
		lista = cursoService.getAll(Curso.class);
		cursoService.closeEntityManager();
		return lista;
	}

	
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}
