package praticando_01;

import java.util.Scanner;

public class exer_01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o primero número:");

		int num1 = scan.nextInt();

		System.out.println("Informe o segundo número:");

		int num2 = scan.nextInt();

		if (num1 > num2) {
			System.out.println("O número maior é o: " + num1);
		} else if (num2 > num1) {
			System.out.println("O número maior é o: " + num2);
		}

		System.out.println("Outra forma de aplicacao do IF: \n");

		if (num1 > num2) {
			System.out.println("O num1 é maior que o num2. Valor: " + num1);
		} else {
			System.out.println("O num2 é maior que o num1. Valor: " + num2);
		}

	}

}
