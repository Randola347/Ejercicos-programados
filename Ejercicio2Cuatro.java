import  java.util.Scanner;

public class Ejercicio2Cuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int num1 = input.nextInt(); 
        while (num1 <=0){
            System.out.println("Ingrese un numero entero");
           } 
           System.out.println("Ingrese un numero");
        int num2 = input.nextInt(); 
        while (num2 <=0){
            System.out.println("Ingrese un numero entero");
           } 
           System.out.println("Ingrese un numero");
        int num3 = input.nextInt(); 
        while (num3 <=0){
            System.out.println("Ingrese un numero entero");
           } 
       if (num1 > num2 && num1 >num3){
          if (num2>num3){
               System.out.println(num1 +" "+num2+" "+num3);
          }else{
               System.out.println(num1 +" "+num3+" "+num2);
          }
        }else if(num2 > num1 && num2 >num3){
            if(num1>num3){
                System.out.println(num2 +" "+num1+" "+num3);   
            }else{
                System.out.println(num2 +" "+num3+" "+num1);
            }
        }else if (num3 > num1 && num3 >num2){
            if (num1>num2){
                System.out.println(num3 +" "+num1+" "+num2); 
            }else{
                System.out.println(num3 +" "+num2+" "+num1); 
            }
        }
    }
}