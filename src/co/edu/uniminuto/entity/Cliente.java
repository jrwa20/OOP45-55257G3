
package co.edu.uniminuto.entidad;

public class Cliente {
    //1. Declaracion de Atributos o propiedades
    private int id;
    private String nombre;
    private String correo;
    private double telefono; // Cambiado a double

    //2. Metodo Constructor
    public Cliente(int id, String nombre, String correo, double telefono) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    //3. Métodos de acceso
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }
}