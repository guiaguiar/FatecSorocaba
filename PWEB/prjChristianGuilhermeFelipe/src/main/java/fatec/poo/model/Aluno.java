package fatec.poo.model;

import javax.persistence.Entity;

@Entity
public class Aluno extends Pessoa{
	
    private String escolaridade;
    private Matricula matricula;

    public Aluno(String Nome, String CPF) {
        super(Nome, CPF);
    }
    
    public Aluno(){
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public String getEscolaridade() {
        return escolaridade;
    }
    public Matricula getMatricula() {
        return matricula;
    }    
}
