package Aula02;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade(Kg)");
        double M = sc.nextDouble();
        double finalTemperature = 100;
        double initialTemperature = 0;
        double Q = M * (finalTemperature - initialTemperature) * 4184;
        System.out.print(Q);
        



    }
}
