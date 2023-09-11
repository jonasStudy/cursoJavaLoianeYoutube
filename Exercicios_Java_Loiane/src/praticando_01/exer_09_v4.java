package praticando_01;

import java.util.Arrays;
import java.util.Scanner;

public class exer_09_v4 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] valores = new int[3];

		// Captura os valores do usuario
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Entre com um valor #" + (i + 1) + ":");
			valores[i] = scan.nextInt();
		}
		
		// Classifique o array em ordem crescente 
		Arrays.sort(valores);
		
		// Invertendo os valores em ordem decrescente 
		for (int i = 0; i < valores.length / 2; i++) {
			int temp = valores[i];
			valores[i] = valores[valores.length - 1 - i];
			valores[valores.length - 1 - i] = temp;
		}
		
		// Imprimindo os valores 
		for (int valor : valores) {
			System.out.println(valor);
		}
	}
}
