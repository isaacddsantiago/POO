package Aula04;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduze uma frase: ");
        String frase = sc.nextLine();
        System.out.println("\nFrase em minúsculas: ");
        System.out.println(frase.toLowerCase());
        System.out.println("\nUltimo caracter: ");
        System.out.println(frase.charAt(frase.length()-1));
        System.out.println("\nSe a frase é 'teste': ");
        System.out.println(frase.equals("teste"));
        System.out.println("\nSe não foi escrito nada: ");
        System.out.println(frase.isEmpty());
        System.out.println("\n'e' substituido por 'u': ");
        System.out.println(frase.replace("e","u"));
        sc.close();



    }
}
