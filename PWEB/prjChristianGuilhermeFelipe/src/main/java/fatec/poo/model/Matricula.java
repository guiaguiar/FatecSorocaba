package fatec.poo.model;

public class Matricula {
    private String data;
    private int qtdeFaltas;
    private double nota;
    private Aluno aluno;
    private Turma turma;
    private AVista aVista;
    private APrazo aPrazo;

    public Matricula(String Data) {
        this.data = Data;
    }
    
    public void setAluno(Aluno aluno){
        this.aluno = aluno;
        aluno.setMatricula(this);
    }
    public void setQtdeFaltas(int qtdeFaltas) {
        this.qtdeFaltas = qtdeFaltas;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    public void setAVista(AVista aVista) {
        this.aVista = aVista;
    }
    public void setAPrazo(APrazo aPrazo) {
        this.aPrazo = aPrazo;
    }

    public Aluno getAluno() {
        return aluno;
    }
    public String getData() {
        return data;
    }
    public int getQtdeFaltas() {
        return qtdeFaltas;
    }
    public double getNota() {
        return nota;
    }
    public Turma getTurma() {
        return turma;
    }
    public AVista getAVista() {
        return aVista;
    }
    public APrazo getAPrazo() {
        return aPrazo;
    }
}
