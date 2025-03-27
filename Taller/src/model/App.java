import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

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
                    registraClientes(sc);
                    break;
                case 2:
                   registrarVehículo(sc);
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



    private static void registrarVehículo(Scanner sc) {
        System.out.println("Escribe la matrícula del vehículo");
        String matricula = sc.nextLine();
            
   
        System.out.println("Escribe la marca del vehículo");
        String marca = sc.nextLine();
   
        System.out.println("Escribe el modelo del vehículo");
        String modelo = sc.nextLine();
   
        System.out.println("Escribe el tipo de vehículo");
        String tipo = sc.nextLine();
   
       Vehiculos vehiculo= new Vehiculos(matricula, marca, modelo, tipo);
       
    }

    private static void registraClientes(Scanner sc) {
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
           Clientes cliente =new Clientes(dni, nombre, apellido,telefono, correo, direccion);
           clienteDAO.agregarCliente(cliente);
    }

}

    


