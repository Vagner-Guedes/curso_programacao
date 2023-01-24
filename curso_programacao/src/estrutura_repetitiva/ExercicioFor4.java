package estrutura_repetitiva;

import java.util.Scanner;

public class ExercicioFor4 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um número N. Depois leia N pares de números e
		 * mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
		 * mostrar a mensagem "divisao impossivel".
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			double a = sc.nextDouble();
			double b =sc.nextDouble();
			
			if(b == 0) {
				System.out.println("Divisão impossível");
			}else {
				System.out.println(a/b);
			}
		}
		
		sc.close();
		
		
	}

}
