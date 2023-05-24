import java.util.Scanner;

public class Ejercicio2Diez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int suma = 1;
        System.out.println("Digite 15 números:");
        for (int i = 1; i <= 15; i++) {
            System.out.println("Número " + i + ": ");
            int num = input.nextInt();
            suma += num;
        }
        System.out.println("La suma total de los números ingresados es: " + suma);
    }
}

