/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jrwa2
 */
public class Moneybox {
    //1. Declaramos los atributos.
    private List<Double> withdraw; //Lista de los retiros
    private List<Double> deposit; //lista de los depositos
    private double totalAmount; //saldo total
    
    //2. Definimos los constructores

    public Moneybox() {
        this.withdraw = new ArrayList<>();
        this.deposit = new ArrayList<>();
        this.totalAmount = 0;
    }
    
    //3. Definimos Metodos de acceso Getters y Setters

    /* Aunque se poede obtener la cantidad usando el metodo get, prefiero comentarlo y llamar el metodo de consulta de saldo de otra manera.
    public double getTotalAmount() {
        return totalAmount;
    }
    */

    /* Cualquier alcancía inicia en cero, la única forma de ingresar dinero es con un deposito.
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    */    

    //4. Metodos de Orden
    
    public void moneyWithdrow(double withdrawAmount){
        if(withdrawAmount>totalAmount) System.out.println("Saldo insuficiente");
        else {
            withdraw.add(withdrawAmount);
            totalAmount-=withdrawAmount;
            System.out.println("Su retiro se realizó satisfactoriamente!");
        }
    }
    
    public void moneyDeposit (double depositAmount){
        deposit.add(depositAmount);
        totalAmount+=depositAmount;
        System.out.println("Su deposito se realizó satisfactoriamente!");
    }
    
    public double withdraws(){
        return withdraw.size();
    }
    
    public void withdrawslist (){
        System.out.println("Se ha realizado "+withdraw.size()+" retiros:");
        for (double i: withdraw){
            System.out.println(i);
        }
    }
    
    public double deposits(){
        return deposit.size();
    }
    
    public void depositslist(){
        System.out.println("Se ha realizado "+deposit.size()+" consignaciones:");
        for (double i: deposit){
            System.out.println(i);
        }
    }
    
    public double balance() {
        return totalAmount;
    }
    
    
}
