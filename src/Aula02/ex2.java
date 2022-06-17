package Aula02;
import java.util.Scanner;

public class Ex2 {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Celsius:");
        double C = sc.nextDouble();
        double F = 1.8 * C + 32;
        System.out.println(F + " graus Fahrenheit");

        sc.close();
        
    }
    
}
