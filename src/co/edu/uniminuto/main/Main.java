/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.uniminuto.main;

import co.edu.uniminuto.entities.Clients;
import co.edu.uniminuto.entities.Products;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    5. Calcular el valor a pagar de un cliente por su compra, se desea saber los productos que ha
    comprado: precio, cantidad, descripción. También el total a pagar y cálculo de impuestos,
    adicional se debe tener el nombre, apellidos y documento del cliente.
*/

//Pendientes

/**
 *
 * @author jrwa2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double taxes=0.19;
        
        Scanner read = new Scanner(System.in);
        
        String descripcion;
        int cantidad;
        double precio;
        String outOfProducts;
        double precioTotal=0;
        // TODO code application logic here
        
        Clients cliente = new Clients();
        
        List<Products> product = new ArrayList<>();
        
        do{
            System.out.print("Por favor escriba la descripción del producto: ");
            descripcion = read.nextLine();
            System.out.print("Por favor escriba la cantidad de (" +descripcion +"): ");
            cantidad = read.nextInt();
            System.out.print("Por favor escriba el precio del producto (" +descripcion +"):");
            precio = read.nextDouble();
            System.out.print("Desea agregar algún otro producto? (escriba si o no): ");
            outOfProducts = read.nextLine();
            while(!((outOfProducts.equalsIgnoreCase("si")) || (outOfProducts.equalsIgnoreCase("no")))){
                System.out.println("escribió una opción incorrecta.");
                System.out.print("Desea agregar algún otro producto? (escriba si o no): ");
                outOfProducts = read.nextLine();                
            }
            product.add(new Products(descripcion,cantidad,precio));
        }while(outOfProducts.equalsIgnoreCase("si"));
        
       
        
        //Impresión
        System.out.println(cliente.toString());
        for (Products products: product){
            System.out.println(products.toString());;
            precioTotal+=products.productTotal();
        }
        System.out.print("\nSubTotal: "+precioTotal);
        System.out.print("\nImpuestos: "+(precioTotal*taxes));
        System.out.println("\nTotal a pagar: "+(precioTotal*(1+taxes))+"\\n");
        
        
    }
    
}
