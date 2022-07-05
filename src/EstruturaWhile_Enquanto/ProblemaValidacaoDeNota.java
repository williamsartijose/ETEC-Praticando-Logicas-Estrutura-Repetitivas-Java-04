package EstruturaWhile_Enquanto;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaValidacaoDeNota {

//	Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a
//	média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao
//	intervalo [0,10]). Cada nota deve ser validada separadamente.
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota1, nota2, media;

		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();

		while (nota1 < 0 || nota1 > 10) {
			System.out.print("Valor invalido! Tente novamente: ");
			nota1 = sc.nextDouble();
		}

		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();

		while (nota2 < 0 || nota2 > 10) {
			System.out.print("Valor invalido! Tente novamente: ");
			nota2 = sc.nextDouble();
		}

		media = (nota1 + nota2) / 2;

		System.out.printf("MEDIA = %.2f\n", media);

		sc.close();
	}
}