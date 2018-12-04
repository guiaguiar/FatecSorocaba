package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Instrutor;
import fatec.poo.model.Pessoa;

public class DaoInstrutor {
    
    private Connection conn;
    
    public DaoInstrutor(Connection conn){
        this.conn = conn;
    }
    
    public void inserir(Instrutor instrutor){
        PreparedStatement ps = null;
        try{
            new DaoPessoa(conn).inserir(instrutor);
            ps = conn.prepareStatement("INSERT INTO Instrutor(CpfInstrutor, Formacao, "
                                     + "AreaAtuacao) VALUES(?,?,?)");
            ps.setString(1,instrutor.getCPF());
            ps.setString(2,instrutor.getFormacao());
            ps.setString(3,instrutor.getAreaAtuacao());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void alterar(Instrutor instrutor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE Instrutor SET Formacao = ?, "
                                     + "SET AreaAtuacao = ? WHERE CpfInstrutor = ?");
            
            ps.setString(1, instrutor.getFormacao());
            ps.setString(2, instrutor.getAreaAtuacao());
            ps.setString(3, instrutor.getCPF());
            ps.execute();
            new DaoPessoa(conn).alterar(instrutor);
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public Instrutor consultar(String cpf){
        Instrutor i = null;
        Pessoa p = null;
        
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM Instrutor WHERE CpfInstrutor = ?");
            
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                p = new DaoPessoa(conn).consultar(cpf);
                i = new Instrutor (p.getNome(), cpf);
                i.setDataNasc(p.getDataNasc());
                i.setEndereco(p.getEndereco());
                i.setNumero(p.getNumero());
                i.setBairro(p.getBairro());
                i.setCidade(p.getCidade());
                i.setEstado(p.getEstado());
                i.setCEP(p.getCEP());
                i.setTelefone(p.getTelefone());
                i.setCelular(p.getCelular());
                i.setSexo(p.getSexo());
                i.setEstadoCivil(p.getEstadoCivil());
                i.setRG(p.getRG());
                i.setEmail(p.getEmail());
                i.setFormacao(rs.getString("Formacao"));
                i.setAreaAtuacao(rs.getString("AreaAtuacao"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (i);
    }
    
    public void excluir(Instrutor instrutor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM Instrutor WHERE CpfInstrutor = ?");
            
            ps.setString(1, instrutor.getCPF());
            new DaoPessoa(conn).excluir(instrutor);
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}