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