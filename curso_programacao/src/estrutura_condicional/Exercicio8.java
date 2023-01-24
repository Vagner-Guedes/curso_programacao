package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario, imposto;

		salario = sc.nextDouble();

		if (salario <= 2000.00) {
			System.out.printf("Isento");
		} else if (salario <= 3000.00) {
			imposto = (salario - 2000.00) * 0.08;
			System.out.printf("R$ %.2f", imposto);
		} else if (salario <= 4500.00) {
			imposto = (salario - 3000.00) * 0.18 + (1000.00 * 0.08);
			System.out.printf("R$ %.2f", imposto);
		} else {
			imposto = (salario - 4500.00) * 0.28 + (1500.00 * 0.18) + (1000.00 * 0.08);
			System.out.printf("R$ %.2f", imposto);
		}

		sc.close();

	}

}
