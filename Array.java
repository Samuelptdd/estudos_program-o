import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int[] notas = new int[4];

		for (int i = 0; i <= 3; i++) {
			System.out.println("informe uma nota :");
			notas[i] = entrada.nextInt();
		}

		for (int i = 0; i <= 3; i++) {
			System.out.println("Informe umanota:  " + notas[i]);

		}

		entrada.close();

	}

}
