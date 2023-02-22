import java.util.Scanner;

/**
*
*	Ejercicio 6,  Escribe un programa que piense un número al azar entre 0 y 100. 
*   El usuario debe adivinarlo y tiene para ello 5 oportunidades. Después de cada 
*   intento fallido,el programa dirá cuántas oportunidades quedan y si el número 
*   introducido es menor o mayor que el número secreto.
* 
*	Nombre del archivo: Ejercicio6.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);

        int numero = (int)(Math.random()*101);
        int contador = 4;

        System.out.println("Introduce un número al azar entre el 0 y el 100: ");
        

        for (int i = 0; i < 5; i++) {
            int x = datos.nextInt();
            if (numero == x) {
                System.out.printf("Has acertado, el número era %s\n", numero);
            } if (contador == 0) {
                System.out.printf("Nos has acertado. GAME OVER");
            } else {
                System.out.printf("No has acertado! Aun te quedan %s intentos\n", contador);
            }
            contador -= 1;
        }

    }
}
