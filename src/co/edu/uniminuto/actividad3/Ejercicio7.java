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
public class Ejercicio7 {
    //7. Realizar un programa en Java que dado n cantidad de números determine si es
    //primo o no y si ese número primo es múltiplo de 3, se debe contar. Imprimir
    //cantidad de primos y cantidad de múltiplos de 3.
    
    /*Programa que solicita una cantidad de número dados por el usuario, 
    evalúa si cada número es primo o si es multiplo de 3 y al final
    imprime la cantidad de números primos y la cantidad de multiplos de 3 digitados.
    */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        
        int numberLot=0;
        int number=0;
        int primes=0;
        int primeIf;
        int multiples=0;
        final int multiple=3;
        do{
            System.out.println("Por favor digita la cantidad de números a evaluar ");
            System.out.print("(Recuerda usar valores mayores a cero, ojalá mayores a 2): ");
            numberLot=read.nextInt();
        }while(numberLot<=0);
        for (int i=0;i<numberLot;i++){
            System.out.print("Ingrese el número ("+(i+1) +" de " +numberLot +") a evaluar: ");
            number = read.nextInt();
            primeIf=0;
            for(int j=number;j>1;j--){
                if (number % j == 0){
                    primeIf++;
                }
            }
            if (primeIf == 1){
                    primes++;
                    System.out.println("el Número "+number +" es primo.");
                }
            if (number%multiple == 0){
                    multiples++;
                    System.out.println("El número "+number +" Es multiplo de 3.");
            }
        }
        System.out.println("El usuario ingresó "+primes +" números primos y "+multiples +" multiplos de 3.");
    }
    
}
