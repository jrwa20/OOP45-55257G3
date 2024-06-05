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
public class Ejercicio2 {
    //2.Hacer un programa en Java que cuente y sume los múltiplos de 5 y 3 (para ser
    //sumado debe verificarse que sea múltiplo de 5 y 3 a la vez) comprendidos entre 1
    //y n (n es determinado por el usuario). Imprimir la cantidad de múltiplos de 5 y 3.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // TODO code application logic here
        
        int topNumber=0;
        int sumAcumulator=0;
        
        System.out.print("Por favor digite el número hasta donde desea calcular los múltipos de 5 y 3: ");
        topNumber = read.nextInt();
        
        for (int i=1;i<=topNumber;i++){
            if (i%3==0 && i%5==0){
                sumAcumulator+=i;
                System.out.println(+i +" ");
            }
        }
        System.out.println("La suma de los Digitos multiplos de 3 y 5, entre 1 y " +topNumber +" es: " +sumAcumulator );
    }
    
}
