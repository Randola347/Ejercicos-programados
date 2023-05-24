import java.util.Scanner;
public class Ejercicio2Cinco{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite un numero del 0 al 9999:");
        int numero = input.nextInt();
        int resultado= contarCifras(numero);
        System.out.println("Tiene "+resultado+" cifras");

    }
    public static int contarCifras(int numero){
      if (numero < 10){
        return 1;
      }else if(numero <100 ){
        return 2;
      }else if (numero <1000){
        return 3;
      }else if (numero <=9999){
        return 4 ;
      }else{
        return -1;
      }
    }

}