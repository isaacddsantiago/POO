package Aula02;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("x1:");
		double x1 = sc.nextDouble();
		System.out.println("y1:");
		double y1 = sc.nextDouble();
        System.out.println("x1:");
		double x2 = sc.nextDouble();
        System.out.println("y2:");
		double y2 = sc.nextDouble();

		double dx = x2 - x1;
		double dy = y2 - y1;

		System.out.println( Math.sqrt(dx*dx + dy*dy) );

		sc.close();
    }
}
