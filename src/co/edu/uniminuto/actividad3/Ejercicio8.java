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
public class Ejercicio8 {
    /*
    8. Dado N cantidad de precios de gaseosas en un supermercado el gerente de ventas
    desea que se genere un programa que le permita saber cuál de las gaseosas tiene
    el mayor precio, cuál tiene menor precio y cuál es el precio promedio. Hacer las
    impresiones según lo requerido
    */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        
        int highestPrice=0;
        int highestPricePosition=0;
        int lowestPrice=0;
        int lowestPricePosition=0;
        float averagePrice=0;
        int price;
        int numOfSamples;
        
        do{
            System.out.print("Por favor indique el numero de muestras a evaluar: ");
            numOfSamples = read.nextInt();
            if (numOfSamples==0) System.out.println("Digitó Cero Muestras lo cual no es posible para evaluar.");
            else if (numOfSamples<0){
                System.out.println("Digitó un número de muestras negativo ("+numOfSamples +") así que lo tomaré como positivo!");
                numOfSamples=numOfSamples*-1;
                System.out.println("el número de muestra tomado es: "+numOfSamples);
            }
        }while(numOfSamples<=0);
        
        for (int i=0;i<numOfSamples;i++){
            System.out.print("Por favor digite el valor de la muestra ("+(i+1)+"): ");
            price = read.nextInt();
            if (price==0)System.out.println("Esta gaseosa es gratis!!!!");
            if (price<0){
                System.out.println("OOPS!! parece que por equivocación digitaste el valor con un signo negativo, \n asumiré que fue un error y lo tomaré positivo!!!");
                price=(price-1);
            }
            averagePrice+=price; //averagePrice = averagePrice + price
            if (price>highestPrice){
                highestPrice = price;
                highestPricePosition=(i+1);
            }
            if (price<lowestPrice || lowestPrice==0){
                lowestPrice = price;
                lowestPricePosition=(i+1);
            }
        }
        averagePrice = averagePrice/numOfSamples;
        System.out.println("La gaseosa con el mayor precio fue ingresada en la posición (" +highestPricePosition +") y cuesta: "+highestPrice);
        System.out.println("La gaseosa con el menor precio fue ingresada en la posición (" +lowestPricePosition +") y cuesta: "+lowestPrice);
        System.out.println("El valor promedio de las gaseosas es: "+averagePrice);
        
        
        
    }
    
}
//Preguntar si el valor puede ser negativo si no puede ser negativo controlar cambiando a positivo.
//Se debe indicar la posición del precio mayor y menor ingresado?