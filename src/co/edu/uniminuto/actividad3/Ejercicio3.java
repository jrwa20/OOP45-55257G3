/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.uniminuto.actividad3;

import java.util.Scanner;

/**
 *
 * @author jrwa2
 */
public class Ejercicio3 {
    //3.Hacer un programa en Java que, dado un rango, por el usuario, se da número
    //inicial y uno final (tomar en cuenta que el inicial debe ser menor que el final, hacer
    //la validación y volver a pedir los dos números si no cumple la condición) y sume
    //los números pares dentro del rango incluyendo el valor inicial y final.
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        
        int initialNumber=0;
        int finalNumber=0;
        int sumNumbers=0;
        
        do{
            if (initialNumber>=finalNumber){
                System.out.println("Usted digitó el número inicial mayor al final");
                System.out.println("Digitelos nuevamente de forma correcta!!!");
            }
            System.out.print("Por favor digite el número Inicial: ");
            initialNumber = read.nextInt();
            System.out.println("Por favor digite el número Final");
            System.out.println("Recuerde que este debe ser mayor que "+initialNumber +" : ");
            finalNumber = read.nextInt();
        }while (initialNumber>=finalNumber);
        
        while (initialNumber<=finalNumber){
            if (initialNumber%2 == 0){
                sumNumbers+=initialNumber;
            }
            initialNumber++;
        }
        System.out.println("La suma de los Números pares es: " +sumNumbers);
    }
    
}
