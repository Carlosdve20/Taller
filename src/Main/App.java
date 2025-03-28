package Main;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Vehiculos;
import model.Clientes;

public class App {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        List<Clientes>clientes= new ArrayList();
        List<Vehiculos>vehiculos=new ArrayList();


  
        Connection conexion = ConexionDB.conectar();
        if (conexion != null) {
            System.out.println("Conexión establecida correctamente.");
        } else {
            System.out.println("No se pudo establecer la conexión.");
        }

     

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

                registraClientes(clientes, sc);
                    break;
                case 2:
                registrarVehiculo(vehiculos, sc);
                  
                    break;
               
                case 3:
                   System.out.println("Introduce matricula vehiculo");
                   for (Vehiculos vehiculo1: vehiculos){
                    
                   }
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



    private static void registrarVehiculo(List<Vehiculos> vehiculos, Scanner sc) {
        System.out.println("Escribe la matrícula del vehículo");
        String matricula = sc.nextLine();
            
   
        System.out.println("Escribe la marca del vehículo");
        String marca = sc.nextLine();
   
        System.out.println("Escribe el modelo del vehículo");
        String modelo = sc.nextLine();
   
        System.out.println("Escribe el tipo de vehículo");
        String tipo = sc.nextLine();
   
       Vehiculos vehiculo= new Vehiculos(matricula, marca, modelo, tipo); 
       vehiculos.add(vehiculo);
    }

    
        private static void registraClientes(List<Clientes>clientes,Scanner sc ) {
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
           clientes.add(cliente);
           /*clienteDAO.agregarCliente(cliente);
          ClienteDAO clienteDAO =new ClienteDAO();
           clienteDAO.insertarClientes(clientes);*/
    }


}

    



      
    

  
    


