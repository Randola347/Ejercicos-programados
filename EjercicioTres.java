import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       Double PI= 3.14159;

        System.out.println("Ingresa el radio del círculo: ");
        double radio = scanner.nextFloat();
        double area = calcularAreaCirculo(radio,PI);
        double perimetro = calcularPerimetroCirculo(radio,PI);

        System.out.println("El área del círculo es: " + area);
        System.out.println("El perímetro del círculo es: " + perimetro);
    }

    public static double calcularAreaCirculo(double radio,Double pi) {
        Double area =  pi*radio * radio;
        return area;
    }

    public static double calcularPerimetroCirculo(double radio,Double pi) {
        Double perimetro = 2 * pi * radio;
        return perimetro;
    }
}
