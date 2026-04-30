package dao;

import uniflow.model.Docente;
import uniflow.config.Conexion;
import java.sql.*;

public class DocenteDAO {

    public boolean registrar(Docente d) {
        try {
            Connection con = Conexion.getConexion();

            String sql = "INSERT INTO docente (id_usuario) VALUES (?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, d.getIdUsuario());

            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println("Error en DocenteDAO: " + e.getMessage());
            return false;
        }
    }
  public void registrar(int idUsuario) {
    try {
        Connection con = Conexion.getConexion();

        String sql = "INSERT INTO docente (id_usuario) VALUES (?)";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, idUsuario);
        ps.executeUpdate();

        System.out.println("✔ Docente registrado");

    } catch (Exception e) {
        System.out.println("Error registrar docente: " + e.getMessage());
    }
}
}