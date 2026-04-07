
package uniflow.model;

import uniflow.model.Estudiante;
import uniflow.config.Conexion;
import java.sql.*;

public class Estudiante_dao {

    public boolean registrar(Estudiante e) {
        Connection con = null;
        try {
            con = Conexion.getConexion();

            String sql = "INSERT INTO estudiante (id_usuario, carrera) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, e.getIdUsuario());
            ps.setString(2, e.getCarrera());
          
            ps.executeUpdate();
            return true;

        } catch (Exception ex) {
            System.out.println("❌ Error en Estudiante DAO: " + ex.getMessage());
            return false;
        } finally {
            try { if(con != null) con.close(); } catch(SQLException ex) {}
        }
    }
}
