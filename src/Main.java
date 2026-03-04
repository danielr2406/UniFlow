import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void mensajeBienvenida() {
        System.out.println("====================================");
        System.out.println("        Bienvenido a UniFlow");
        System.out.println(" Sistema de Gestión Académica");
        System.out.println("====================================");
    }

    public static void main(String[] args) {

        mensajeBienvenida();

        String url = "jdbc:mysql://localhost:3306/uniflow";
        String user = "root";
        String password = "tu_password";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión a MySQL exitosa.");
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos.");
            e.printStackTrace();
        }
    }
}
