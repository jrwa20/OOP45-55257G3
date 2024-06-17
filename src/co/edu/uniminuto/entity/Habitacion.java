
package co.edu.uniminuto.entidad;

public class Habitacion {
    //1. Declaracion de atributos o propiedades
    private int numero;
    private String tipo;
    private double precio;
    private boolean reservada;
    //2. Metodo Constructor
    public Habitacion(int numero, String tipo, double precio) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
        this.reservada = false; // Por defecto, la habitación no está reservada
    }

    //3. Métodos de acceso
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isReservada() {
        return reservada;
    }

    public void setReservada(boolean reservada) {
        this.reservada = reservada;
    }
}