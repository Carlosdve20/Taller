import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Citas {
    private List<Citas> citas;  // Lista para almacenar citas
    private Scanner scanner;

    public Citas() {
        this.citas = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void gestionarCitas(int opcion2) {
        if (opcion2 == 1) {//registra la cita
            System.out.print("Nombre del Cliente: ");
            String nombre = scanner.nextLine();
            Clientes cliente = new Clientes();

            System.out.print("Matrícula del Vehículo: ");
            String matricula = scanner.nextLine();
            Vehiculos vehiculo = new Vehiculos();

            System.out.print("Fecha de la cita (DD/MM/AAAA): ");
            String fecha = scanner.nextLine();

            Citas nuevaCita = new Citas();
            citas.add(nuevaCita);
            System.out.println("Cita registrada correctamente.");

        } else if (opcion2 == 2) { // Revisar citas
            if (citas.isEmpty()) {
                System.out.println("No hay citas registradas.");
            } else {
                System.out.println("Listado de Citas:");
                for (Citas c : citas) {
                    
                }
            }
        } else {
            System.out.println("Opción no válida.");
        }
    }

    private static class Clientes {

        public Clientes() {
        }
    }
}
