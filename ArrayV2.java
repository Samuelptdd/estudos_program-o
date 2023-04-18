import java.util.Scanner;

public class ArrayV2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int A[] = new int[5];

		int B[] = new int[5];

		for (int i = 0; i <= 5; i++) {
			System.out.println("Informe uma valor:");
			A[i] = entrada.nextInt();
			
		}

		System.out.println("/n de valores do veor A: ");
		for (int i = 0; i < A.length; i++) {
			System.out.println("Valor: " + A[i]);
			B[i] = A[i];
		}

		System.out.println("/n de valores do veor B: ");
		for (int i = 0; i < B.length; i++) {
			System.out.println("Valor: " + B[i]);
		}

		entrada.close();

	}

}
