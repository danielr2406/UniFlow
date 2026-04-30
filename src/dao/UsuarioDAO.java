package dao;

import uniflow.config.Conexion;
import uniflow.model.Usuario;
import java.sql.*;

public class UsuarioDAO {

    // LOGIN
    public Usuario login(String correo, String password) {

   Usuario u = null;

    try {
        Connection con = Conexion.getConexion();

        String sql = "SELECT * FROM usuario WHERE correo = ? AND password = ?";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, correo.trim());
        ps.setString(2, password.trim());

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            System.out.println("✔ LOGIN OK");

            u = new Usuario();
            u.setId(rs.getInt("id_usuario"));
            u.setNombre(rs.getString("nombre"));
            u.setRol(rs.getString("rol"));
        } else {
            System.out.println("❌ LOGIN FALLÓ");
        }

    } catch (Exception e) {
        System.out.println("Error login: " + e.getMessage());
    }

    return u;
}

    // REGISTRAR
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

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }

        } catch (Exception e) {
            System.out.println("❌ Error en registro: " + e.getMessage());
        }

        return 0;
    }

    // BUSCAR POR ID
    public Usuario buscarPorId(int id) {
        Usuario u = null;

        try {
            Connection con = Conexion.getConexion();

            String sql = "SELECT * FROM usuario WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                u = new Usuario();
                u.setId(rs.getInt("id_usuario"));
                u.setNombre(rs.getString("nombre"));
                u.setCorreo(rs.getString("correo"));
                u.setPassword(rs.getString("password"));
                u.setRol(rs.getString("rol"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return u;
    }

    // ELIMINAR
    public boolean eliminar(int id) {
        try {
            Connection con = Conexion.getConexion();

            String sql = "DELETE FROM usuario WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            return true;

        } catch (Exception e) {
            return false;
        }
        
    }
    
}