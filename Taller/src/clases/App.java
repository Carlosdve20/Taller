

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Connection conexion = ConexionDB.conectar();
        if (conexion != null) {
            System.out.println("Conexión establecida correctamente.");
        } else {
            System.out.println("No se pudo establecer la conexión.");
        }

        Scanner sc = new Scanner(System.in);
        List<Clientes> clientes = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\nGestión de Taller, elige lo que necesitas: ");
            System.out.println("1. Registrar un Cliente");
            System.out.println("2. Registrar un Vehículo");
            System.out.println("3. Registrar una Reparación");
            System.out.println("4. Registrar un Empleado");
            System.out.println("5. Revisar Inventario");
            System.out.println("6. Revisar Proveedores");
            System.out.println("7. Registrar un Pedido");
            System.out.println("8. Registrar o revisar una Cita");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    registraClientes(sc, clientes);
                    break;
                case 2:
                    System.out.println("Registrando Vehículo...");
                    break;
                case 3:
                    System.out.println("Registrando Reparación...");
                    break;
                case 4:
                    System.out.println("Registrando Empleado...");
                    break;
                case 5:
                    System.out.println("Revisando Inventario...");
                    break;
                case 6:
                    System.out.println("Revisando Proveedores...");
                    break;
                case 7:
                    System.out.println("Registrando Pedido...");
                    break;
                case 8:
                    System.out.println("1. Registrar nueva cita");
                    System.out.println("2. Revisar citas");
                    System.out.print("Seleccione una opción: ");
                    int opcion2 = sc.nextInt();
                    sc.nextLine();
                    break;
                case 9:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("⚠️ Opción no válida.");
            }
        } while (opcion != 9);

        sc.close();
    }

    private static void registraClientes(Scanner sc, List<Clientes> clientes) {
        System.out.println("\nEscribe DNI del cliente:");
        String dni = sc.nextLine();
        System.out.println("Escribe nombre del cliente:");
        String nombre = sc.nextLine();
        System.out.println("Escribe apellido:");
        String apellido = sc.nextLine();
        System.out.println("Escribe teléfono:");
        String telefono = sc.nextLine();
        System.out.println("Escribe correo:");
        String correo = sc.nextLine();
        System.out.println("Escribe dirección:");
        String direccion = sc.nextLine();
        
        clientes.add(new Clientes(dni, nombre, apellido, telefono, correo, direccion));
        System.out.println("✅ Cliente registrado con éxito.");
    }
}
