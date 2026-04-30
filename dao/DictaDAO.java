package dao;

import uniflow.model.Dicta;
import uniflow.config.Conexion;
import java.sql.*;
public class DictaDAO {

    public void insertar(int idDocente, int idMateria) {

        try {
            Connection con = Conexion.getConexion();

            String sql = "INSERT INTO dicta (id_docente, id_materia) VALUES (?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idDocente);
            ps.setInt(2, idMateria);

            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error DictaDAO insertar: " + e.getMessage());
        }
    }
}