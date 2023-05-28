import java.util.Scanner;
public class Ejercicio3Uno {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Digite un numero");
        int num;
        while (!input.hasNextInt()) {
            System.out.println("No es un número válido. Ingrese un número: ");
            input.next();
        }
        num=input.nextInt();
        System.out.println("Digite el segundo numero");
        int num2;
        while (!input.hasNextInt()) {
            System.out.println("No es un número válido. Ingrese un número: ");
            input.next();
        }
        num2=input.nextInt();
        if(num == num2){
            System.out.println("El numero "+ num +" es igual que "+ num2);
        }else{
            System.out.println("El numero " + num + " no es igual que " + num2 );
        }
    }
}
