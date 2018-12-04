package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Aluno;
import fatec.poo.model.Pessoa;

public class DaoAluno {
    
    private Connection conn;
    
    public DaoAluno(Connection conn){
        this.conn = conn;
    }
    
    public void inserir(Aluno aluno){
        PreparedStatement ps = null;
        try{
            new DaoPessoa(conn).inserir(aluno);
            ps = conn.prepareStatement("INSERT INTO Aluno(CPFAluno, Escolaridade) "
                                     + "VALUES(?,?)");
            ps.setString(1,aluno.getCPF());
            ps.setString(2,aluno.getEscolaridade());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void alterar(Aluno aluno) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE Aluno SET Escolaridade = ? "
                                     + "WHERE CPFAluno = ?");
            
            ps.setString(1, aluno.getEscolaridade());
            ps.setString(2, aluno.getCPF());
            ps.execute();
            new DaoPessoa(conn).alterar(aluno);
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public Aluno consultar(String cpf){
        Aluno a = null;
        Pessoa p = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM Aluno "
                                     + "WHERE CPFAluno = ?");
            
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                p = new DaoPessoa(conn).consultar(cpf);
                a = new Aluno(p.getNome(), cpf);
                a.setDataNasc(p.getDataNasc());
                a.setEndereco(p.getEndereco());
                a.setNumero(p.getNumero());
                a.setBairro(p.getBairro());
                a.setCidade(p.getCidade());
                a.setEstado(p.getEstado());
                a.setCEP(p.getCEP());
                a.setTelefone(p.getTelefone());
                a.setCelular(p.getCelular());
                a.setSexo(p.getSexo());
                a.setEstadoCivil(p.getEstadoCivil());
                a.setRG(p.getRG());
                a.setEmail(p.getEmail());
                a.setEscolaridade(rs.getString("Escolaridade"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (a);
    }
    
    public void excluir(Aluno aluno) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM Aluno WHERE CPFAluno = ?");
            
            ps.setString(1, aluno.getCPF());
            new DaoPessoa(conn).excluir(aluno);
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}