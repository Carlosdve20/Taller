import java.time.LocalDate;
import java.util.List;

public class Reparacion {
private int numeropedido;    
private Vehiculos vehiculo;
private Clientes cliente;
private List<Servicios> servicios;
private Empleado empleado;
private LocalDate fechaEntradaVehiculo;
private LocalDate fechaSalidaVehiculo;
private String estado;
private String comentario;

public Reparacion(int numeropedido, Vehiculos vehiculo, Clientes cliente, List<Servicios> servicios, Empleado empleado,
        LocalDate fechaEntradaVehiculo, LocalDate fechaSalidaVehiculo, String estado) {
    this.numeropedido = numeropedido;
    this.vehiculo = vehiculo;
    this.cliente = cliente;
    this.servicios = servicios;
    this.empleado = empleado;
    this.fechaEntradaVehiculo = fechaEntradaVehiculo;
    this.fechaSalidaVehiculo = fechaSalidaVehiculo;
    this.estado = estado;
}




}
