import java.util.Scanner;

public class Aulap2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Fala um numro ai man: ");
		int x = entrada.nextInt();
		int maior = x;
		int menor = x;

		int n = 1;

		while (n <= 4) {

			System.out.println("Fala outro numro ai man: ");
			int x2 = entrada.nextInt();

			if (x2 > maior) {
				maior = x2;
			}
			if (x2 < menor) {
				menor = x2;
			}
			n++;
		}

		System.out.println("Maior " + maior);
		System.out.println("Menor " + menor);

		entrada.close();

	}

}
