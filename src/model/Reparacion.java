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

    public int getNumeropedido() {
        return numeropedido;
    }

    public void setNumeropedido(int numeropedido) {
        this.numeropedido = numeropedido;
    }

    public Vehiculos getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculos vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public List<Servicios> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicios> servicios) {
        this.servicios = servicios;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public LocalDate getFechaEntradaVehiculo() {
        return fechaEntradaVehiculo;
    }

    public void setFechaEntradaVehiculo(LocalDate fechaEntradaVehiculo) {
        this.fechaEntradaVehiculo = fechaEntradaVehiculo;
    }

    public LocalDate getFechaSalidaVehiculo() {
        return fechaSalidaVehiculo;
    }

    public void setFechaSalidaVehiculo(LocalDate fechaSalidaVehiculo) {
        this.fechaSalidaVehiculo = fechaSalidaVehiculo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }



}
