package fatec.poo.model;
import java.util.ArrayList;

public class Instrutor extends Pessoa{
    private String formacao;
    private String areaAtuacao;
    private ArrayList <Turma> turmas;
    
    public Instrutor(String nome, String cpf) {
        super(nome, cpf);
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public String getFormacao() {
        return formacao;
    }
    public String getAreaAtuacao() {
        return areaAtuacao;
    }
    
    public void addTurma(Turma turma){
       turmas.add(turma);
       turma.setInstrutor(this);
    }
}