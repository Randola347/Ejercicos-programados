import java.util.Scanner;
    
public class EjercicioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();
        long factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
    public static long calcularFactorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }

        long factorial = 1;
        for (int i = 2; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
