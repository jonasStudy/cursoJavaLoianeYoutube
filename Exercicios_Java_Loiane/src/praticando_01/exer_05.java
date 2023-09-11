package praticando_01;

import java.util.Scanner;

public class exer_05 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Adicione a primeira nota:");

		int nota1 = scan.nextInt();

		System.out.println("Adicione a segunda nota:");

		int nota2 = scan.nextInt();

		int media = (nota1 + nota2) / 2;

		if (media < 10 && media >= 7) {
			System.out.println("Aprovado!");
		} else if (media < 7) {
			System.out.println("Reprovado!");
		} else if (media > 7 && media == 10) {
			System.out.println("Aprovado com Distincao");
		}
	}
}