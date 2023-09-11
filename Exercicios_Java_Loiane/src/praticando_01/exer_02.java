package praticando_01;

import java.util.Scanner;

public class exer_02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o número abaixo:");

		int numero = scan.nextInt();

		if (numero >= 0) {
			System.out.println("O número: " + numero + " é positivo!");
		} else {
			System.out.println("O número: " + numero + " é negativo!");
		}
	}

}
