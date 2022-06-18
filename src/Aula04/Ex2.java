package Aula04;
import java.util.Scanner;

public class Ex2 {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Introduza uma frase: ");
        String frase = sc.nextLine();
        System.out.println("\nA frase contem " + countDigits(frase)+" digitos.");
        System.out.println("\nA frase contem " + spaces(frase)+" espaços.");
        System.out.println("\nA frase só contem minusculas: " +lower(frase));
        System.out.println("\nFrase com apenas um espaço: "+ onlySpace(frase));

    }

    public static int countDigits (String s){
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                count++;
            }
        }
        return count;
    }

    public static int spaces (String s){
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }
        return count++;
    }

    public static boolean lower (String s){
        return (s.equals(s.toLowerCase()));
    }

    public static String onlySpace (String s){
        String newS = "";
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)==' ' &&
                newS.charAt(newS.length() - 1)== ' '){
                continue;
            }
            newS += s.charAt(i);
        }
        
        newS.toString();
        return newS;
    }
}
