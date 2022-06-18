package Aula03;
import java.util.Scanner;


//com erro
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (true){
        
            System.out.println("Indique um valor: ");
            num = sc.nextInt();
            if(num>0){break;}
        }
        if(num<2){System.out.println("Não é um numero primo!");}
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                System.out.println("Não é um numero primo!");
        }
        System.out.println("É um numero primo!");
        sc.close();
    }   
        
        
}
