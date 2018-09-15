import java.util.Scanner;

public class Fibonacci {
    

  public static void main(String[] EPR) {
      /*definimos las variables a usar*/
int numero = 0;
int fib1 = 1;
int fib2 = 1;
Scanner lectura_numeros = new Scanner(System.in); /*objeto scanner que servirá para leer en consola los datos introducidos por teclado*/

System.out.println("Inserte un numero entero");
numero = lectura_numeros.nextInt(); /*objeto scanner-Método que retorna un token del Scanner en formato de número entero int*/

for (int i = 0 ; i < numero; i++){
System.out.println(fib1 +" , " +fib2);
fib1 = fib1 + fib2;
fib2 = fib1 + fib2;
}
  }
}

