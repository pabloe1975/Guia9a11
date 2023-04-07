/*
 Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).

 */

/**
 *
 * @author Pablo
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int[][] matriz = new int[3][3];
        int[][] matrizT = new int[3][3];
        int cont=0;
        
        /*matriz[0][0]=0;
        matriz[0][1]=-2;
        matriz[0][2]=4;
        matriz[1][0]=2;
        matriz[1][1]=0;
        matriz[1][2]=2;
        matriz[2][0]=-4;
        matriz[2][1]=-2;
        matriz[2][2]=0;*/
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=(int)(Math.random()*19)-9;
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizT[i][j]=matriz[j][i];
                System.out.print(matrizT[i][j]+" ");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(matriz[i][j]==matrizT[i][j] || -matriz[i][j]==matrizT[i][j]){
                    cont++;
                }
            }
        }
        
        if(cont==9){
            System.out.println("La matriz es antisimetrica");
        }else{
            System.out.println("La matriz no es antisimetrica");
        }
    }
    
}
