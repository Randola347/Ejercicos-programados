import java.util.Scanner;

public class Ejercicio3Seis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la hora: ");
        int hora = input.nextInt();

        System.out.print("Ingrese los minutos: ");
        int minutos = input.nextInt();

        System.out.print("Ingrese los segundos: ");
        int segundos = input.nextInt();

        boolean horaValida = esHoraValida(hora, minutos, segundos);

        if (horaValida) {
            System.out.println("La hora ingresada es válida.");
        } else {
            System.out.println("La hora ingresada no es válida.");
        }
    }

    public static boolean esHoraValida(int hora, int minutos, int segundos) {
        boolean horaValida = true;

        if (hora < 0 || hora > 23) {
            horaValida = false;
        }

        if (minutos < 0 || minutos > 59) {
            horaValida = false;
        }

        if (segundos < 0 || segundos > 59) {
            horaValida = false;
        }

        return horaValida;
    }
}
