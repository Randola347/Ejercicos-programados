import java.util.Scanner;
public class Ejercicio2Dos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Ingrese el primer número positivo: ");
            int num1 = input.nextInt();
            while (num1 <=0) {
                System.out.println("No es un número válido. Ingrese un número positivo: ");
                num1= input.nextInt();
            }
        while (num1 <= 0);
            System.out.println("Ingrese el segundo número positivo: ");
            int num2 = input.nextInt();
            while (num2<=0) {
                System.out.println("No es un número válido. Ingrese un número positivo: ");
                num2 = input.nextInt();
            }
        while (num2 <= 0);
        if (num1 % num2 == 0) {
            System.out.println(num1 + " es múltiplo de " + num2);
        } else if (num2 % num1 == 0) {
            System.out.println(num2 + " es múltiplo de " + num1);
        } else {
            System.out.println("Ninguno de los números es múltiplo del otro");
        }
    }
}

