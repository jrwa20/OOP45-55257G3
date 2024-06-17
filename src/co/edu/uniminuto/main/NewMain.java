/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.uniminuto.main;

import java.util.Scanner;

/**
 *
 * @author jrwa2
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        
        String name;
        System.out.print("Por favor escribe tu nombre: ");
        name = read.nextLine();
        System.out.println("Tu nombre es: "+name);
        }
    
}
