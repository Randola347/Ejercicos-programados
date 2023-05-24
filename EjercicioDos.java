import java.util.Scanner;
public class EjercicioDos{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un valor en celsius ");
        int celsius= input.nextInt();
        while(celsius<=0){
            System.out.println("Ingrese un valor en celsius ");
        celsius= input.nextInt();
        }
        double fahrenheit =(9.0/5)*celsius + 32;
        System.out.println("El resultado es:"+ fahrenheit);
    }  
}