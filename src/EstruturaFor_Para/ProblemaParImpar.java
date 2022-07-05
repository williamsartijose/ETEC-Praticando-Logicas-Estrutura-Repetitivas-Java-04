package EstruturaFor_Para;

public class ProblemaParImpar {
//	Leia um valor inteiro N. Este valor será a quantidade de números inteiros que serão lidos em seguida.
//	Para cada valor lido, mostre uma mensagem dizendo se este valor lido é PAR ou IMPAR, e também
//	se é POSITIVO ou NEGATIVO. No caso do valor ser igual a zero (0), seu programa deverá imprimir
//	apenas NULO.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n, valor;

	    System.out.print("Quantos numeros voce vai digitar? ");
	    n = sc.nextInt();

	    for (int i=0; i<n; i++) {
	        System.out.print("Digite um numero: ");
	        valor = sc.nextInt();

	        if (valor == 0) {
	            System.out.println("NULO");
	        }
	        else {
	            if (valor % 2 == 0) {
	            	System.out.print("PAR");
	            }
	            else {
	            	System.out.print("IMPAR");
	            }

	            if(valor > 0) {
	            	System.out.println(" POSITIVO");
	            }
	            else {
	            	System.out.println(" NEGATIVO");
	            }
	        }
	    }

		sc.close();
	}
}
