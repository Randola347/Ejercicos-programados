import java.util.Scanner;

public class Ejercicio2Siete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Ingrese un número (o un número negativo para salir): ");
            while (!input.hasNextInt()) {
                System.out.print("No es un número válido. Ingrese un número: ");
                input.next();
            }
            numero = input.nextInt();
            if (numero >= 0) {
                int cuadrado = numero * numero;
                System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
            } else {
                System.out.println("Saliendo del programa...");
            }
        } while (numero >= 0);
    }
}
