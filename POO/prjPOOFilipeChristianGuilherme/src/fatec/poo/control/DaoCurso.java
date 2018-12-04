package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Curso;
import java.util.ArrayList;

public class DaoCurso {

    private Connection conn;
    
    public DaoCurso(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Curso curso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO Curso(SiglaCurso, Nome, "
                                     + "CargaHoraria, Valor, DataVigencia, "
                                     + "ValorHoraInstrutor, Programa) "
                                     + "VALUES(?,?,?,?,?,?,?)");
            ps.setString(1, curso.getSigla());
            ps.setString(2, curso.getNome());
            ps.setInt(3, curso.getCargaHoraria());
            ps.setDouble(4, curso.getValor());
            ps.setString(5, curso.getDataVigencia());
            ps.setDouble(6, curso.getValorHoraInstrutor());
            ps.setString(7, curso.getPrograma()); 
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Curso curso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE Curso SET Nome = ?, "
                                     + "CargaHoraria = ?, Valor = ?,"
                                     + "DataVigencia = ?, "
                                     + "ValorHoraInstrutor = ?, Programa = ?" 
                                     + "WHERE SiglaCurso = ?");
            
            ps.setString(1, curso.getNome());
            ps.setInt(2, curso.getCargaHoraria());
            ps.setDouble(3, curso.getValor());
            ps.setString(4, curso.getDataVigencia());
            ps.setDouble(5, curso.getValorHoraInstrutor());
            ps.setString(6, curso.getPrograma());
            ps.setString(7, curso.getSigla());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
     public  Curso consultar (String sigla) {
        Curso c = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM Curso "
                                     + "WHERE SiglaCurso = ?");
            
            ps.setString(1, sigla);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                c = new Curso (sigla, rs.getString("Nome"));
                c.setCargaHoraria(rs.getInt("CargaHoraria"));
                c.setValor(rs.getDouble("Valor"));
                c.setDataVigencia(rs.getString("DataVigencia"));
                c.setValorHoraInstrutor(rs.getDouble("ValorHoraInstrutor"));
                c.setPrograma(rs.getString("Programa"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (c);
    }    
     
    public void excluir(Curso curso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM Curso "
                                     + "WHERE SiglaCurso = ?");
            
            ps.setString(1, curso.getSigla());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public ArrayList ListarCursos() {
		ArrayList<String> cursos = new ArrayList<>();
                PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement("SELECT * FROM Curso");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				cursos.add(rs.getString("SiglaCurso"));
			}
		} catch (SQLException ex) {
			System.out.println(ex.toString());
		}
		return cursos;
	}
}





