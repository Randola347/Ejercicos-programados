import java.util.Scanner;
public class Ejercicio4Uno{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num;
        do {
            System.out.println("Digite un numero a elevar (numero negativo para salir) ");
            num = input.nextInt();
            int cuadrado= num * 2;
            if (num>0)
            System.out.println("El numero "+num+" al cuadrado es "+ cuadrado);
        } while (num>0);
    }
}