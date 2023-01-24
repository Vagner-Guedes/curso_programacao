import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia três valores com ponto flutuante de dupla
		 * precisão: A, B e C. Em seguida, calcule e mostre: a) a área do triângulo
		 * retângulo que tem A por base e C por altura. b) a área do círculo de raio C.
		 * (pi = 3.14159) c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B. e) a área do retângulo que tem lados A
		 * e B.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c;
		double tri, cir, tra, qua, ret;
		double pi = 3.14159;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		tri = (a * c)/2;
		cir = pi * Math.pow(c, 2);
		tra = ((a + b) * c )/2;
		qua = Math.pow(b, 2);
		ret = a * b;
		
		
		System.out.printf("TRIANGULO : %.3f %n", tri);
		System.out.printf("CIRCULO : %.3f %n", cir);
		System.out.printf("TRAPEZIO : %.3f %n", tra);
		System.out.printf("QUADRADO : %.3f %n", qua);
		System.out.printf("RETANGULO : %.3f %n", ret);

		sc.close();
	}

}
