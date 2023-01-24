package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
		 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
		 * uma duração mínima de 1 hora e máxima de 24 horas.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int horaI, horaF;

		System.out.println("Digite a hora inicial do jogo: ");
		horaI = sc.nextInt();

		System.out.println("Digite a hora final do jogo: ");
		horaF = sc.nextInt();

		if ((horaI >= 0 && horaI <= 24) || (horaF >= 0 && horaF <= 24)) {
			if (horaI < horaF) {
				System.out.println("O JOGO DUROU " + (horaF - horaI) + " HORAS");
			}else {
				System.out.println("O JOGO DUROU " + (24 - horaI + horaF) + " HORAS");
			}

		} else {
			System.out.println("Digite um horário correto!");
		}

		sc.close();
	}
}
