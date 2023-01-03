import java.util.Scanner;

/**
*
*	Ejemplo 5,  Ejemplo número aleatorio 5. 
* 
*	Nombre del archivo: Ejemplo5.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejemplo5 {
	public static void main(String[] args) {
		
		System.out.println("Números aleatorios entre 0 y 3");
		
		for (int i = 1; i < 10; i++) {
			System.out.println((int)(Math.random()*4) + " ");
		}
		
	}
}
