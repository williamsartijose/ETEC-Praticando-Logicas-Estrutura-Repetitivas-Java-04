package EstruturaFor_Para;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaSequenciaImpares {
//	Leia um valor inteiro X. Em seguida mostre os �mpares de 1 at� X, um valor por linha, inclusive o X,
//	se for o caso.
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x;

		System.out.print("Digite o valor de X: ");
		x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.printf("%d\n", i);
			}
		}

		sc.close();
	}
}