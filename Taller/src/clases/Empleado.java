public class Empleado {
private int id;
private String DNI;
private String nombre;
private String apellido;
private String telefono;
private double sueldo;
private String puesto;

    public Empleado(String DNI, String apellido, int id, String nombre, String puesto, double sueldo, String telefono) {
        this.DNI = DNI;
        this.apellido = apellido;
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.sueldo = sueldo;
        this.telefono = telefono;
    }

}

