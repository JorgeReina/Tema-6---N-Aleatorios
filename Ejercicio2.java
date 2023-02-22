import java.util.Scanner;

/**
*
*	Ejercicio 2,  Realiza un programa que muestre al azar el nombre de una
* carta de la baraja francesa.  
* 
*	Nombre del archivo: Ejercicio2.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio2 {
	public static void main(String[] args) {

	int carta = (int)(Math.random()*13 +1);
	
	switch (carta) {
		case 1:
			System.out.print("A");
		break;
		case 2:
			System.out.print("2");
		break;
		case 3:
			System.out.print("3");
		break;
		case 4:
			System.out.print("4");
		break;
		case 5:
			System.out.print("5");
		break;
		case 6:
			System.out.print("6");
		break;
		case 7:
			System.out.print("7");
		break;
		case 8:
			System.out.print("8");
		break;
		case 9:
			System.out.print("9");
		break;
		case 10:
			System.out.print("10");
		break;
		case 11:
			System.out.print("J");
		break;
		case 12:
			System.out.print("Q");
		break;
		case 13:
			System.out.print("K");
		break;
	}
	
	int palo = (int)(Math.random()*4 + 1);
	
	switch (palo) {
		case 1:
			System.out.print(" Picas");
		break;
		case 2:
			System.out.print(" Corazones");
		break;
		case 3:
			System.out.print(" Diamantes");
		break;
		case 4:
			System.out.print(" Treboles");
		break;
	}

	}
}
