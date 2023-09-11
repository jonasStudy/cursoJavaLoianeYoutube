package praticando_01;

import java.util.Arrays;
import java.util.Scanner;

public class exer_09_v1 {
	public static void main(String[] args) {

		int[] valores = { 4, 2, 3, 6, 0, 10, 9, 7, 8, 5, 1 };

		Arrays.sort(valores);

		// Iverta o array para obter a ordem decrescente
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

	}
}
