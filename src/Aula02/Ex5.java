package Aula02;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Indique V1:");
        double v1 = sc.nextDouble();
        System.out.println("Indique D1:");
        double d1 = sc.nextDouble();
        System.out.println("Indique V2:");
        double v2 = sc.nextDouble();
        System.out.println("Indique D2:");
        double d2 = sc.nextDouble();

        double vmf;


        if (d1+d2==0){
            vmf = 0;
        }
        else{
            vmf = v1*( d1/(d1+d2) ) + v2*( d2/(d1+d2) );
        }

        System.out.println(vmf);
        sc.close();
    }
}
