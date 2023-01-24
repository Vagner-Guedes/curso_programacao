package estrutura_repetitiva;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		/*
		 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a
		 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
		 * será encerrado quando o código informado for o número 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combustível, conforme exemplo.
		 */
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (x >= 1 || x == 4) {
			
			if (x == 1) {
				alcool = alcool + 1;
			} else if (x == 2) {
				gasolina = gasolina + 1;
			} else if (x == 3) {
				diesel= diesel + 1;
			} else if (x == 4) {
				System.out.println("Muito obrigado!");
				System.out.println("Alcool: " + alcool);
				System.out.println("Gasolina: " + gasolina);
				System.out.println("Diesel: " + diesel);
				
			}
			x = sc.nextInt();
		}

		sc.close();
	}
}
