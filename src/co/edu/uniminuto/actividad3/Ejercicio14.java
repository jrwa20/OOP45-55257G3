/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.uniminuto.actividad3;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author jrwa2
 */
public class Ejercicio14 {
    /*
    14. Realizar un programa que genere un arreglo de 50 posiciones y se rellene de con
    la función ramdom de Java (los números deben ser 1 a 99), luego de llenar hacer
    la impresión de la matriz.
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        int [] arrayDe50 = new int[50];
        
        for (int i=0;i<50;i++){
            arrayDe50[i]=rand.nextInt(100);
            System.out.print("|" +arrayDe50[i]);
            if (i==49) System.out.println("|\n");
        }
        
        System.out.println(Arrays.toString(arrayDe50));
        
    }
    
}
