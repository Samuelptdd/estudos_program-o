import java.util.Scanner;

public class Aulap1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int x = 1, somaImpar = 0;

		while (x <= 100) {

			if ((x % 3 == 0) && (x % 2 != 0)) {
				somaImpar = somaImpar + x;
			}
			x++;
		}

		System.out.println("A soma dos impares : " + somaImpar);

		entrada.close();
	}

}
