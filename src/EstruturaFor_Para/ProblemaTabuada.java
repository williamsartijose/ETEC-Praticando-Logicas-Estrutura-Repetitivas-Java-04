package EstruturaFor_Para;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaTabuada {

	// Ler um número inteiro N,
	// daí mostrar na tela a tabuada de N para 1 a 10, conforme exemplo.
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, resultado;

		System.out.print("Deseja a tabuada para qual valor? ");
	    n = sc.nextInt();

		for (int i = 0; i <= 10; i++) {
			resultado = n * i;
			System.out.printf("%d x %d = %d\n", n, i, resultado);
		}

		sc.close();

	}

}
