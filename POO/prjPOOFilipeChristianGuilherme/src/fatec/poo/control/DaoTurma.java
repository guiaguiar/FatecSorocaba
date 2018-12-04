package fatec.poo.control;

import fatec.poo.model.Curso;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Turma;

public class DaoTurma {

    private Connection conn;
    
    public DaoTurma(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Turma turma) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO Turma(SiglaTurma, "
                                     + "SiglaCurso, Descricao, DataInicio, "
                                     + "DataTermino, Periodo, QtdeVagas) "
                                     + "VALUES(?,?,?,?,?,?,?)");
            
            
            ps.setString(1, turma.getSiglaTurma());
            ps.setString(2, turma.getCurso().getSigla());
            ps.setString(3, turma.getDescricao());
            ps.setString(4, turma.getDataInicio());
            ps.setString(5, turma.getDataTermino());
            ps.setString(6, turma.getPeriodo());
            ps.setString(7, turma.getQtdVagas());
                      
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Turma turma) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE Turma SET SiglaCurso = ?, "
                                     + "Descricao = ?, DataInicio = ?, "
                                     + "DataTermino = ?, Periodo = ?, "
                                     + "QtdeVagas = ? "
                                     + "WHERE SiglaTurma = ?");
            
            ps.setString(1, turma.getCurso().getSigla());
            ps.setString(2, turma.getDescricao());
            ps.setString(3, turma.getDataInicio());
            ps.setString(4, turma.getDataTermino());
            ps.setString(5, turma.getPeriodo());
            ps.setString(6, turma.getQtdVagas());
            ps.setString(7, turma.getSiglaTurma());
            
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public  Turma consultar (String sigla) {
        Turma t = null;
        Curso c = null;
        
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from Turma "
                                     + "WHERE SiglaTurma = ?");
            
            
            ps.setString(1, sigla);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                t = new Turma (sigla, rs.getString("Descricao"));
                c = new DaoCurso(conn).consultar(rs.getString("SiglaCurso"));
                
                t.setCurso(c);             
                t.setDataInicio(rs.getString("DataInicio"));
                t.setDataTermino(rs.getString("DataTermino"));
                t.setPeriodo(rs.getString("Periodo"));
                t.setQtdVagas(rs.getString("QtdeVagas"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (t);
    }    
     
     public void excluir(Turma turma) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM Turma "
                                     + "WHERE SiglaTurma = ?");
            
            ps.setString(1, turma.getSiglaTurma());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}