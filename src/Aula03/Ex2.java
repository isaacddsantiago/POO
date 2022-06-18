package Aula03;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique um valor: ");
        int value = sc.nextInt();
        for(int i=value-1;i>0;i--){
            System.out.println(i);
        }
        sc.close();
    }
}
