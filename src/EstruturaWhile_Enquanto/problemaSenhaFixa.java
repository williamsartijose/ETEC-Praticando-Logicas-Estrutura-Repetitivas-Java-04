package EstruturaWhile_Enquanto;

import java.util.Locale;
import java.util.Scanner;

public class problemaSenhaFixa {

//	Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. Para cada leitura de
//	senha incorreta informada, escrever a mensagem "Senha Invalida! Tente novamente:". Quando a senha
//	for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo
//	encerrado. Considere que a senha correta � o valor 2002.

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int senha;

		System.out.print("Digite a senha: ");
		senha = sc.nextInt();

		while (senha != 2002) {
			System.out.print("Senha Invalida! Tente novamente: ");
			senha = sc.nextInt();
		}

		System.out.println("Acesso permitido!\n");

		sc.close();
	}
}