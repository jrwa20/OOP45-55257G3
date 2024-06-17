/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.entities;

import java.util.Scanner;

/**
 *
 * @author jrwa2
 */
public class Clients {
    Scanner read = new Scanner(System.in);
    //1. Declaramos los atributos
    
    private String name;
    private String LastName;
    private String id;
    
    //2. Definimos los metodos constructores

    public Clients(String name, String LastName, String id) {
        this.name = name;
        this.LastName = LastName;
        this.id = id;
    }
    
    public Clients() {
        System.out.print("Por favor ingrese el nombre del cliente: ");
        this.name = read.nextLine();
        System.out.print("Por favor escriba los apellidos del cliente: ");
        this.LastName = read.nextLine();
        System.out.print("Por favor escriba la identificación del cliente: ");
        this.id = read.nextLine();
    }
    
    //3. Definimos los metodos de acceso Getters y Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    //4. Metodos de Orden
    
    //5. Metodo toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nDATOS DEL CLIENTE:");
        sb.append("\n\tNombre=").append(name);
        sb.append("\n\tApellidos=").append(LastName);
        sb.append("\n\tIdentificación=").append(id);
        sb.append("\n");
        return sb.toString();
    }
    
}
