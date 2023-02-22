import java.util.Scanner;

/**
*
*	Ejercicio 9,  Realiza un programa que vaya generando números aleatorios pares entre 0 
* y 100 y que no termine de generar números hasta que no saque el 24. El 
* programa deberá decir al final cuántos números se han generado.
* 
*	Nombre del archivo: Ejercicio9.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio9 {
  public static void main(String[] args) {

    int x = 2;
    int contador = 0;
    
    while (x != 24) {
      x = (int)(Math.random()*101);
      if (x%2 == 0) {
        System.out.println(x);
        contador += 1;
      }
    }

    System.out.printf("Se han generado %d números.", contador);

  }
}
