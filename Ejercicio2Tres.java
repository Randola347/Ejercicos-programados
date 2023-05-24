import java.util.Scanner;
public class Ejercicio2Tres {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un numero");
        int num1 = scanner.nextInt();
        while(num1 <=0){
            System.out.println("No es un numero positivo. Digite otro numero.");
            num1 = scanner.nextInt();
        }
        while (num1 <= 0);
            System.out.println("Digite el segundo número : ");
            int num2 = scanner.nextInt();
            while (num2<=0) {
                System.out.println("No es un número válido. Digite otro numero.");
                num2 = scanner.nextInt();
            }
        while (num2<=0);
            if (num1>num2){
                System.out.println("El numero "+ num1 +" es mayor que "+ num2);
            }else if(num2>num1){
                System.out.println("El numero "+ num2 + " es mayor que "+ num1);
            }

    }
}