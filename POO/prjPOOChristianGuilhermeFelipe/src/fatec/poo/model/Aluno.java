package fatec.poo.model;

public class Aluno extends Pessoa{
    private String escolaridade;
    private Matricula matricula;

    public Aluno(String Nome, String CPF) {
        super(Nome, CPF);
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
