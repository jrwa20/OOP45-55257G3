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
public class Ejercicio9 {
    //9. Leer N cantidad de notas (validar rango de notas), imprimir el promedio de las
    //notas, la nota más alta y la más baja.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        
        double numOfGrades;
        double averageGrade=0;
        double higherGrade=0;
        double lowerGrade=5;
        double grade;
        
        do{
            System.out.print("Por favor digita la cantidad de notas a evaluar: ");
            numOfGrades = read.nextDouble();
            if (numOfGrades<=0)System.out.println("Ingresaste una cantidad invalida para evaluar.");
        }while(numOfGrades <= 0);
        
        for (int i=0; i<numOfGrades;i++){
            System.out.print("Por favor digita la nota ("+(i+1)+") de ("+numOfGrades +"): ");
            grade = read.nextDouble();
            while (grade<0||grade>5){
                System.out.println("La nota ingresada no cumple con los parametros requeridos \nRecuerda que debe ser un valor entre 0 y 5.");
                System.out.print("Por favor digita nuevamente la nota ("+(i+1)+") de ("+numOfGrades +"): ");
                grade = read.nextDouble();
            }
            averageGrade+=grade;
            if (higherGrade<grade)higherGrade=grade;
            if (lowerGrade>grade)lowerGrade=grade;
        }
        averageGrade/=numOfGrades;
        System.out.println("La mayor nota fue: "+higherGrade);
        System.out.println("La menor nota fue: "+lowerGrade);
        System.out.println("El promedio de las notas evaluadas es: " +averageGrade);
        
    }
    
}
