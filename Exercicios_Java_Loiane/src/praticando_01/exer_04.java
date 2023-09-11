package praticando_01;

import java.util.Scanner;

public class exer_04 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com uma letra:");

		String letra = scan.next();

		/*
		 * Primeiro modo - sem validacao
		 */

		if (letra.length() > 1) {
			System.out.println("Informe apenas uma letra!");
		} else if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
				|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			System.out.println("Vogal adicionada!");
		} else {
			System.out.println("Consoante adicionada!");
		}

		/*
		 * Segundo modo - com validacao sem o switch
		 */

		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
				|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			System.out.println("Letra: " + letra + " é uma vogal.");
		} else {
			System.out.println("Letra: " + letra + " é uma consoante.");
		}

		System.out.println("");

		/*
		 * Terceiro modo - com validacao e switch
		 */

		if (letra.length() > 1) {
			System.out.println("Valor inválido. Entre com apenas uma letra!");
		} else {
			switch (letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
				System.out.println("Vogal");
				break;
			default:
				System.out.println("Consoante");
			}
		}
	}

}
