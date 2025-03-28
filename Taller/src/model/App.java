import java.sql.Connection;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);

        
        
        Connection conexion = ConexionDB.conectar();
        if (conexion != null) {
            System.out.println("Conexión establecida correctamente.");
        } else {
            System.out.println("No se pudo establecer la conexión.");
        }

     
        int opcion;

        do {
            System.out.println("\nGestión de Taller, elige lo que necesitas: ");
            System.out.println("1. Registrar una Reparación");
            System.out.println("2. Registrar un Empleado");
            System.out.println("3. Revisar Inventario");
            System.out.println("4. Registrar un Pedido");
            System.out.println("5. Registrar o revisar una Cita");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                
                case 1:
                    System.out.println("Registrando Reparación...");
                    break;
                case 2:
                    System.out.println("Registrando Empleado...");
                    break;
                case 3:
                    System.out.println("Revisando Inventario...");
                    break;
            
                case 4:
                    System.out.println("Registrando Pedido...");
                    break;
                case 5:
                    System.out.println("1. Registrar nueva cita");
                    System.out.println("2. Revisar citas");
                    System.out.print("Seleccione una opción: ");
                    int opcion2 = sc.nextInt();
                    sc.nextLine();
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println(" Opción no válida.");
            }
        } while (opcion != 8);


        sc.close();
    }





        }

    



      
    

  
    


