package praticando_01;

import java.util.Arrays;
import java.util.Scanner;

public class exer_09_v3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] valores = new int[3];

		// Capturar valores do usuario
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite o valor #" + (i + 1) + ":");
			valores[i] = scan.nextInt();
		}

		// Chama o método static
		ordenarDecrescente(valores);

		System.out.println("Valores em ordem decrescente:");
		for (int valor : valores) {
			System.out.println(valor);
		}

		scan.close();
	}

	public static void ordenarDecrescente(int[] array) {

		// Classificar o array em ordem crescente
		Arrays.sort(array);

		// Inverter o array para obter a ordem decrescente
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
	}
}
