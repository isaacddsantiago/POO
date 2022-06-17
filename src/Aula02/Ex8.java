package Aula02;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A: ");
		double A = sc.nextDouble();
		System.out.println("B: ");
        double B = sc.nextDouble();

		if( A<=0 || B<=0 ) {
			System.out.println("Invalid Values, must be >=0!");
			sc.close();
            return;
		}

		double C = Math.sqrt( A*A + B*B );

		System.out.println( C );
		System.out.println( Math.toDegrees(Math.asin( A / C ))+ "º23" );

		sc.close();
    }
    
}
