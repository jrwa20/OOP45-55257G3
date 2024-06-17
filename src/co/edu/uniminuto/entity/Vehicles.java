/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.entity;

/**
 *
 * @author jrwa2
 */
public class Vehicles {
    private final double percentage=0.15;// Declaro constante con el valor del porcentaje para los gastos administrativos.

    //1. Declaramos los atributos
    
    private String brand;
    private String model;
    private String colour;
    private int year;
    private String repairMotive;
    private double laborPrice=0;
    private double sparePartsPrice=450000; //Se establece el valor por defecto para el mantenimiento.
    private double adminExpenses=0;
    
    
    //2. Definimos los constructores

    public Vehicles(String brand, String model, String color, int year, String repairMotive, double laborPrice, double sparePartsPrice, double adminExpenses) {
        this.brand = brand;
        this.model = model;
        this.colour = color;
        this.year = year;
        this.repairMotive = repairMotive;
        this.laborPrice = laborPrice;
        this.sparePartsPrice = sparePartsPrice;
        this.adminExpenses = adminExpenses;
    }
    
    public Vehicles(String brand, String model, String color, int year, String repairMotive) {
        this.brand = brand;
        this.model = model;
        this.colour = color;
        this.year = year;
        this.repairMotive = repairMotive;
    }
    
        public Vehicles() {
        this.brand = "Nissan";
        this.model = "March";
        this.colour = "Plata";
        this.year = 2018;
        this.repairMotive = "Mantenimiento Preventivo.";
    }
    
    //3. Definimos metodos de acceso Getters y Setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return colour;
    }

    public void setColor(String color) {
        this.colour = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRepairMotive() {
        return repairMotive;
    }

    public void setRepairMotive(String repairMotive) {
        this.repairMotive = repairMotive;
    }

    public double getLaborPrice() {
        return laborPrice;
    }

    public void setLaborPrice(double laborPrice) {
        this.laborPrice = laborPrice;
    }

    public double getSparePartsPrice() {
        return sparePartsPrice;
    }

    public void setSparePartsPrice(double sparePartsPrice) {
        this.sparePartsPrice = sparePartsPrice;
    }

    public double getAdminExpenses() {
        return adminExpenses;
    }

    public void setAdminExpenses(double adminExpenses) {
        this.adminExpenses = adminExpenses;
    }
    
    //4. Metodos de Orden
    
    public void adminExpensesCalculation(){
        this.adminExpenses= (this.laborPrice * percentage) + sparePartsPrice;
    }
    
    public double totalCalculation(){
        return this.adminExpenses+this.laborPrice+this.sparePartsPrice;
    }
    
    //5. Metodo toString.

    @Override
    public String toString() { //Se modifica el toString para imprimir de acuerdo a lo solicitado.
        StringBuilder sb = new StringBuilder();
        sb.append("\n\nCOTIZACIÓN: \n");
        sb.append("\t Marca = ").append(brand);
        sb.append(" - Modelo = ").append(model);
        sb.append("\n\t Color = ").append(colour);
        sb.append(" - year = ").append(year);
        sb.append("\n\t Motivo de Reparacion = ").append(repairMotive);
        sb.append("\nGASTOS\n");
        sb.append("\t Mano de obra = ").append(laborPrice);
        sb.append("\n\t Precio total de repuestos = ").append(sparePartsPrice);
        adminExpensesCalculation();
        sb.append("\n\t gastos administrativos = ").append(adminExpenses);
        sb.append("\n\t Total = ").append(totalCalculation());
        sb.append("\nGracias por tenernos en cuenta.\nLe esperamos con nuestro servicio y costos insuperables!\n\n");
        return sb.toString();
    }
    
}
