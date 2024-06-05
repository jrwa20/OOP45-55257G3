/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.uniminuto.actividad3;

/**
 *
 * @author jrwa2
 */
public class Ejercicio12 {
    //12. Realizar un programa que genere una matriz 5x5, inicializarla en 2 e imprimirla.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrizDe2 = new int[5][5];
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                matrizDe2[i][j]=2;
            }
        }
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                System.out.print(matrizDe2[j][i]+"  ");
            }
            System.out.println("");
        }
    }
    
}
