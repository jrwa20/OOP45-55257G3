/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.uniminuto.actividad3;

/**
 *
 * @author jrwa2
 */
public class Ejercicio13 {
    /*
    13. Realizar un programa que genere una matriz 7x7, inicializarla la diagonal
    principal con el número “0”(cero), el resto de las posiciones deben ser - (guion).
    Imprimir la matriz.
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[][] matrizDiagDe0 = new char[7][7];
        
        for (int i=0;i<7;i++){
            for (int j=0;j<7;j++){
                if (i==j) matrizDiagDe0[i][j]='0';
                else matrizDiagDe0[i][j]='-';
            }
        }
        
        for (int i=0;i<7;i++){
            for (int j=0;j<7;j++){
                System.out.print(matrizDiagDe0[i][j] +"  ");//Ojo al concatenar matrizDiagDe0 de primero.
            }
            System.out.println("");
       }
    }
}
