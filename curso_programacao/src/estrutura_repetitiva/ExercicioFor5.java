package estrutura_repetitiva;

import java.util.Scanner;

public class ExercicioFor5 {

	public static void main(String[] args) {
		/*
		 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N =
		 * N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial
		 * de 0 é 1.
		 */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 1;

		for (int i = 1; i <= n; i++) {
			
			 x  = x * i;
			
		}
		
		System.out.println(x);
		
		sc.close();
		

	}

}
