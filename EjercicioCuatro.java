import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer número: ");

        int numero1 = scanner.nextInt();
          while(numero1<=0){
            System.out.println("Ingrese un numero positivo: ");
            numero1 = scanner.nextInt();
        }

        System.out.println("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();
        while(numero1<=0 || numero2<=0){
            while(numero2<=0){
            System.out.println("Ingrese un numero positivo: ");
            numero2 = scanner.nextInt();
        }
        }
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int division = numero1 / numero2;
        int multiplicacion = numero1 * numero2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("División: " + division);
        System.out.println("Multiplicación: " + multiplicacion);
    }
    }

