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
public class Ejercicio1 {
    //1. Hacer un programa en Java que sume los siguientes 25 impares que le siguen al
    //número n (n es determinado por el usuario). Imprimir los 25 impares y la suma.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int acumuladorImpares=0;
        int numero;
        int contadorImpares=25;
        Scanner read = new Scanner(System.in);
        System.out.println("Digita el numero: ");
        numero = read.nextInt();
        do {
            if(numero%2!=0){
                acumuladorImpares+=numero;
                System.out.println(+((25-contadorImpares)+1) +". "+numero);
                contadorImpares--;
                numero++;
            }
            else{
                numero++;
            }
        }while(contadorImpares>0);
        System.out.println("EL total es: "+acumuladorImpares);
    }
    
}
