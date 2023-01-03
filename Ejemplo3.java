import java.util.Scanner;

/**
*
*	Ejemplo 3,  Ejemplo número aleatorio 3. 
* 
*	Nombre del archivo: Ejemplo3.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejemplo3 {
	public static void main(String[] args) {
		
		System.out.println("Números aleatorios entre 0 y 10");
				
		for (int i = 1; i <= 10; i++) {
		
			System.out.println((int)(Math.random()*11 ) + " ");
			
		}
		
	}
}
