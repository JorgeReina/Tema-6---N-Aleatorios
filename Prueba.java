import java.util.Scanner;

/**
*
*	Ejemplo 1,  Ejemplo número aleatorio 1. 
* 
*	Nombre del archivo: Ejemplo1.java
*
*	@author Jorge Reina Romero
*
*/

public class Prueba {
	public static void main(String[] args) {
		
		System.out.println("Números aleatorios entre 0 y 9");
				
		for (int i = 1; i <= 10; i++) {
		
			System.out.println((int)(Math.random()*6 +1) + " ");
			
		}
		
	}
}
