package dao;

import dto.MateriaVistaDTO;
import uniflow.model.Materia;
import uniflow.config.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MateriaDAO {

    // 🟢 GUARDAR
    public boolean registrar(Materia m) {

    String sql = "INSERT INTO materia (nombre, codigo) VALUES (?, ?)";

    try {
        Connection con = Conexion.getConexion();

        if (con == null) {
            System.out.println("❌ No hay conexión");
            return false;
        }

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, m.getNombre());
        ps.setString(2, m.getCodigo());

        int filas = ps.executeUpdate();

        System.out.println("✔ Filas insertadas: " + filas);

        return filas > 0;

    } catch (Exception e) {
        System.out.println("❌ Error insertar materia: " + e.getMessage());
        return false;
    }
}

    // 🔍 LISTAR
    public List<Materia> listar() {
        List<Materia> lista = new ArrayList<>();

        try {
            Connection con = Conexion.getConexion();
            String sql = "SELECT * FROM materia";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia m = new Materia();
                m.setId_materia(rs.getInt("id_materia"));
                m.setNombre(rs.getString("nombre"));
                m.setCodigo(rs.getString("codigo"));

                lista.add(m);
            }

        } catch (Exception e) {
            System.out.println("Error listar materias: " + e.getMessage());
        }

        return lista;
    }
    ///vista dao
    
    public List<MateriaVistaDTO> listarMateriasConDocente() {

    List<MateriaVistaDTO> lista = new ArrayList<>();

    String sql = """
        SELECT 
            m.codigo,
            m.nombre,
            u.nombre AS nombre_docente
        FROM materia m
        INNER JOIN dicta d ON m.id_materia = d.id_materia
        INNER JOIN usuario u ON d.id_docente = u.id_usuario
    """;

    try {
        Connection con = Conexion.getConexion();
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            MateriaVistaDTO m = new MateriaVistaDTO(
                rs.getString("codigo"),
                rs.getString("nombre"),
                rs.getString("nombre_docente")
            );

            lista.add(m);
        }

    } catch (Exception e) {
        System.out.println("Error listar materias con docente: " + e.getMessage());
    }

    return lista;
}
    public int obtenerIdPorCodigo(String codigo) {

    int id = -1;

    try {
        Connection con = Conexion.getConexion();
        String sql = "SELECT id_materia FROM materia WHERE codigo = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, codigo);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            id = rs.getInt("id_materia");
        }

    } catch (Exception e) {
        System.out.println("Error obtener id materia: " + e.getMessage());
    }

    return id;
}
    
}