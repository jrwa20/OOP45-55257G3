/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.entity;

import java.util.ArrayList;
import java.util.List;

/**
 ** El departamento escolar de la facultad de ingenieria necesita obtener
 * reporte global de los promedio de cada uno,nombres,apellidos, carrera y
 * semestre.Se debe imprimir el promedio global y cada uno de los datos de los
 * estudiantes
 */
public class Estudiante {

    // 1.Declaracion de atributos o propiedades
    private String nombres;
    private String apellidos;
    private String carrera;
    private String semestre;
    private double promedio;
    // 2. Metodo constructor

    public Estudiante(String nombres, String apellidos,
            String carrera, String semestre, double promedio) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.carrera = carrera;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public Estudiante() {
    }
    
    //3. Metodos de acceso

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double promediarGlobal(List<Estudiante> lista) {
        List<Estudiante> listaEstudiante = new ArrayList<>(lista);
        double suma = 0;
        for (Estudiante e : listaEstudiante) {
            suma += e.getPromedio(); //suma = suma + e.getpromedio();
        }
        return suma / listaEstudiante.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante{");
        sb.append("nombres=").append(nombres);
        sb.append(", apellidos=").append(apellidos);
        sb.append(", carrera=").append(carrera);
        sb.append(", semestre=").append(semestre);
        sb.append(", promedio=").append(promedio);
        sb.append('}');
        return sb.toString();
    }

}
