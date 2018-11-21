package fatec.poo.model;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Curso {
	@Id
    private String sigla;
    private String nome;
    private int cargaHoraria;
    private double valor;
    private String dataVigencia;
    private double valorHoraInstrutor;
    private String programa;
    private ArrayList <Turma> turmas;

    public Curso(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }
    
    public Curso() {
    }
    

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setDataVigencia(String dataVigencia) {
        this.dataVigencia = dataVigencia;
    }
    public void setValorHoraInstrutor(double valorHoraInstrutor) {
        this.valorHoraInstrutor = valorHoraInstrutor;
    }
    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getSigla() {
        return sigla;
    }
    public String getNome() {
        return nome;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public double getValor() {
        return valor;
    }
    public String getDataVigencia() {
        return dataVigencia;
    }
    public double getValorHoraInstrutor() {
        return valorHoraInstrutor;
    }
    public String getPrograma() {
        return programa;
    }
    
    public void addTurma(Turma turma){
        turmas.add(turma);
        turma.setCurso(this);
     }
}
