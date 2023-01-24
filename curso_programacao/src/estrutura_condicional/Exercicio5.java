package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo, qtd;
		double preco, total;

		System.out.println("Digite o codigo do produto: ");
		codigo = sc.nextInt();

		System.out.println("Digite a quantidade do produto: ");
		qtd = sc.nextInt();

		switch (codigo) {
		case 1:
			preco = 4.00;
			total = preco * qtd;
			System.out.printf("Total: R$ %.2f" , total);
			break;
		case 2:
			preco = 4.50;
			total = preco * qtd;
			System.out.printf("Total: R$ %.2f" , total);
			break;
		case 3:
			preco = 5.00;
			total = preco * qtd;
			System.out.printf("Total: R$ %.2f" , total);
			break;
		case 4:
			preco = 2.00;
			total = preco * qtd;
			System.out.printf("Total: R$ %.2f" , total);
			break;
		case 5:
			preco = 1.50;
			total = preco * qtd;
			System.out.printf("Total: R$ %.2f" , total);
			break;
			
		default:
			break;
		}

		sc.close();
	}
}
