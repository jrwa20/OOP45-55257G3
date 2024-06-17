
package co.edu.uniminuto.entidad;

public class Reserva {
    // 1. Declaracion de atributos y propiedades
    private int idReserva;
    private Habitacion habitacion;
    private Cliente cliente;
    private String fechaEntrada;
    private String fechaSalida;
    private double costoTotal;
    //2. Metodo constructor
    public Reserva(int idReserva, Habitacion habitacion, Cliente cliente, String fechaEntrada, String fechaSalida) {
        this.idReserva = idReserva;
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.costoTotal = calcularCostoTotal();
    }
    // 3. Metodos de acceso
    private double calcularCostoTotal() {
     
        return habitacion.getPrecio();
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }
    //4.Impresion de Ticket
    public void imprimirTicket(Reserva reserva) {
        System.out.println("ID de Reserva: " + reserva.getIdReserva());
        System.out.println("Número de Habitación: " + reserva.getHabitacion().getNumero());
        System.out.println("Nombre del Cliente: " + reserva.getCliente().getNombre());
        System.out.println("ID del Cliente: " + reserva.getCliente().getId());
        System.out.println("Correo electronico del Cliente: " + reserva.getCliente().getCorreo());
        System.out.println("Telefono del Cliente: " + reserva.getCliente().getTelefono());
        System.out.println("Costo Total: " + reserva.getCostoTotal());
        System.out.println();
    }
}


 

