/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.uniminuto.actividad3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jrwa2
 */
public class Ejercicio18 {
    /*
    18. Generar una matriz nxn (dado por el usuario) el valor de n debe ser mayor a 2 y
    menor a 10 y llenarla con números aleatorios.
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner read = new Scanner(System.in);
        Random rand = new Random();
        
        int size=0;
        
        do{
            System.out.print("Digite el tamaño de la matriz (Cuadrada - valor entre 2 y 10): ");
            size = read.nextInt();
            if (size<2||size>10) {
                System.out.println("Al parecer usted digitó ("+size +")\nEste valor no está dentro del rango válido.\nPor favor vuelva a intentarlo.");
            }
        }while (size<2||size>10);
        
        int[][] dinamicSizeMatrix = new int[size][size];
        
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                dinamicSizeMatrix[i][j]=rand.nextInt();
            }
        }
        System.out.println("\nMatriz generada:\n");
        for (int[] row:dinamicSizeMatrix){
            for (int i:row){
                System.out.print("|\t" +i +"\t");
            }
            System.out.println("|");
        }
        System.out.println("");
    }
    
}
