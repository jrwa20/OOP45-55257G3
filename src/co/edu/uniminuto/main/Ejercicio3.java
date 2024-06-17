package ejercicio3;

import co.edu.uniminuto.entidad.Hotel;
import co.edu.uniminuto.entidad.Cliente;
import co.edu.uniminuto.entidad.Habitacion;
import co.edu.uniminuto.entidad.Reserva;
import java.util.Scanner;

public class Ejercicio3 {

    /**
     * Crea un sistema para gestionar reservas en un hotel. Se desea emitir un
     * ticket donde esté habitación reservada, datos personales del cliente y el
     * pago por la habitación. Crear un menú que simule gestionar habitaciones,
     * usuarios y crear la reserva (impresión de ticket).
     */
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            //1.Ciclo para mostrar menu
            System.out.println("1. Agregar Habitación");
            System.out.println("2. Agregar Cliente");
            System.out.println("3. Crear Reserva");
            System.out.println("4. Ver Reservas");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // 2. Opción para agregar una habitación al hotel
                    int numeroHabitacion = obtenerNumeroEntero(
                            "Ingrese el número de habitación: ", scanner);
                    System.out.print("Ingrese el tipo de habitación: ");
                    String tipoHabitacion = scanner.next();
                    double precio = obtenerNumeroDouble(
                            "Ingrese el precio de la habitación: ", scanner);
                    Habitacion habitacion = new Habitacion(
                            numeroHabitacion, tipoHabitacion, precio);
                    hotel.agregarHabitacion(habitacion);
                    System.out.println("Habitación agregada correctamente.");
                    break;
                case 2:
                     //3. Opción para agregar un cliente al hotel
                    int idCliente = obtenerNumeroEntero("Ingrese el ID del cliente: ", scanner);
                    String nombre = obtenerTextoSoloLetras("Ingrese el nombre del cliente: ", scanner);
                    System.out.print("Ingrese el correo electrónico del cliente: ");
                    String correoElectronico = scanner.next();
                    double telefono = obtenerNumeroDouble("Ingrese el teléfono del cliente: ", scanner);
                    Cliente cliente = new Cliente(idCliente, nombre, correoElectronico, telefono);
                    hotel.agregarCliente(cliente);
                    System.out.println("Cliente agregado correctamente.");
                    break;
                case 3:
                    //4.Opción para crear una reserva
                    int numHabitacionReserva = obtenerNumeroEntero(
                            "Ingrese el número de habitación: ", scanner);
                    int idClienteReserva = obtenerNumeroEntero(
                            "Ingrese el ID del cliente: ", scanner);
                    System.out.print(
                            "Ingrese la fecha de entrada (dd/mm/aaaa): ");
                    String fechaEntrada = scanner.next();
                    System.out.print(
                            "Ingrese la fecha de salida (dd/mm/aaaa): ");
                    String fechaSalida = scanner.next();
                    hotel.crearReserva(numHabitacionReserva,
                            idClienteReserva, fechaEntrada, fechaSalida);
                    break;
                case 4:
                    //5.Opción para mostrar las reservas existentes
                    for (Reserva reserva : hotel.reservas) {
                        reserva.imprimirTicket(reserva);
                    }
                    break;
                case 5:
                    //6.Opción para salir del programa
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }
    //7. Metodos para obtener un dato valido del usuario
    private static int obtenerNumeroEntero(String mensaje, Scanner scanner) {
        int numero;
        while (true) {
            System.out.print(mensaje);
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                break;
            } else {
                System.out.println(
                        "Entrada inválida. Por favor, ingrese un número entero.");
                scanner.next();
            }
        }
        return numero;
    }

    private static double obtenerNumeroDouble(String mensaje, Scanner scanner) {
        double numero;
        while (true) {
            System.out.print(mensaje);
            if (scanner.hasNextDouble()) {
                numero = scanner.nextDouble();
                break;
            } else {
                System.out.println(
                        "Entrada inválida. Por favor, ingrese un número válido.");
                scanner.next();
            }
        }
        return numero;
    }

    private static String obtenerTextoSoloLetras(String mensaje, Scanner scanner) {
        String texto;
        while (true) {
            System.out.print(mensaje);
            texto = scanner.next();
            if (texto.matches("[a-zA-Z]+")) {
                break;
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese solo letras.");
            }
        }
        return texto;
    }
}
