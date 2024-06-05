/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.uniminuto.actividad3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jrwa2
 */
public class Ejercicio15 {
    /*
    15. Realizar un programa que genere una matriz 5x6 y se rellene dinámicamente con
    los números impares partiendo desde n (n es dada por el usuario) y se imprima.
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        
        int numeroInicial;
        int[][] matrix5By6 = new int[6][5];
        
        System.out.print("Por favor ingrese el número desde donde debe iniciar el llenado de la matriz: ");
        numeroInicial = read.nextInt();
        
        for (int i=0;i<6;i++){
            for (int j=0;j<5;j++){
                if(numeroInicial%2!=0){
                    matrix5By6[i][j]=numeroInicial;
                    numeroInicial++;
                }
                else {
                    numeroInicial++;
                    matrix5By6[i][j]=numeroInicial;
                    numeroInicial++;
                }
                //System.out.println(matrix5By6[i][j]);//Creado para hayar problemas de doble impar
            }
        }
        System.out.println("");
        for (int[] row : matrix5By6) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("");
        for (int[] row:matrix5By6){
            for (int i:row){
                System.out.print("|\t" +i +"\t");
            }
            System.out.println("|");
        }
        
    }
    
}
