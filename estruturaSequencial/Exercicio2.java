package estruturaSequencial;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double R, A, pi = 3.14159;

		R = sc.nextDouble();
		A = pi * R * R;

		System.out.printf("%.4f%n", A);
		sc.close();

	}

}
