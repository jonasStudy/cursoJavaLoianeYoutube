package praticando_01;

import java.util.Scanner;

public class exer_03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o teu sexo (F ou M):");

		String input = scan.next();

		if (input.equalsIgnoreCase("F")) {
			System.out.println("Feminino");
		} else if (input.equalsIgnoreCase("M")) {
			System.out.println("Masculino");
		} else {
			System.out.println("Sexo Indefinido");
		}
	}

}
