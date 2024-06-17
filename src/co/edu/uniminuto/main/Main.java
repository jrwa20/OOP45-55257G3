/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.uniminuto.main;

import co.edu.uniminuto.entity.Vehicles;
import java.util.Scanner;

/**
 *
 * @author jrwa2
 */
public class Main {
    /*
    4. Un taller mecánico desea hacer cotizaciones de reparación de un vehículo, para ellos se
    necesitan los datos de los vehículos: la marca, modelo, color, año y motivo de reparación.
    Se debe pedir mano de obra del mecánico, precio total de repuestos y gatos administrativos
    que es el 15% de la obra de mano + el precio total de repuestos. En la cotización se debe
    imprimir los datos del vehículo y el detalle de la cotización y monto total.
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //boolean control; variable creada para controlar el ciclo while en caso de escribir los datos del vehiculo de manera manual.
        Scanner read = new Scanner(System.in);
        Vehicles vehiculo = new Vehicles(); //Se creó un constructor con valores por defecto para no estar escribiendo.
        System.out.println("Se tomarán los valores predeterminados:\n Marca: "+vehiculo.getBrand()+"\n Modelo: "+vehiculo.getModel()+"\n Color: "+vehiculo.getColor()+"\n Año: "+vehiculo.getYear()+"\n Motivo de Reparación: "+vehiculo.getRepairMotive());
        
        //Debido a que el ejercicio no pide que el usuario ingrese estos valores, se comenta esta parte del código que solicita los valores para sólo ser usados los valores por defecto.
        
        /*
        System.out.println("Desea ingrasar sus propios valores para el vehiculo a cotizar o tomar \nMarca Modelo, Color, año y motivo de reparación por defecto?");
        System.out.println("escruba true ingrasar los valores o False para continuar con los preestablecidos: ");
        control = read.nextBoolean();
        
        while (control){
            System.out.println("Por favor escriba la marca del vehiculo:");
            read.nextLine();
            vehiculo.setBrand(read.nextLine());
            System.out.println("Por favor escriba el modelo del Vehiculo:");
            vehiculo.setModel(read.nextLine());
            System.out.println("Por favor escriba el Color:");
            vehiculo.setColor(read.nextLine());
            System.out.println("Por favor escriba el año del Vehiculo:");
            vehiculo.setYear(read.nextInt());
            System.out.println("Por favor escriba el motivo de Reparación:");
            read.nextLine();
            vehiculo.setRepairMotive(read.nextLine());
            control = false;
        }
        */
        System.out.print("Por favor digite el valor de la mano de obra para el servicio ("+vehiculo.getRepairMotive()+"): ");
        //read.nextDouble();
        vehiculo.setLaborPrice(read.nextDouble());

        System.out.print("Por favor digite el valor total de los repuestos: para el servicio ("+vehiculo.getRepairMotive()+"): ");
        vehiculo.setSparePartsPrice(read.nextDouble());
        
        System.out.println(vehiculo.toString());
        
    }
    
}
