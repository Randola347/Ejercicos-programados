import java.util.Scanner;
public class Ejercicio2Cinco {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite un numero del 0 al 9999:");
        int numero = input.nextInt();
        while(numero<1 && numero >9999){
            System.out.println("Digite un numero del 0 al 9999:");
            numero= input.nextInt();
        }
        if (numero<10){
            System.out.println("El numero tiene una cifra");
        }
    else if(numero>10 && numero<100){
        System.out.println("El numero tiene dos cifras");
    }
    else if(numero>100 && numero<1000){
        System.out.println("El numero tiene tres cifras");
    }
    else if(numero>1000 && numero<9999){
        System.out.println("El numero tiene cuatro cifras");
    }
    }
}

