
import java.util.Random;

/*
Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.
 */

/**
 *
 * @author Pablo
 */
public class Extras5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Random randon = new Random();
		//Creamos una matriz cuadrada de tamanio 5 x 5, es decir, 5 filas y 5 columnas
		int [][] matriz = new int [3][3];
                int suma;
                suma=0;
		// dos for para recorrer cada posicion de la matriz y agregar el numero
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				//asignacion de numero aleatorio
				matriz[i][j] = randon.nextInt(10);
			}
		}
		//imprimir respuesta
		String respuesta = "";
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				respuesta = respuesta +" "+ matriz[i][j];
                                suma += matriz [i][j];
			}
			respuesta = respuesta + "\n";
		}
		System.out.println(respuesta);
                System.out.println("La suma de los elementos de la matriz es "+suma);
    }
  
}

 