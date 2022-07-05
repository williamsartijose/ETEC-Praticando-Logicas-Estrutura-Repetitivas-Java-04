package EstruturaWhile_Enquanto;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um
//indivíduo. O último dado, que não entrará nos cálculos, contém um valor de idade negativa. Calcular
//e imprimir a idade média deste grupo de indivíduos. Se for entrado um valor negativo na primeira vez,
//mostrar a mensagem "IMPOSSIVEL CALCULAR".

public class ProblemaMediaIdade {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade, npessoas;
	    double soma, media;

	    System.out.println("Digite as idades:");
	    idade = sc.nextInt();

	    if (idade < 0) {
	    	System.out.println("IMPOSSIVEL CALCULAR");
	    }
	    else {
			soma = 0;
			npessoas = 0;
	        while (idade >= 0) {
	            soma = soma + idade;
	            npessoas++;
	            idade = sc.nextInt();
	        }

	        media = soma / npessoas;

	        System.out.printf("MEDIA = %.2f\n", media);
	    }

		sc.close();
	}
}