import java.util.Scanner;

/**
*
*	Ejercicio 10, Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
* El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno 
* de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.
* 
*	Nombre del archivo: Ejercicio10.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio10 {
  public static void main(String[] args) {
    
    int caracteres;
    int longitud;
    String relleno = "";
    
    for(int i = 1; i <= 10; i++) {
      
      longitud = (int)(Math.random() * 40) + 1;
      caracteres = (int)(Math.random() * 6);
      
      switch(caracteres) {
        case 0:
          relleno = "*";
          break;
        case 1:
          relleno = "-";
          break;
        case 2:
          relleno = "=";
          break;
        case 3:
          relleno = ".";
          break;
        case 4:
          relleno = "|";
          break;
        case 5:
          relleno = "@";
          break;
        default:
      }
      
      // pinta la línea
      for(int j = 1; j <= longitud; j++) {
        System.out.print(relleno);
      }
      System.out.println();
    }

  }
}
