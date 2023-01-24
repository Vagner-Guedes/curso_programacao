package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um número inteiro e dizer se este número é par ou
		 * ímpar.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite um número inteiro qualquer : ");
		x = sc.nextInt();
		
		if(x % 2 != 0) {
			System.out.println("IMPAR");
		} else {
			System.out.println("PAR");
		}
		
		sc.close();

	}
}
