
import java.util.Random;

/*
Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.

 */

/**
 *
 * @author Pablo
 */
public class Extras3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector;
        vector = new int[10];
     
        for(int i=0; i<vector.length; i++){
            int aleat = (int)(Math.random() * 10 + 1);
            System.out.println(""+aleat);   
        }
    }
}

   

    
    
        
 
