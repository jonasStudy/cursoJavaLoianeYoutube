package praticando_01;

import java.util.Arrays;
import java.util.Scanner;

public class exer_09_v2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] valores = new int[3];

		// Captura os valores do usuário
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite o valor #" + (i + 1) + " : ");
			valores[i] = scan.nextInt();
		}

		// Classifique o array em ordem crescente
		Arrays.sort(valores);

		// Inverta os valores em ordem decrescente
		for (int i = 0; i < valores.length / 2; i++) {
			int temp = valores[i];
			valores[i] = valores[valores.length - 1 - i];
			valores[valores.length - 1 - i] = temp;
		}

		// Imprima os valores em ordem decrescente
		System.out.println("Valores em ordem decrescente:");
		for (int valor : valores) {
			System.out.println(valor);
		}

		// Feche o scanner
		scan.close();
	}
}
