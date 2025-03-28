import java.time.LocalDate;
import java.util.List;

public class PedidoPiezas {
private int numeropedido;
 private Proveedores proveedor;
    private List<Inventario> piezasSolicitadas;
    private LocalDate fechaPedido;
    private LocalDate fechaEntregaEstimada;
    private LocalDate fechaEntregaReal;
    private String estado;
    private String comentario;
   
   
    public PedidoPiezas() {
    }


    public PedidoPiezas(int numeropedido, Proveedores proveedor, List<Inventario> piezasSolicitadas,
            LocalDate fechaPedido, LocalDate fechaEntregaEstimada, LocalDate fechaEntregaReal, String estado,
            String comentario) {
        this.numeropedido = numeropedido;
        this.proveedor = proveedor;
        this.piezasSolicitadas = piezasSolicitadas;
        this.fechaPedido = fechaPedido;
        this.fechaEntregaEstimada = fechaEntregaEstimada;
        this.fechaEntregaReal = fechaEntregaReal;
        this.estado = estado;
        this.comentario = comentario;
    }


    public int getNumeropedido() {
        return numeropedido;
    }


    public void setNumeropedido(int numeropedido) {
        this.numeropedido = numeropedido;
    }


    public Proveedores getProveedor() {
        return proveedor;
    }


    public void setProveedor(Proveedores proveedor) {
        this.proveedor = proveedor;
    }


    public List<Inventario> getPiezasSolicitadas() {
        return piezasSolicitadas;
    }


    public void setPiezasSolicitadas(List<Inventario> piezasSolicitadas) {
        this.piezasSolicitadas = piezasSolicitadas;
    }


    public LocalDate getFechaPedido() {
        return fechaPedido;
    }


    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }


    public LocalDate getFechaEntregaEstimada() {
        return fechaEntregaEstimada;
    }


    public void setFechaEntregaEstimada(LocalDate fechaEntregaEstimada) {
        this.fechaEntregaEstimada = fechaEntregaEstimada;
    }


    public LocalDate getFechaEntregaReal() {
        return fechaEntregaReal;
    }


    public void setFechaEntregaReal(LocalDate fechaEntregaReal) {
        this.fechaEntregaReal = fechaEntregaReal;
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


    @Override
    public String toString() {
        return "PedidoPiezas [numeropedido=" + numeropedido + ", proveedor=" + proveedor + ", piezasSolicitadas="
                + piezasSolicitadas + ", fechaPedido=" + fechaPedido + ", fechaEntregaEstimada=" + fechaEntregaEstimada
                + ", fechaEntregaReal=" + fechaEntregaReal + ", estado=" + estado + ", comentario=" + comentario + "]";
    }
    
    
}
