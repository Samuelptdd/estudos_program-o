import java.util.Scanner;

public class Atvdd {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int total = 0;
		
		int soma;

		do {
			

			System.out.println("informe um valor: ");
			int valor1 = entrada.nextInt();

			System.out.println("informe um outro valor: ");
			int valor2 = entrada.nextInt();

			System.out.println("Informe agora qual operação você quer que seja feita: ");
			String operação = entrada.next().toUpperCase();

			System.out.println("Caso queira parar digite -999, ou qualquer outro numero para continuar ");
			soma = entrada.nextInt();
			
			switch (operação) {

			case "A":
				total = valor1 + valor2;
				System.out.println("Voçê escolheu Adição: " + total);
				break;

			case "S":
				total = valor1 - valor2;
				System.out.println("Voçe escolheu Subtração: " + total);
				break;

			case "D":
				total = valor1 / valor2;
				System.out.println("Voçê escolheu Divisão: " + total);
				break;

			case "M":
				total = valor1 * valor2;
				System.out.println("Voçê escolheu multiplicação: " + total);
				break;
			default:
				System.out.println("Operação Invalida ");
			}

			if (total > 0) {
				System.out.println("Seu resultado é maior que zero: " + total);

				if (total % 2 == 0) {
					System.out.println("Seu resultado é par: " + total);
				} else {
					System.out.println("Seu resultado é impar: " + total);
				}

			} else if(total == 0){
				System.out.println("Seu resultado é igual a zero: " + total);
			}else {

				if (total % 2 == 0) {
					System.out.println("Seu resultado é par: " + total);
				} else {
					System.out.println("Seu resultado é impar: " + total);
				}

				System.out.println("Seu resultado é menor que zero: " + total);
			}

		} while (soma != -999);
		System.out.println("Seu programa acaba aqui!!!!");

		entrada.close();
	}

}
