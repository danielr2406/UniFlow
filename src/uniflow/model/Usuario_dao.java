package uniflow.model;

import uniflow.config.Conexion;
import uniflow.config.Conexion;
import uniflow.model.Usuario;
import java.sql.*;

public class Usuario_dao {

   public Usuario login(String correo, String password) {

    Usuario u = null;

    try {
        Connection con = Conexion.getConexion();

        String sql = "SELECT * FROM usuario WHERE correo=? AND password=?";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, correo);
        ps.setString(2, password);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            u = new Usuario();
            u.setNombre(rs.getString("nombre"));
            u.setCorreo(rs.getString("correo"));
            u.setPassword(rs.getString("password"));
            u.setRol(rs.getString("rol"));
        }

    } catch (Exception e) {
        System.out.println("❌ Error en login: " + e.getMessage());
    }

    return u;
}

    // 🟢 REGISTRO
   public int registrar(Usuario u) {
    Connection con = null;
    try {
        con = Conexion.getConexion();

        String sql = "INSERT INTO usuario (nombre, correo, password, rol) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        ps.setString(1, u.getNombre());
        ps.setString(2, u.getCorreo());
        ps.setString(3, u.getPassword());
        ps.setString(4, u.getRol());

        ps.executeUpdate();

        // 🔥 Obtener ID generado
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            return rs.getInt(1); // devuelve id_usuario
        }

    } catch (Exception e) {
        System.out.println("❌ Error en DAO Registro: " + e.getMessage());
    } finally {
        try { if(con != null) con.close(); } catch(SQLException ex) {}
    }

    return 0; // si falla
}
}
