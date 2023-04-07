/*
. Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.

 */

/**
 *
 * @author Pablo
 */
public class Extras1 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        int[] vector = new int[3];
        vector[0]= 3;
        vector[1]=5;
        vector[2]=10;
        System.out.println("contenido del vector");
        
        for (int i = 0; i < 3; i++) {
            System.out.println(vector[i]);  
        }
        int suma = 0;
                for (int y = 0; y < 3; y++) {
                    suma += vector[y];
                }
            System.out.println("La suma de los elementos de un vector es :"+suma); 
    }
    
}
