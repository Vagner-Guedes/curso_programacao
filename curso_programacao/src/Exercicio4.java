import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais.
		 */
		Locale.setDefault(Locale.US);
		int number, hT;
		double vH, salary;

		Scanner sc = new Scanner(System.in);
		System.out.println("Funcionário, digite seu número: ");
		number = sc.nextInt();
		System.out.println("Quantas horas foram trabalhadas? ");
		hT = sc.nextInt();
		System.out.println("Quanto recebe por hora?");
		vH =sc.nextDouble();
		
		salary = hT * vH;
		
		System.out.println("NUMBER = "+ number);
		System.out.printf("SALARY = U$ %.2f", salary);

		sc.close();
	}

}
