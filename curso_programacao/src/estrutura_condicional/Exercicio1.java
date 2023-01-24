package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro, e depois dizer se este número é
		 * negativo ou não.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int  x;
		
		System.out.println("Digite um número qualquer: ");
		x = sc.nextInt();
		
		if(x>=0) {
			System.out.println("Não Negativo!");
		} else {
			System.out.println("Negativo!");
		}
		
		sc.close();

	}

}
