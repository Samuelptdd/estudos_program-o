import java.util.Scanner;

public class WhilwDowhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int soma = 0, valor = 0;
		do {
			System.out.println(" Informe qualquer valor para somar");
			valor = entrada.nextInt();
			soma += valor;

			System.out.println("A soma é :" + soma);
		} while (valor != 0);
		System.out.println("o programa acabou!!!!!");

	}

}
