package praticando_01;

import java.util.Scanner;

public class exer_08 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o preco do primeiro produto:");
		int produto1 = scan.nextInt();

		System.out.println("Informe o preco do segundo produto:");
		int produto2 = scan.nextInt();

		System.out.println("Informe o preco do terceiro produto:");
		int produto3 = scan.nextInt();

		if (produto1 < produto2 && produto2 <= produto3) {
			System.out.println("O produto mais barato é o 1: " + produto1);
		} else if (produto2 < produto3 && produto3 >= produto1) {
			System.out.println("O produto mais barato é o 2: " + produto2);
		} else {
			System.out.println("O produto mais barato é o 3: " + produto3);
		}
	}
}