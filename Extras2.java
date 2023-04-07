
import java.util.Arrays;

/*
 Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).

 */

/**
 *
 * @author Pablo
 */
public class Extras2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vector1[] = {3,2,3};
        int vector2[] = {1,2,3};
                System.out.println("contenido del vector");
        
        for (int i = 0; i < 3; i++) {
            System.out.println(vector1[i]);  
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(vector2[i]);  
        }
        System.out.println("Los vectores son iguales: "+Arrays.equals(vector2, vector1));
        System.out.println();
      
        
        }
      
    }
    

