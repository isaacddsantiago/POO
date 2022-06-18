package Aula03;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota componente teorica: ");
        double notaT = sc.nextDouble();
        assert (notaT>=0 && notaT<=20);
        System.out.println("Nota componente pratica: ");
        double notaP = sc.nextDouble();
        assert (notaP>=0 && notaP<=20);

        double notaF = 0.4*notaT + 0.6*notaP;
        if (notaF < 7.0){
            System.out.printf("\nReprovou com %.1f valores",notaF);
        }
        else{
            System.out.printf("Passou com %.1f valores",notaF);
        }
        sc.close();
    }
}
