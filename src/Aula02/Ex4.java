package Aula02;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique o valor inicial:");
        double ini = sc.nextDouble();
        System.out.println("Indique a taxa do juro mensal:");
        double tax = sc.nextDouble();

        for(int i=0;i<3;i++){
            ini = ini + ini*(tax/100);
        }
        System.out.println("O valor final é de: "+ ini + "€");
        sc.close();
    }
}
