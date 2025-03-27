
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Clientes>clientes= new ArrayList();
        int opcion;
        do {
            System.out.println("Gestión de Taller, elige lo que necesitas: ");
            System.out.println("1. Registrar un Cliente");
            System.out.println("2. Registrar un Vehículo");
            System.out.println("3. Registrar una Reparación");
            System.out.println("4. Registrar un Empleado");
            System.out.println("5. revisar Inventario");
            System.out.println("6. revisar Proveedores");
            System.out.println("7. Registrar un Pedido");
            System.out.println("8. Registrar o revisar una  Cita");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

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
                    System.out.println("Registrando Inventario...");
                    break;
                case 6:
                    System.out.println("Registrando Proveedor...");
                    break;
                case 7:
                    System.out.println("Registrando Pedido...");
                    break;
                case 8:
                System.out.println("1. Registrar nueva cita");
                System.out.println("2. Revisar citas");
                System.out.print("Seleccione una opción: ");
                int Opcion2 = sc.nextInt();
                sc.nextLine();
                    break;

                case 9:
                    System.out.println("Saliendo del sistema...");
                    break;
                    default:
                    System.out.println("Opción no válida.");
            }
            
                } while (opcion != 9);
        
            }

    private static void registraClientes(Scanner sc, List<Clientes> clientes) {
        System.out.println("Escribe DNI cliente");
           String dni=sc.nextLine();
           System.out.println("Escribe nombre cliente");
           String nombre=sc.nextLine();
           System.out.println("Escribe apellido");
           String apellido=sc.nextLine();
           System.out.println("Escribe telefono");
           String telefono=sc.nextLine();
           System.out.println("Escribe correo");
           String correo=sc.nextLine();
           System.out.println("Escribe direccion");
           String direccion=sc.nextLine();
           clientes.add(new Clientes(dni, nombre, apellido,telefono, correo, direccion));
    }
        }