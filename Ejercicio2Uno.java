import java.util.Scanner;
public class Ejercicio2Uno {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = scanner.nextInt();
        while(num<=0){
            System.out.println("Ingrese un numero");
            num = scanner.nextInt();
    }
    if(num>0){
        System.out.println("El numero es positivo");
    }else{
        System.out.println("El numero es negativo");
    }
    }
}
