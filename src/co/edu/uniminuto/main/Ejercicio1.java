package actividadno4;

import co.edu.uniminuto.entity.Calculadora;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

    /**
     * 1.Crear una calculadora con 8 operaciones matemáticas, 
 se debe presentar un menú con el nombre de las operaciones 
 (pedir 2 números) y mostrar el resultado.Una vez mostrado 
 el resultado se debe mostrar otra vez el menú. Hacer validaciones de datos.
     */
    public static void main(String[] args) {
        //1.Creacfion de la instancia calculadora
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            //2.Creacion del menu
            System.out.println("Seleccione una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Módulo");
            System.out.println("6. Potencia");
            System.out.println("7. Raíz Cuadrada");
            System.out.println("8. Valor Absoluto");
            System.out.println("9. Salir");

            int opcion = scanner.nextInt();
            if (opcion == 9) {
                break;
            }

            double num1 = 0, num2 = 0;
            //3.Captura de numeros segun la opcion elegida
            try {
                if (opcion >= 1 && opcion <= 6) {
                    System.out.print("Ingrese el primer número: ");
                    num1 = obtenerNumero(scanner);

                    System.out.print("Ingrese el segundo número: ");
                    num2 = obtenerNumero(scanner);
                } else if (opcion == 7 || opcion == 8) {
                    System.out.print("Ingrese el número: ");
                    num1 = obtenerNumero(scanner);
                } else {
                    System.out.println("Opción no válida.");
                    continue;
                }
            //4.Ejecucion de la opercaion elegida
                switch (opcion) {
                    case 1:
                        calculadora.calcularSuma(num1, num2);
                        System.out.println("Resultado: " 
                                + calculadora.getSuma());
                        break;
                    case 2:
                        calculadora.calcularResta(num1, num2);
                        System.out.println("Resultado: " 
                                + calculadora.getResta());
                        break;
                    case 3:
                        calculadora.calcularMultiplicacion(num1, num2);
                        System.out.println("Resultado: " 
                                + calculadora.getMultiplicacion());
                        break;
                    case 4:
                        calculadora.calcularDivision(num1, num2);
                        System.out.println("Resultado: " 
                                + calculadora.getDivision());
                        break;
                    case 5:
                        calculadora.calcularModulo(num1, num2);
                        System.out.println("Resultado: " 
                                + calculadora.getModulo());
                        break;
                    case 6:
                        calculadora.calcularPotencia(num1, num2);
                        System.out.println("Resultado: " 
                                + calculadora.getPotencia());
                        break;
                    case 7:
                        calculadora.calcularRaizCuadrada(num1);
                        System.out.println("Resultado: " 
                                + calculadora.getRaizCuadrada());
                        break;
                    case 8:
                        calculadora.calcularAbsoluto(num1);
                        System.out.println("Resultado: " 
                                + calculadora.getAbsoluto());
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println(
                        "Entrada inválida. Por favor ingrese un número.");
                scanner.next(); 
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
        System.out.println("Gracias por usar la calculadora.");
    }
    //5.metodo para obtener un numero valido del usuario
    private static double obtenerNumero(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Entrada inválida. Por favor ingrese un número: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}