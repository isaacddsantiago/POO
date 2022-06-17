package Aula02;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        double quil = sc.nextDouble();
        double mile = quil/1.609;
        System.out.println(mile + " milas"); 
        
        sc.close();
    }
    

    
}
