import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
		 * soma desses números com uma mensagem explicativa, conforme exemplos.
		 */

		int x, y, soma;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite dois valores inteiros: ");
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();

	}
	

}
