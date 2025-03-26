
import java.util.Scanner;

public class App {
    public static void main(String[] args){
     
        Scanner sc = new Scanner (System.in);
        int opcion;
        do { 
            
            System.out.println(".Bienvenido al menú del taller");
            System.out.println("1. Gestión de clientes");
            System.out.println("2. Gestión de proveedores y pedidos");
            System.out.println("3. citas agendadas");
            System.out.println("4. Gestiona de inventario ");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            

        switch(opcion){

            case -> 1:
                GestionClientes();
                sys
        


            case -> 2:
                GestionProveedoresPedidos();
                break;

            case -> 3:
                GestionCitas();
                break;

            case -> 4:
                GestionInventario();
                break;

            case -> 5:
                system.out.println("saliendo del sistema");
                break;
        }
  }while (opcion !=6);
}

    public static void GestionClientes() {

        System.out.println("Gestión de clientes");
        
    }

    public static void GestionProveedoresPedidos() {

        System.out.println("Gestion de proveedores y sus pedidos");
        
    }

    public static void GestionCitas(){

        System.out.println("Gestiona las citas")
    }

    public static void Inventario() {
        
        System.out.println("Gestiona el inventario");
    }
}