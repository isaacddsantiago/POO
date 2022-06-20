package Aula05;

import java.util.Scanner;


public class Ex1 {
	public static void main(String[] args) {
		int input;
		Date date = null;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Date operations:");
			System.out.println("1 - create new date");
			System.out.println("2 - show current date");
			System.out.println("3 - increment date");
			System.out.println("4 - decrement date");
			System.out.println("0 - exit");

            System.out.println("Escolha uma operação: ");
			input = sc.nextInt();

			switch (input) {
				case 1:

                    System.out.println("Introduza o dia: ");
					int day = sc.nextInt();
                    System.out.println("Introduza o mês: ");
                    int month = sc.nextInt();
                    System.out.println("Introduza o ano: ");
                    int year = sc.nextInt();

					date = new Date(day, month, year);
					System.out.println("Data criada: " + date);
					break;

				case 2:
					if (date == null) {
						System.out.println("Data não criada.");
						break;
					}
					
					System.out.println("Data atual: " + date.toString());
					break;

				case 3:
					if (date == null) {
						System.out.println("Data não criada.");
						break;
					}

					System.out.println("Introduza o número de dias: ");
                    int daysIn = sc.nextInt();
					date.increment(daysIn);
					System.out.println("Data incrementada: " + date);
					break;

				case 4:
					if (date == null) {
						System.out.println("Data não criada.");
						break;
					}

					System.out.println("Introduza o número de dias: ");
                    int daysDe = sc.nextInt();
					date.decrement(daysDe);
					System.out.println("Data decrementada: " + date);
					break;

				case 0:
					break;
			}

			System.out.println();
		} while (input != 0);

		sc.close();
	}
}