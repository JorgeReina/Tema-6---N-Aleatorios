import java.util.Scanner;

/**
*
*	Ejemplo 2,  Ejemplo número aleatorio 2. 
* 
*	Nombre del archivo: Ejemplo2.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejemplo2 {
	public static void main(String[] args) {
		
		System.out.println("Números aleatorios entre 1 y 10");
				
		for (int i = 1; i <= 10; i++) {
		
			System.out.println((int)(Math.random()*10 + 1 ) + " ");
			
		}
		
	}
}
