import java.util.Scanner;

/**
*
*	Ejercicio 4,  Muestra 20 números enteros aleatorios entre 0 y 10 (ambos 
*   ncluidos) separados por espacios.
* 
*	Nombre del archivo: Ejercicio4.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio4 {
    public static void main(String[] args) {
        
        for (int i = 0; i < 20; i++) {
            System.out.println((int)(Math.random()*11));
        }

    }
    
}
