/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.uniminuto.main;

import co.edu.uniminuto.entity.Moneybox;
import java.util.Scanner;
//import java.util.List;
//import java.util.ArrayList;

/**
 *
 * @author jrwa2
 */
public class Main {
    /*
    6. Crear un programa que permita simular una alcancía digital. La alcancía permite gestionar
    el ingreso de monedas, el usuario en todo momento puede consultar la cantidad de dinero
    que posee y la cantidad de transacciones de ingreso y egreso de dinero y cantidad de dinero
    en cada transacción.
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        
        String menu;
        
        Moneybox piggyBank = new Moneybox();
        System.out.println("Gracias por usar nuestra alcancía digital!");
        do{
            System.out.println("Menú:");
            System.out.println("Escriba saldo (o presione 1) para conocer su saldo: ");
            System.out.println("Escriba Deposito (o presione 2) para realizar un deposito: ");
            System.out.println("Escriba Ndepositos (o presione 3) para conocer la cantidad de depositos: ");
            System.out.println("Escriba Depositos (o presione 4) para conocer el detalle de deposito: ");
            System.out.println("Escriba Nretiros (o presione 5) para conocer la cantidad de retiros: ");
            System.out.println("Escriba Retiros (o presione 6) para conocer el detalle de retiros: ");
            System.out.println("Escriba Retiro (o presione 7) para realizar un retiro: ");
            System.out.println("Escriba Salir (o presione 0) para salir de su alcancía Digital: ");
            System.out.print("Escoja su opción: ");
            menu = read.nextLine();
            while(!(menu.equalsIgnoreCase("saldo") || menu.equalsIgnoreCase("1") || menu.equalsIgnoreCase("Deposito") || menu.equalsIgnoreCase("2") || 
                    menu.equalsIgnoreCase("Ndepositos") || menu.equalsIgnoreCase("3") || menu.equalsIgnoreCase("Depositos") || menu.equalsIgnoreCase("4")
                    || menu.equalsIgnoreCase("Nretiros") || menu.equalsIgnoreCase("5") || menu.equalsIgnoreCase("Retiros") || menu.equalsIgnoreCase("6")
                     || menu.equalsIgnoreCase("Retiro") || menu.equalsIgnoreCase("7") || menu.equalsIgnoreCase("Salir") || menu.equalsIgnoreCase("0"))){
                System.out.println("Escogió una opción erronea.");
                System.out.print("Escoja su opción: ");
                menu = read.nextLine();
            }
        }while (!(menu.equalsIgnoreCase("salir")));
        
        
        
    }
    
}
