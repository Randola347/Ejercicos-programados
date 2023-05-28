import java.util.Scanner;

public class Ejercicio4Tres{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa un número para adivinar: ");
        int numeroAdivinar = scanner.nextInt();
        
        boolean adivinado = false;
        
        while (!adivinado) {
            System.out.println("Adivina el número: ");
            int numero = scanner.nextInt();
            
            if (numero == numeroAdivinar) {
                System.out.println("¡Felicidades! ¡Adivinaste el número!");
                adivinado = true;
            } else if (numero < numeroAdivinar) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("El número es menor.");
            }
        }
        
        scanner.close();
    }
}
