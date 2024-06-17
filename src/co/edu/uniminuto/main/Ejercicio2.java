
package ejercicio2;

import co.edu.uniminuto.entity.Estudiante;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Ejercicio2 {

    /**
     * El departamento escolar de la facultad de
     * ingenieria necesita obtener reporte global de 
     * los promedio de cada uno,nombres,apellidos,
     * carrera y semestre.Se debe imprimir el promedio 
     * global y cada uno de los datos de los estudiantes
     */
    public static void main(String[] args) {
        //1.Declaracion de variables
        List<Estudiante> listEstudiantes = new ArrayList<>();//Lista para 
        //almacenar los objetos tipo Estudiante
        short opcion = 0;
        double promedio =0;
        String nombre ="";
        String apellido ="";
        String carrera ="";
        String semestre ="";
        Estudiante estudiante; //Declaracion de objeto de tipo de estudainte
        try{
            do{
                //2.Ciclo para agregacion de Estudiantes
                nombre =JOptionPane.showInputDialog("Dame tus Nombres:");
                apellido =JOptionPane.showInputDialog("Dame tus Apellido:");
                carrera =JOptionPane.showInputDialog("Dame tu Carrera:");
                semestre =JOptionPane.showInputDialog("Dame tu Semestre:");
                promedio =Double.parseDouble(
                        JOptionPane.showInputDialog("Dame un Promedio:"));
                //3.Validacion del promedio
                if((promedio>=0)&&(promedio<=5)){
                    estudiante = new Estudiante(
                            nombre, apellido, carrera, semestre, promedio);
                    listEstudiantes.add(estudiante);
                }else{
                    JOptionPane.showMessageDialog(null,"Valor fuera de rango");
                }
                opcion = Short.parseShort(JOptionPane.showInputDialog(
                        "Si no desea seguir agregando promedio presione 0"));
            }while(opcion !=0);
        }catch(Exception e){
            System.out.println("Error en Captura de datos"+e.getMessage());
        }
        //4. Impresion 
        for(Estudiante e:listEstudiantes){
            System.out.println(e);
        } 
        estudiante = new Estudiante();
        double avgGlobal= estudiante.promediarGlobal(listEstudiantes);
        System.out.println("promedio Global:"+avgGlobal);
    }
}