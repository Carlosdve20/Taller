import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
 
public class ConexionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/Taller";
    private static final String USUARIO = "carlos";
    private static final String CONTRASEÑA = "Carlos1996";
 
    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
            return null;
        }
    }
}