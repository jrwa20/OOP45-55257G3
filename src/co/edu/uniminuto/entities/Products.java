/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.entities;

/**
 *
 * @author jrwa2
 */
public class Products {
    //1. definimos los atributos.
    private String description;
    private int quantity;
    private double price;
    
    //2. Definimos los constuctores

    public Products(String description, int quantity, double price) {
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }
    
    //3. Definimos metodos de acceso Getters y Setters

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    //4. Metodos de orden
    
    public double productTotal(){
        return (this.price*this.quantity);
    }
    
    //5. Metodo toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Descripción: ").append(description);
        sb.append("\t\tCantidad: ").append(quantity);
        sb.append("\tValor Unitario: ").append(price);
        sb.append("\t Total Producto: ").append(productTotal());
        //sb.append("\n");
        return sb.toString();
    }
        
}
