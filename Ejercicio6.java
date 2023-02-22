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
        boolean acertado = false;

        System.out.println(numero);

        System.out.println("Introduce un número al azar entre el 0 y el 100: ");
        
        if (acertado == false) {
            

            for (int i = 0; i < 5; i++) {

                //Introducimos el numero.
                int x = datos.nextInt();

                //Si el x es igual al numero, acertado es true y acaba el bucle.
                if (numero == x) {
                    acertado = true;
                    i = 5;
                } 
                
                //El resto del codigo se ejecuta si no hemos adivinado el número.
                if (contador == 0 && acertado == false) {
                    System.out.println("Nos has acertado. GAME OVER");
                    System.out.printf("El número era %d", numero);
                } 
                
                if (acertado == false) {
                    System.out.printf("No has acertado! Aun te quedan %s intentos\n", contador);
                }

                if (numero > x && contador > 0) {
                    System.out.printf("El número es mayor a %d", x);
                }
                if (numero < x && contador > 0) {
                    System.out.printf("El número es menor a %d", x);
                }
                contador -= 1;
                System.out.println();
            }

        } 
        
        if (acertado == true) {
            System.out.printf("Has acertado, el número era %s\n", numero);
        }

    }
}
