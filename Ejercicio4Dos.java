import java.util.Scanner;

public class Ejercicio4Dos{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        System.out.println("Introduce números. Ingresa un número negativo para salir.");

        while (true) {
            int numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            contador++;
        }

        System.out.println("Se introdujeron " + contador + " números.");
    }
}
