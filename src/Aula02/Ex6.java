package Aula02;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique os segundos:");
        int total = sc.nextInt();
        int seconds = total %60;
        int minutes = (total-seconds)/60%60;
        int hours = (total-minutes*60-seconds)/(60*60)%60;
        
        System.out.printf("%02d:%02d:%02d\n",hours,minutes,seconds);

        sc.close();

    }
}
