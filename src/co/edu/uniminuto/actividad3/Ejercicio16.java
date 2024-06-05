/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.uniminuto.actividad3;

/**
 *
 * @author jrwa2
 */
public class Ejercicio16 {
    /*
    16. Realizar una matriz 5x5, inicializarla totalmente en 1 y luego en la diagonal
    trasversa colocar el número cero (0). Imprimir la matriz
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] traversMatrix = new int[][]{
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1}
                };
        
/*        for (int[] row:traversMatrix){
            for(int pos:row){
                pos=1;
            }
        }
No se puede asignar valores usando foreach debido a que se pierde el indice. (https://stackoverflow.com/questions/59894380/is-there-a-way-to-assign-values-into-an-array-with-foreach#:~:text=Short%20answer%3A%20no%2C%20there%20is%20no%20way.%20Longer,using%20only%20the%20for-each%20there%20is%20no%20way.)
Inicializaré con los unos al declarar la variable, importante pues en los otros ejercicios nunca lo hice de esta manera pero sí por asiganción teniendo en cuenta el indice de la misma manera que se cambiará para la diagonal transversal. */

        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
              if ((i+j)==4) traversMatrix[i][j]=0; 
            }
        }

        for (int[] row:traversMatrix){
            for (int i:row){
                System.out.print("| " +i +" ");
            }
            System.out.println("|");
        }
        
    }
    
}
