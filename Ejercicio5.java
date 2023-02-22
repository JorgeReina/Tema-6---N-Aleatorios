import java.util.Scanner;

/**
*
*	Ejercicio 5,  Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) 
*   separados por espacios. Muestra también el máximo, el mínimo y la media
*   de esos números.
* 
*	Nombre del archivo: Ejercicio5.java
*
*	@author Jorge Reina Romero
*
*/
public class Ejercicio5 {
    public static void main(String[] args) {
        
        for (int i = 100; i < 199; i++) {
            System.out.println((int)(Math.random()*99 +100));
        }

    }
}
