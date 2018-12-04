package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Pessoa;
public class DaoPessoa {
    
    private Connection conn;
    
    public DaoPessoa(Connection conn){
        this.conn = conn;
    }
    
    public void inserir(Pessoa pessoa){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("INSERT INTO Pessoa(CPF, Nome, DataNasc, "
                                     + "Endereco, Numero, Bairro, Cidade, "
                                     + "Estado, CEP, Telefone, Celular, Sexo, "
                                     + "EstadoCivil, RG, Email)"
                                     + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,pessoa.getCPF());
            ps.setString(2,pessoa.getNome());
            ps.setString(3,pessoa.getDataNasc());
            ps.setString(4,pessoa.getEndereco());
            ps.setInt(5,pessoa.getNumero());
            ps.setString(6,pessoa.getBairro());
            ps.setString(7,pessoa.getCidade());
            ps.setString(8,pessoa.getEstado());
            ps.setString(9,pessoa.getCEP());
            ps.setString(10,pessoa.getTelefone());
            ps.setString(11,pessoa.getCelular());
            ps.setString(12,pessoa.getSexo());
            ps.setString(13,pessoa.getEstadoCivil());
            ps.setString(14,pessoa.getRG());
            ps.setString(15,pessoa.getEmail());
        } catch (SQLException ex){
            System.out.println(ex.toString());
        }
    }
    
    public Pessoa consultar (String cpf) {
        Pessoa p = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM Pessoa "
                                     + "WHERE CPF = ?");
            
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                p = new Pessoa (rs.getString("Nome"), cpf);
                p.setDataNasc(rs.getString("DataNasc"));
                p.setEndereco(rs.getString("Endereco"));
                p.setNumero(rs.getInt("Numero"));
                p.setBairro(rs.getString("Bairro"));
                p.setCidade(rs.getString("Cidade"));
                p.setEstado(rs.getString("Estado"));
                p.setCEP(rs.getString("CEP"));
                p.setTelefone(rs.getString("Telefone"));
                p.setCelular(rs.getString("Celular"));
                p.setSexo(rs.getString("Sexo"));
                p.setEstadoCivil(rs.getString("EstadoCivil"));
                p.setRG(rs.getString("RG"));
                p.setEmail(rs.getString("Email"));
            }
        }
        catch (SQLException ex) { 
            System.out.println(ex.toString());   
        }
        return (p);
    }
    
    public void alterar(Pessoa pessoa){
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE Pessoa SET Nome = ?,"
                                     + "DataNasc = ?, Endereco = ?,"
                                     + "Numero = ?, Bairro = ?,"
                                     + "Cidade = ?, Estado = ?,"
                                     + "CEP = ?, Telefone = ?,"
                                     + "Celular = ?, Sexo = ?,"
                                     + "EstadoCivil = ?, RG = ?,"
                                     + "Email = ? WHERE CPF = ?");
            
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getDataNasc());
            ps.setString(3, pessoa.getEndereco());
            ps.setInt(4, pessoa.getNumero());
            ps.setString(5, pessoa.getBairro());
            ps.setString(6, pessoa.getCidade());
            ps.setString(7, pessoa.getEstado());
            ps.setString(8, pessoa.getCEP());
            ps.setString(9, pessoa.getTelefone());
            ps.setString(10, pessoa.getCelular());
            ps.setString(11, pessoa.getSexo());
            ps.setString(12, pessoa.getEstadoCivil());
            ps.setString(13, pessoa.getRG());
            ps.setString(14, pessoa.getEmail());
            ps.setString(15, pessoa.getCPF());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void excluir(Pessoa pessoa) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM Pessoa WHERE CPF = ?");
            
            ps.setString(1, pessoa.getCPF());
                      
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());   
        }
    }
}
