package Aula06;

import Aula05.Date;

public class Ex1 {
    public static void main(String[] args) {
        Date d = new Date(9 , 12 , 2002);
        Pessoa p = new Pessoa("Ana Santos", 98012244, d);
        System.out.println(p.toString());

        Aluno al = new Aluno("Andreia Melo",
            9855678,
            new Date(18, 7, 1990),
            new Date(1, 9, 2018));

        Aluno al2 = new Aluno("Rodrigo Melo",
            9855674,
            new Date(23, 1, 1999),
            new Date(1, 9, 2018));

        System.out.println(al.toString());
        System.out.println(al2.toString());
    }
}
