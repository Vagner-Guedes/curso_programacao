import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		 * valor da área deste círculo com quatro casas decimais conforme exemplos.
		 */
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);

		double area, x, raio;
		double pi = 3.14159;

		System.out.println("Digite o raio do circulo que deseja o calculo de área:");

		x = sc.nextDouble();

		raio = Math.pow(x, 2);
		area = pi * raio;

		System.out.printf("Área = %.4f", area);

		sc.close();

	}

}
