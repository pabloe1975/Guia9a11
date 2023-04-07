/*
 Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 */

/**
 *
 * @author Pablo
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        int [] vector = new int [100];
        int aux = 100;
        
        for ( int i = 0; i < 100; i++) { //  FOR para rellenar un vector
            vector[i] = aux;
            aux--;
            
            System.out.println("["+vector[i]+"]");
        }
    }
    
}