package dao;

import uniflow.model.Estudiante;
import uniflow.config.Conexion;
import java.sql.*;

public class EstudianteDAO {

    public boolean registrar(Estudiante e) {
        try {
            Connection con = Conexion.getConexion();

            String sql = "INSERT INTO estudiante (id_usuario, carrera) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, e.getIdUsuario());
            ps.setString(2, e.getCarrera());

            ps.executeUpdate();
            return true;

        } catch (Exception ex) {
            System.out.println("Error en EstudianteDAO: " + ex.getMessage());
            return false;
        }
    }
}