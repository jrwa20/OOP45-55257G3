
package co.edu.uniminuto.entidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel {
    
    private List<Habitacion> habitaciones;
    private List<Cliente> clientes;
    public List<Reserva> reservas;

    public Hotel() {
        //1.Listas
        this.habitaciones = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }
    //2.Metodos de Hotel
    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void crearReserva(int numeroHabitacion, int idCliente, String fechaEntrada, String fechaSalida) {
        Habitacion habitacion = buscarHabitacion(numeroHabitacion);
        Cliente cliente = buscarCliente(idCliente);
        if (habitacion != null && cliente != null) {
            Reserva reserva = new Reserva(reservas.size() + 1, habitacion, cliente, fechaEntrada, fechaSalida);
            reservas.add(reserva);
            habitacion.setReservada(true); // Marcar la habitación como reservada
        } else {
            System.out.println("Habitación o cliente no encontrado.");
        }
    }

    private Habitacion buscarHabitacion(int numeroHabitacion) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numeroHabitacion) {
                return habitacion;
            }
        }
        return null;
    }

    private Cliente buscarCliente(int idCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == idCliente) {
                return cliente;
            }
        }
        return null;
    }

}