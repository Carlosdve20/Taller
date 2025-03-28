    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.SQLException;
    import model.cliente;

    public class ClienteDAO {
        public void agregarCliente(Cliente cliente) {
            
            String sql = "INSERT INTO clientes (dni, nombre, telefono, email) VALUES (?, ?, ?, ?)";
    
            try (Connection conn = ConexionBD.conectar();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
    
                stmt.setString(1, cliente.getDni());
                stmt.setString(2, cliente.getNombre());
                stmt.setString(3, cliente.getTelefono());
                stmt.setString(4, cliente.getEmail());
    
                stmt.executeUpdate();
                System.out.println("Cliente agregado a la BD.");
            } catch (SQLException e) {
                System.out.println("Error al agregar cliente: " + e.getMessage());
            }
        }
    
        // Obtener todos los clientes de la base de datos
        public void obtenerClientes() {
            String sql = "SELECT * FROM clientes";
    
            try (Connection conn = ConexionBD.conectar();
                 PreparedStatement stmt = conn.prepareStatement(sql);
                 var rs = stmt.executeQuery()) {
    
                while (rs.next()) {
                    System.out.println("Cliente: " + rs.getString("dni") + " - " +
                            rs.getString("nombre") + " - " + rs.getString("telefono") + " - " +
                            rs.getString("email"));
                }
            } catch (SQLException e) {
                System.out.println("Error al obtener clientes: " + e.getMessage());
            }
        }
    }
    

