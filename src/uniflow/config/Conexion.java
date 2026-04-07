package uniflow.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

  public static Connection getConexion() {
    Connection con = null;
    try {
        // 1. CARGA MANUAL DEL DRIVER 
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        
        // 2. URL CORRETA 
        String url = "jdbc:mysql://localhost:3306/uniflow";
        
        con = DriverManager.getConnection(url, "root", "");
        System.out.println("✅ Conexión exitosa a UniFlow");
        
    } catch (ClassNotFoundException e) {
        System.out.println("❌ ERROR: No se encontró el conector .JAR");
    } catch (SQLException e) {
        System.out.println("❌ ERROR DE SQL: " + e.getMessage());
    }
    return con;
}
}
