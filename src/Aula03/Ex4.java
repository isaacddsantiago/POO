package Aula03;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique um valor: ");
        int first=sc.nextInt();
        int max = first;
        int min = first;
        int sum = first;
        int count = 1;
        int numero;
        
        while(true){

            System.out.println("Indique um valor: ");
            numero=sc.nextInt();
            if (numero==first){break;}
            if (numero>max){max=numero;}
            else if(numero<min){min=numero;}
            sum += numero;
            count++;

        }

        System.out.println("Max: "+ max);
        System.out.println("Min: "+ min);
        System.out.println("Média: "+ sum/count);
        System.out.println("Total de numeros lidos: "+count);
        sc.close();
    }
    
}
