package dao;

import uniflow.model.Inscripcion;
import uniflow.config.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InscripcionDAO {

    public boolean registrar(Inscripcion i) {
        try {
            Connection con = Conexion.getConexion();

            String sql = "INSERT INTO inscripcion (id_estudiante, id_materia, semestre) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, i.getIdEstudiante());
            ps.setInt(2, i.getIdMateria());
            ps.setString(3, i.getSemestre());

            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println("Error en InscripcionDAO: " + e.getMessage());
            return false;
        }
    }
    // LISTAR CURSOS DEL ESTUDIANTE
    public List<Object[]> listarPorEstudiante(int idEstudiante) {
    List<Object[]> lista = new ArrayList<>();

    try {
        Connection con = Conexion.getConexion();

        String sql = "SELECT m.nombre, m.codigo, u.nombre AS docente, i.semestre " +
             "FROM inscripcion i " +
             "JOIN materia m ON i.id_materia = m.id_materia " +
             "JOIN dicta d ON m.id_materia = d.id_materia " +
             "JOIN usuario u ON d.id_docente = u.id_usuario " +
             "WHERE i.id_estudiante = ?";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idEstudiante);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Object[] fila = {
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4)
            };
            lista.add(fila);
        }

    } catch (Exception e) {
        System.out.println("Error listarPorEstudiante: " + e.getMessage());
    }

    return lista;
}

    // CONTAR ESTUDIANTES POR MATERIA (DOCENTE)
    public List<Object[]> contarEstudiantesPorMateria(int idDocente) {
    List<Object[]> lista = new ArrayList<>();

    try {
        Connection con = Conexion.getConexion();

        String sql = "SELECT m.nombre, m.codigo, COUNT(i.id_estudiante) AS total " +
                     "FROM materia m " +
                     "JOIN dicta d ON m.id_materia = d.id_materia " +
                     "LEFT JOIN inscripcion i ON m.id_materia = i.id_materia " +
                     "WHERE d.id_docente = ? " +
                     "GROUP BY m.id_materia, m.nombre, m.codigo";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idDocente);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            lista.add(new Object[]{
                rs.getString("nombre"),
                rs.getString("codigo"),
                rs.getInt("total")
            });
        }

    } catch (Exception e) {
        System.out.println("Error contar estudiantes: " + e.getMessage());
    }

    return lista;
}
    public boolean eliminar(int idEstudiante, int idMateria) {
    try {
        Connection con = Conexion.getConexion();

        String sql = "DELETE FROM inscripcion WHERE id_estudiante = ? AND id_materia = ?";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, idEstudiante);
        ps.setInt(2, idMateria);

        int filas = ps.executeUpdate();

        return filas > 0;

    } catch (Exception e) {
        System.out.println("Error eliminar inscripción: " + e.getMessage());
        return false;
    }
}
}