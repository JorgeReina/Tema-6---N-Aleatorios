import java.util.Scanner;

/**
*
*	Ejemplo 4,  Ejemplo número aleatorio 4. 
* 
*	Nombre del archivo: Ejemplo4.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejemplo4 {
	public static void main(String[] args) {
		
		System.out.println("Números aleatorios entre 40 y 50");
		
		for (int i = 1; i < 10; i++) {
			System.out.println((int)(Math.random()*11 + 40) + " ");
		}
		
	}
}
