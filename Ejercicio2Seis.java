import java.util.Scanner;
public class Ejercicio2Seis {
   public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un día");
    int dia = scanner.nextInt();
    while (dia>30 || dia<=0){
        System.out.println("Ingrese un día correcto");
        dia= scanner.nextInt();   
    }
    System.out.println("Ingrese un mes");
    int mes= scanner.nextInt();
    while(mes>12 || mes<=0){
        System.out.println("Ingrese un mes correcto");
        mes= scanner.nextInt(); 
    }
    System.out.println("Ingrese un año");
    int año= scanner.nextInt();
   while(año>2023 || año<=0){
    System.out.println("Ingrese un año correcto");
    año= scanner.nextInt(); 
   }
   System.out.println("Fecha Dia "+ dia +" Mes "+ mes + " Año "+ año);
}
}
