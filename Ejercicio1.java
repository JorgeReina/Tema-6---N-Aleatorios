import java.util.Scanner;

/**
*
*	Ejercicio 1,  Escribe un programa que muestre la tirada de tres dados.
* Se debe mostrar también la suma total (los puntos que suman entre los 
* tres dados). 
* 
*	Nombre del archivo: Ejercicio1.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio1 {
	public static void main(String[] args) {
		
		int dado1 = (int)(Math.random()*6 + 1);
		
		int dado2 = (int)(Math.random()*6 + 1);
		
		int dado3 = (int)(Math.random()*6 + 1);
		
		int suma = dado1 + dado2 + dado3;
		
		System.out.printf("El dado 1 ha dado: %s\n", dado1);
		System.out.printf("El dado 2 ha dado: %s\n", dado2);
		System.out.printf("El dado 3 ha dado: %s\n", dado3);
		
		System.out.printf("Los puntos que sumán en total son: %s", suma);
		
	}
}
		
