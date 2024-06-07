/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.uniminuto.actividad3;

import java.util.Random;

/**
 *
 * @author jrwa2
 */
public class Ejercicio17 {
    /*
    17. Generar un arreglo unidimensional de 50 posiciones que se llene con valores
    aleatorios y contar la cantidad de positivos, negativos y ceros del arreglo.
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int min=-100;
        final int max=101;
        
        
        Random rand = new Random();
        
        
        int positives=0;
        int negatives=0;
        int zeros=0;
        int[] matrixRand50Pos = new int[50];
        
        for(int i=0;i<50;i++){
            matrixRand50Pos[i] = rand.nextInt(min, max); //se agregan estas dos constantes para dar un rango y aumentar la posibilidad de tener ceros...
            if (matrixRand50Pos[i]>0) positives++;
            else if (matrixRand50Pos[i]<0) negatives++;
            else zeros++;
            
            System.out.print("|\t"+matrixRand50Pos[i] +"\t");//utilizo el mismo for para ir imprimiendo la muestra.
            
            }
        System.out.println("|");
        System.out.println("\nANALISIS\nPositivos: "+positives +"\nNegativos: "+negatives +"\nCeros: " +zeros +"\n");
        
    }
    
}
