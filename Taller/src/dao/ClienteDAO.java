import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ClienteDAO {
    public void insertarClientes(List<Cliente> clientes) {
        String query = "INSERT INTO clientes (nombre, dni) VALUES (?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            for (Cliente cliente : clientes) {
                statement.setString(1, cliente.getNombre());
                statement.setString(2, cliente.getDni());

                // Ejecutar la inserción
                statement.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
