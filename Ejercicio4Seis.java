import java.util.Scanner;

public class Ejercicio4Seis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumaSalarios = 0;
        int mayoresDe10000 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el salario " + i + ": ");
            double salario = scanner.nextDouble();
            sumaSalarios += salario;
            
            if (salario > 10000) {
                mayoresDe10000++;
            }
        }

        System.out.println("La suma de los salarios es: " + sumaSalarios);
        System.out.println("Hay " + mayoresDe10000 + " salarios mayores de 10000 colones.");

        scanner.close();
    }
}
