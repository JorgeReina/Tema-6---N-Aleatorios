import java.util.Scanner;

/**
*
*	Ejercicio 3,  Igual que el ejercicio anterior pero con la baraja española.
* Se utilizará la barajade 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.  
* 
*	Nombre del archivo: Ejercicio3.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio3 {
	public static void main(String[] args) {

	int carta = (int)(Math.random()*10 +1);
	
	switch (carta) {
		case 1:
			System.out.print("As");
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
			System.out.print("Sota");
		break;
		case 9:
			System.out.print("Caballo");
		break;
		case 10:
			System.out.print("Rey");
		break;
	}
	
	int palo = (int)(Math.random()*4 + 1);
	
	switch (palo) {
		case 1:
			System.out.print(" Oro");
		break;
		case 2:
			System.out.print(" Copas");
		break;
		case 3:
			System.out.print(" Espadas");
		break;
		case 4:
			System.out.print(" Bastos");
		break;
	}
	
	}
}
