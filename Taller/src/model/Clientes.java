public class Clientes {
 private String dni;
 private String nombre;
 private String apellido;
 private String telefono;
 private String correoElectronico;
 private String direccion;

 
    public Clientes(String apellido, String correoElectronico, String direccion, String dni, String nombre, String telefono) {
        
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        
    }

}

