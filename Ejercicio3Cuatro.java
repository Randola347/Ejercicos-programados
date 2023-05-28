import java.util.Scanner;

public class Ejercicio3Cuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int año;
        System.out.println("Ingrese un año: ");
        while (!input.hasNextInt()) {
            System.out.println("No es un número válido. Ingrese un número: ");
            input.next();
        }
        año = input.nextInt();
        boolean esBisiesto = false;
        if (año % 4 == 0) {
            if (año % 100 != 0 || año % 400 == 0) {
                esBisiesto = true;
            }
        }
        if (esBisiesto) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }
    }
}
