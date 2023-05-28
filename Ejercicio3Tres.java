import java.util.Scanner;

public class Ejercicio3Tres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        boolean MultiploDeTres = numero % 3 == 0;
        boolean MultiploDeCinco = numero % 5 == 0;

        if (MultiploDeTres &&MultiploDeCinco) {
            System.out.println("El número ingresado es múltiplo de tres y de cinco.");
        } else if (MultiploDeTres) {
            System.out.println("El número ingresado es múltiplo de tres.");
        } else if (MultiploDeCinco) {
            System.out.println("El número ingresado es múltiplo de cinco.");
        } else {
            System.out.println("El número ingresado no es múltiplo de tres ni de cinco.");
        }
    }
}
