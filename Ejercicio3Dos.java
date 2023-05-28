import java.util.Scanner;
public class Ejercicio3Dos {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Digite un numero entero");
        int numero = input.nextInt();
        int doble= numero *2;
        int triple= numero *3;
        System.out.println("El doble de "+numero+" es "+doble);
        System.out.println("El triple de "+numero+" es "+triple);
    }
}
