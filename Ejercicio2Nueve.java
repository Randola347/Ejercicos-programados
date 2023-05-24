import java.util.Scanner;

public class Ejercicio2Nueve{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int suma = 0;
        do {
            System.out.println("Ingrese un número (0 para salir): ");
            numero = input.nextInt();
            suma += numero;
        } while (numero != 0);
        System.out.println("La suma de los números introducidos es: " + suma);
    }
}

