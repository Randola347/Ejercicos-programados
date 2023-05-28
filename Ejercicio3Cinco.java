import java.util.Scanner;
public class Ejercicio3Cinco{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int millas;
        do {
            System.out.println("Digite una cantidad de millas a calcular en Kilómetros (0 para salir) ");
            millas = input.nextInt();
            int km= millas * 160903;
            if (millas>0)
            System.out.println("La cantidad de "+millas+" millas en Kilómetros es de "+km);
        } while (millas!= 0);
        
    }
}