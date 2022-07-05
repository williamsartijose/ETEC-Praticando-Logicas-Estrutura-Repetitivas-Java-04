package EstruturaFor_Para;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaDentroFora {

	public static void main(String[] args) {
		// Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X
		// que ser�o lidos em seguida.
		// Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos
		// est�o fora do intervalo,
		// conforme exemplo

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, x, fora, dentro;

		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

		fora = 0;
		dentro = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			x = sc.nextInt();

			if (x < 10 || x > 20) {
				fora++;
			} else {
				dentro++;
			}
		}

		System.out.printf("%d DENTRO\n", dentro);
		System.out.printf("%d FORA\n", fora);

		sc.close();
	}
}