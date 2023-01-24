import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numP;
		double valorP, p1, p2;
		
		System.out.println("Digite o código da peça: ");
		int cod1 = sc.nextInt();
		System.out.println("Digite a quantidade de peças: ");
		numP = sc.nextInt();
		System.out.println("Digite o valor da peça: ");
		valorP = sc.nextDouble();
		
		p1 = numP * valorP;
		
		System.out.println("Digite o código da peça: ");
		int cod2 = sc.nextInt();
		System.out.println("Digite a quantidade de peças: ");
		numP = sc.nextInt();
		System.out.println("Digite o valor da peça: ");
		valorP = sc.nextDouble();
		
		p2 = numP * valorP;
		
		System.out.printf("VALOR A PAGAR: %.2f", p1+p2);
		
		
		
		sc.close();
	}

}
