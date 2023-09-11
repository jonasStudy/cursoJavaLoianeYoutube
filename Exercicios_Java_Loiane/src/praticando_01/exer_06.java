package praticando_01;

import java.util.Scanner;

public class exer_06 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o primeiro número:");
		int num1 = scan.nextInt();

		System.out.println("Informe o segundo número:");
		int num2 = scan.nextInt();

		System.out.println("Informe o terceiro número:");
		int num3 = scan.nextInt();

		if (num1 > num2 && num2 <= num3) {
			System.out.println("O maior número é o número 1: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior número é o número 2: " + num2);
		} else {
			System.out.println("O maior número é o número 3: " + num3);
		}
	}
}