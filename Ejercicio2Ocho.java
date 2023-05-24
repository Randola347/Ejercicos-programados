import java.util.Scanner;

public class Ejercicio2Ocho {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        do {
            System.out.println("Digite un número (0 para salir) ");
            num = input.nextInt();

            if (num > 0) {
                System.out.println("El número es positivo.");
            } else if (num < 0) {
                System.out.println("El número es negativo.");
            } else {
                System.out.println("Saliendo del programa...");
            }
        } while (num!= 0);
    }
}
