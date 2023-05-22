import java.util.Scanner;

public class jg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        if (scanner.hasNextInt()) {
            int numero1 = scanner.nextInt();
            if (numero1 <= 0) {
                System.out.println("Debe ingresar un número positivo mayor a cero.");
                return;
            }
            
            System.out.print("Ingrese el segundo número: ");
            if (scanner.hasNextInt()) {
                int numero2 = scanner.nextInt();
                if (numero2 <= 0) {
                    System.out.println("Debe ingresar un número positivo mayor a cero.");
                    return;
                }
                
               
                int suma = numero1 + numero2;
                int resta = numero1 - numero2;
                int multiplicacion = numero1 * numero2;
                double division = (double) numero1 / numero2;
                
                System.out.println("Suma: " + suma);
                System.out.println("Resta: " + resta);
                System.out.println("Multiplicación: " + multiplicacion);
                System.out.println("División: " + division);
           
        }
    }
}
}

